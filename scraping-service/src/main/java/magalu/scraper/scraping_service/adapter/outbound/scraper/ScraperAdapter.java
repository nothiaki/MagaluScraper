package magalu.scraper.scraping_service.adapter.outbound.scraper;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import magalu.scraper.scraping_service.domain.Product;

public class ScraperAdapter implements ScraperPort {

  public ScraperAdapter() {}

  @Override
  public void scrap() {
    String uri = "https://www.magazineluiza.com.br/selecao/ofertasdodia/?page=";
    String productsContainerId = "ul[data-testid=list]";

    int i = 1;

    while(true) {
      try {
        List<Product> products = new ArrayList<>();
        Document document = Jsoup.connect(uri + i).get();
        System.out.println(document);

        Element productsElement = document.select(productsContainerId).first();

        if(productsElement == null) {
          break;
        }

        for (Element element : productsElement) { // verify this for
          System.out.println(element);
          Element title = document.select("h2").first();
          System.out.println(title);

          Product product = new Product.Builder()
            .title("title")
            .rating(5.0f)
            .reviewCount(200)
            .originalPrice(15000L)
            .discountedPriceWithPix(10000L)
            .pixDiscountPercent(10)
            .build();

          products.add(product);

        }

        i++;
      } catch (Exception e) {
        e.printStackTrace();
        throw new RuntimeException(e);
      }
    }

  }

}
