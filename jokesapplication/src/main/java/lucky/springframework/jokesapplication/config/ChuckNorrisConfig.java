package lucky.springframework.jokesapplication.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckNorrisConfig
{
    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes()
    {
        return new ChuckNorrisQuotes();
        //You can do this instead of creating a new instance in the service class.
        //Instantiated object can be wired through the constructor.
        //This format can be used when we get in a dependency which someone owns and use it in our code.
    }
}
