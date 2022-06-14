package com.tin_project.scheduler;

import com.tin_project.repository.CoinRepository;
import com.tin_project.scraper.CoinScraper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class ScrapingScheduler {
  @Autowired
  private CoinRepository coinRepository;


  //@Scheduled(fixedDelay = 86400000)
  private void scheduledScrape() {
    CoinScraper coinScraper = new CoinScraper();
    coinRepository.saveAll(coinScraper.scrape());
  }
}
