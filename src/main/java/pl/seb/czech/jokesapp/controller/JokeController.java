package pl.seb.czech.jokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.seb.czech.jokesapp.service.JokeService;

@Controller
@RequestMapping("chucknorris")
public class JokeController {
    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    
    @RequestMapping("joke")
    public String getJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
    
    
}
