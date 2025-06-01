package magalu.scraper.scraping_service.domain;

public class Product {

  private String title;
  private float rating;
  private int reviewCount;
  private Long originalPrice;
  private Long discountedPriceWithPix;
  private int pixDiscountPercent;

  private Product(Builder builder) {
    this.title = builder.title;
    this.rating = builder.rating;
    this.reviewCount = builder.reviewCount;
    this.originalPrice = builder.originalPrice;
    this.discountedPriceWithPix = builder.discountedPriceWithPix;
    this.pixDiscountPercent = builder.pixDiscountPercent;
  }

  public static class Builder {
    private String title;
    private float rating;
    private int reviewCount;
    private Long originalPrice;
    private Long discountedPriceWithPix;
    private int pixDiscountPercent;

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    public Builder rating(float rating) {
      this.rating = rating;
      return this;
    }

    public Builder reviewCount(int reviewCount) {
      this.reviewCount = reviewCount;
      return this;
    }

    public Builder originalPrice(Long originalPrice) {
      this.originalPrice = originalPrice;
      return this;
    }

    public Builder discountedPriceWithPix(Long discountedPriceWithPix) {
      this.discountedPriceWithPix = discountedPriceWithPix;
      return this;
    }

    public Builder pixDiscountPercent(int pixDiscountPercent) {
      this.pixDiscountPercent = pixDiscountPercent;
      return this;
    }

    public Product build() {
      return new Product(this);
    }

  }

}

