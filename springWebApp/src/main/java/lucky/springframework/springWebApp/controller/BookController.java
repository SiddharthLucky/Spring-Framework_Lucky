package lucky.springframework.springWebApp.controller;

import lucky.springframework.springWebApp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController
{

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository)//Injects the instance of the book repo that is created
    {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model)
    {
        model.addAttribute("books", bookRepository.findAll()); //Name is same as the one of the HTML file.
        return "books";
    }
}
