package lucky.springframework.springWebApp.controller;

import lucky.springframework.springWebApp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Always add this at the beginning
public class AuthorController
{
    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository)
    {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model)
    {
        model.addAttribute("authors", authorRepository.findAll());
        //model.addAttribute("authors", test()); You can also call your own custom function using this way.
        return "authors";
    }

    private int test()
    {
        int a = 5,b = 10, c = 0;
        c = a+b;
        return c;
    }
}
