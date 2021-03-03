package se.lexicon.jpaworkshop.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ProductTest {
    private Product product = new Product();


    @Test
    public void test_setter_and_getters() {
        product.setId(1);
        product.setName("TestProductName");
        product.setPrice(200);
        Assertions.assertEquals(1, product.getId());
        Assertions.assertEquals("TestProductName", product.getName());
        Assertions.assertEquals(200, product.getPrice());
    }

}
