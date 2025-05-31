package magalu.scraper.scraping_service.application.usecase;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import magalu.scraper.scraping_service.adapter.outbound.scraper.ScraperPort;

public class ScraperSchedulerUseCase {

  ScraperPort scraperPort;

  public ScraperSchedulerUseCase(ScraperPort scraperPort) {
    this.scraperPort = scraperPort;
  }

  public void exec() {
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    Runnable task = () -> {
      System.out.println("Started at " + LocalDateTime.now());

      scraperPort.scrap();

      System.out.println("Finished at " + LocalDateTime.now());
    };

    scheduler.scheduleAtFixedRate(task, 0, 1, TimeUnit.MINUTES);
  }

}
