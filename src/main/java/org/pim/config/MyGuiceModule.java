package org.pim.config;

import com.google.inject.AbstractModule;
import org.pim.service.BookService;
import org.pim.service.BookServiceImpl;

public class MyGuiceModule extends AbstractModule {
    protected void configure() {
        bind(BookService.class).to(BookServiceImpl.class);
    }
}
