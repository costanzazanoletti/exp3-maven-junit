package shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {

  private BigDecimal price;
  private BigDecimal vat;
  private String name;
  private int code;

  public Product(BigDecimal price, BigDecimal vat, String name, int code)
      throws IllegalArgumentException {
    if (price.compareTo(new BigDecimal(0)) < 0) {
      throw new IllegalArgumentException("price < 0");
    }
    if (vat.compareTo(new BigDecimal(0)) < 0) {
      throw new IllegalArgumentException("vat < 0");
    }
    if (name == null) {
      throw new IllegalArgumentException("name null");
    }
    if (code < 0) {
      throw new IllegalArgumentException("code < 0");
    }
    this.price = price;
    this.vat = vat;
    this.name = name;
    this.code = code;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) throws IllegalArgumentException {
    if (price.compareTo(new BigDecimal(0)) < 0) {
      throw new IllegalArgumentException("price < 0");
    }
    this.price = price;
  }

  public BigDecimal getVat() {
    return vat;
  }

  public void setVat(BigDecimal vat) throws IllegalArgumentException {
    if (vat.compareTo(new BigDecimal(0)) < 0) {
      throw new IllegalArgumentException("price < 0");
    }
    this.vat = vat;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name == null) {
      throw new IllegalArgumentException("name null");
    }
    this.name = name;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    if (code < 0) {
      throw new IllegalArgumentException("code < 0");
    }
    this.code = code;
  }


  public BigDecimal getFinalPrice() {
    return price.add(price.multiply(vat)).setScale(2, RoundingMode.HALF_EVEN);
  }

  @Override
  public String toString() {
    return "Product{" +
        "price=" + price +
        ", vat=" + vat +
        ", name='" + name + '\'' +
        ", code=" + code +
        '}';
  }
}
