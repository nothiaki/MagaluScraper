package magalu.scraper.scraping_service.adapter.outbound.scraper;

public class ScraperAdapter implements ScraperPort {

  public ScraperAdapter() {}

  @Override
  public void scrap() {
    System.out.println("scraping");
  }

}
