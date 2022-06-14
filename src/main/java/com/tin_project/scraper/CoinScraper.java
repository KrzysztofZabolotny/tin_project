package com.tin_project.scraper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tin_project.entity.Coin;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class CoinScraper {
  private final String API_KEY = "904b189c-2820-4567-8416-2830961ddeea";
  private final String START = "1";
  private final String LIMIT = "10";
  private final String CURRENCY = "NOK";

  public List<Coin> scrape() {
    String uri = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest";
    List<NameValuePair> parameters = new ArrayList<>();
    parameters.add(new BasicNameValuePair("start", START));
    parameters.add(new BasicNameValuePair("limit", LIMIT));
    parameters.add(new BasicNameValuePair("convert", CURRENCY));
    List<Coin> coins = new ArrayList<>();

    try {
      String result = makeAPICall(uri, parameters);

      ObjectMapper om = new ObjectMapper();
      ScraperPackage scraperPackage = om.readValue(result, ScraperPackage.class);


      for (Data d : scraperPackage.data) {
        coins.add(new Coin(d.getName(), d.getSymbol(), d.quote.nOK.getPrice(), CURRENCY));
        System.out.println(d);
      }


    } catch (IOException e) {
      System.out.println("Error: cannot access content - " + e);
    } catch (URISyntaxException e) {
      System.out.println("Error: Invalid URL " + e);
    }

    //coins.sort(Comparator.comparing(Coin::getName));
    return coins;
  }

  public static String makeAPICall(String uri, List<NameValuePair> parameters)
          throws URISyntaxException, IOException {
    String response_content = "";

    URIBuilder query = new URIBuilder(uri);
    query.addParameters(parameters);

    CloseableHttpClient client = HttpClients.createDefault();
    HttpGet request = new HttpGet(query.build());

    request.setHeader(HttpHeaders.ACCEPT, "application/json");
    request.addHeader("X-CMC_PRO_API_KEY", new CoinScraper().API_KEY);

    CloseableHttpResponse response = client.execute(request);

    try {
      HttpEntity entity = response.getEntity();
      response_content = EntityUtils.toString(entity);
      EntityUtils.consume(entity);
    } finally {
      response.close();
    }

    return response_content;
  }

}