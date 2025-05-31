package magalu.scraper.scraping_service;

import magalu.scraper.scraping_service.adapter.outbound.scraper.ScraperAdapter;
import magalu.scraper.scraping_service.application.usecase.ScraperSchedulerUseCase;

public class ScrapingServiceApplication {

	public static void main(String[] args) {
    new ScraperSchedulerUseCase(
      new ScraperAdapter()
    ).exec();
	}

}
