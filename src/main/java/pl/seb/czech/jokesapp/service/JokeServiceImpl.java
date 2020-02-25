package pl.seb.czech.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    private final ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
    
    public String getJoke() {
        return quotes.getRandomQuote();
    }
    
}
