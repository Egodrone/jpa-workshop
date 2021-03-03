package se.lexicon.jpaworkshop.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class AppUserTest {

    private AppUser appUser = new AppUser();


    @Test
    public void test_setter_and_getters() {
        appUser.setId(1);
        appUser.setFirstName("Test");
        appUser.setLastName("lastNameTest");
        appUser.setEmail("test@gmail.com");
        Assertions.assertEquals(1, appUser.getId());
    }


}
