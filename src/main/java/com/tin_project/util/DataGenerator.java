package com.tin_project.util;

import com.tin_project.entity.History;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class DataGenerator {

  public static String generateName(int number) {
    List<String> names = new ArrayList<>(Arrays.asList("Bitcoin",
            "Ethereum",
            "Tether",
            "Binance USD",
            "Cardano",
            "XRP",
            "Solana",
            "Dogecoin",
            "Polkadot",
            "Dai",
            "Wrapped Bitcoin",
            "Unus Sed Leo",
            "Shiba Inu",
            "Litecoin",
            "Polygon",
            "Stellar",
            "Algorand",
            "Monero"));

    return names.get(number);
  }

  public static String generateSymbol(String name) {
    return name.substring(0, 3).toUpperCase(Locale.ROOT);
  }
  public static int generateRandomPrice(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
  }


  public static List<History> generateHistory() {


    List<History> history = new ArrayList<>();
    for (int i = 30; i >= 0; i--) {
      history.add(new History("Bitcoin",generateRandomPrice(10000,130000),generateDateBefore(i)));
    }
    return history;
  }

  public static int getToday(){
    String today = generateDateBefore(0);
    return Integer.parseInt(today.substring(today.length()-2));
  }

  public static String generateDateBefore(int daysBefore){

    String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String today = simpleDateFormat.format(new Date());



    LocalDate date = LocalDate.parse(today);
    LocalDate returnValue = date.minusDays(daysBefore);
    return returnValue.toString();
  }
}
