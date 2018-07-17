package lucky.springframework.dependecyinjection;

import lucky.springframework.dependecyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependecyinjectionApplication {

    public static void main(String[] args)
    {
        ConfigurableApplicationContext ctx = SpringApplication.run(DependecyinjectionApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");
        controller.func();
    }
}
