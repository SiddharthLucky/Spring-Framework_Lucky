package lucky.springframework.jokesapplication.controllers;

import lucky.springframework.jokesapplication.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController
{
    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model)
    {
        model = model.addAttribute("joke", jokeService.getJoke()); //The result is stored in the variable, use this in the HTML Page.
        return "ChuckNorrisView"; //Place the value of the name to return to, aka the HTMl page
    }
}
