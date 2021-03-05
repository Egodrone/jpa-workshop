package se.lexicon.jpaworkshop.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class AppUserTest {

    AppUser testObject;


    @BeforeEach
    public void setup() {
        testObject = new AppUser();
    }


    @Test
    @DisplayName("Test of setters and getters")
    public void test_setter_and_getters() {
        testObject.setId(1);
        testObject.setFirstName("Test");
        testObject.setLastName("lastNameTest");
        testObject.setEmail("test@gmail.com");

        Assertions.assertEquals(1, testObject.getId());
        Assertions.assertEquals("Test", testObject.getFirstName());
        Assertions.assertEquals("lastNameTest", testObject.getLastName());
        Assertions.assertEquals("test@gmail.com", testObject.getEmail());
    }


}
