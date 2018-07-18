package lucky.springframework.jokesapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-norris.xml")
public class JokesapplicationApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokesapplicationApplication.class, args);
    }
}
