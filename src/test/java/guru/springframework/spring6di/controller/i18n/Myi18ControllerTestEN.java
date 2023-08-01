package guru.springframework.spring6di.controller.i18n;

import guru.springframework.spring6di.controller.Myi18Controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
@ActiveProfiles("EN")
@SpringBootTest
class Myi18ControllerTestEN {

    @Autowired
    Myi18Controller myi18Controller;
    @Test
    void sayHello() {
        System.out.println(myi18Controller.sayHello());
    }
}