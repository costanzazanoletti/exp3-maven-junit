package shop;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {

  Product product = null;

  @BeforeEach
  void init() {
    System.out.println("init before each");
    product = new Product(new BigDecimal("100.00"), new BigDecimal("0.2"), "My product", 5);
  }

  @Test
  void setPrice() {
    assertThrows(IllegalArgumentException.class,
        () -> product.setPrice(new BigDecimal("-10")));
    product.setPrice(new BigDecimal("10.00"));
    assertEquals(new BigDecimal(("10.00")), product.getPrice());
  }

  @Test
  void setVat() {
  }

  @Test
  void setName() {
  }

  @Test
  void setCode() {
  }

  @Test
  void getFinalPrice() {
    assertTrue(new BigDecimal("120.00").equals(product.getFinalPrice()));
    //assertFalse(new BigDecimal("120.00").equals(product.getFinalPrice()));
  }

  @Test
  void otherTest() {

  }
}