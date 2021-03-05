package se.lexicon.jpaworkshop.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ProductTest {
    Product testObject;


    @BeforeEach
    public void setup() {
        testObject = new Product(1,"testProductName", 200);
    }


    @Test
    @DisplayName("Test of setters and getters")
    public void test_setter_and_getters() {
        Assertions.assertEquals(1, testObject.getId());
        Assertions.assertEquals("testProductName", testObject.getName());
        Assertions.assertEquals(200, testObject.getPrice());
    }


}
