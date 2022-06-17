package com.tin_project.scraper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tin_project.entity.Coin;
import com.tin_project.util.DataGenerator;
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
import java.util.List;


public class CoinScraper {
  private final String API_KEY = "d37834a6-0ce0-4d39-8de7-7d7b8420470c";
  private final String START = "1";
  private final String LIMIT = "10";
  private final String CURRENCY = "NOK";

  public List<Coin> scrape() {
    String uri = "https://sandbox-api.coinmarketcap.com/v1/cryptocurrency/listings/latest";
    //TODO String uri = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest"; was working 15.06.2022 bun now throws unknown error

    List<NameValuePair> parameters = new ArrayList<>();
    parameters.add(new BasicNameValuePair("start", START));
    parameters.add(new BasicNameValuePair("limit", LIMIT));
    parameters.add(new BasicNameValuePair("convert", CURRENCY));
    List<Coin> coins = new ArrayList<>();

    try {
      String result = makeAPICall(uri, parameters);

      ObjectMapper om = new ObjectMapper();
      ScraperPackage scraperPackage = om.readValue(result, ScraperPackage.class);

      int counter = 0;

      for (Data d : scraperPackage.data) {
        String name = DataGenerator.generateName(counter);
        String symbol = DataGenerator.generateSymbol(name);

        coins.add(new Coin(name, symbol, d.quote.nOK.getPrice(), CURRENCY));
        counter++;
      }


    } catch (IOException e) {
      System.out.println("Error: cannot access content - " + e);
    } catch (URISyntaxException e) {
      System.out.println("Error: Invalid URL " + e);
    }

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