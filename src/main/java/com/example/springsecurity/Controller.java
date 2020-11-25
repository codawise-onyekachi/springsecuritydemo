package com.example.springsecurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class Controller  implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry viewControllerRegistry){
        viewControllerRegistry.addViewController("/home").setViewName("home");
        viewControllerRegistry.addViewController("/").setViewName("home");
        viewControllerRegistry.addViewController("/school").setViewName("school");
        viewControllerRegistry.addViewController("/login").setViewName("login");
    }
}
