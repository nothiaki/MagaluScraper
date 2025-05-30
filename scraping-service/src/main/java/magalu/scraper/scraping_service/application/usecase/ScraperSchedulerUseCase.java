package magalu.scraper.scraping_service.application.usecase;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScraperSchedulerUseCase {

  public static void exec() {
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    Runnable task = () -> {
      System.out.println("Exec at" + java.time.LocalTime.now());
    };

    scheduler.scheduleAtFixedRate(task, 0, 1, TimeUnit.MINUTES);
  }

}
