package org.pim.servlet;

import org.pim.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/book/{title}")
    public ModelAndView book(@PathVariable String title) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("book");
        modelAndView.addObject("book", title);
        return modelAndView;
    }

    @RequestMapping(value = "{book}/chk", method = RequestMethod.POST)
    public ModelAndView book(@PathVariable String book, @RequestParam String quantity) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("chk");
        modelAndView.addObject("book", book);
        modelAndView.addObject("quantity", quantity);
        return modelAndView;
    }

    @RequestMapping("pdf")
    public ModelAndView pdfCreator() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("mypdf");
        modelAndView.addObject("message", "Buy");
        return modelAndView;
    }
}
