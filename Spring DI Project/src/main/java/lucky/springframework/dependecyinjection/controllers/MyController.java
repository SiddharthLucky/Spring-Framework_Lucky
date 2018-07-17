package lucky.springframework.dependecyinjection.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController
{
    public void func()
    {
        System.out.println("Hello World");
    }
}
