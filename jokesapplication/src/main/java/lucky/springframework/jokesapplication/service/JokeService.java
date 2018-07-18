package lucky.springframework.jokesapplication.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import lucky.springframework.jokesapplication.config.ChuckNorrisConfig;
import org.springframework.stereotype.Service;

@Service
public class JokeService
{
    public final ChuckNorrisQuotes cJokes;

    public JokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.cJokes = chuckNorrisQuotes;
    }

    public String getJoke()
    {
        return cJokes.getRandomQuote();
    }
}