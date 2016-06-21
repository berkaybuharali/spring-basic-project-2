package org.pim.servlet;

import org.pim.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;

@Controller
public class MyController {

    @Inject
    BookService bookService;

    @RequestMapping("/books")
    public ModelAndView booksList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("books", bookService.getBooks());
        return modelAndView;
    }

    @RequestMapping("book/{title}")
    public ModelAndView book(@PathVariable String title) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("book");
        modelAndView.addObject("book", title);
        return modelAndView;
    }
}
