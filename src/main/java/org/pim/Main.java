package org.pim;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.pim.config.ApplicationConfig;
import org.pim.config.MyGuiceModule;
import org.pim.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        BookService bookService = getBookServiceSpring();
        System.out.println(bookService.getBook("Berkay").getTitle());
    }


    private static BookService getBookServiceGuice() {
        Injector injector = Guice.createInjector(new MyGuiceModule());
        return injector.getInstance(BookService.class);
    }

    private static BookService getBookServiceSpring() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        return context.getBean(BookService.class);
    }
}
