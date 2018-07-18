package lucky.springframework.jokesapplication.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService
{
    public static ChuckNorrisQuotes cJokes;

    public JokeService() {
        this.cJokes = new ChuckNorrisQuotes();
    }

    public String getJoke()
    {
        return cJokes.getRandomQuote();
    }
}
