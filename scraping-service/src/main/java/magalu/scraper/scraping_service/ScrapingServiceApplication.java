package magalu.scraper.scraping_service;

import magalu.scraper.scraping_service.application.usecase.ScraperSchedulerUseCase;

public class ScrapingServiceApplication {

	public static void main(String[] args) {
    ScraperSchedulerUseCase.exec();
	}

}
