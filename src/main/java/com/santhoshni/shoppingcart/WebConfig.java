package com.santhoshni.shoppingcart;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // @Override
    // public void addViewControllers(ViewControllerRegistry registry) {
    //     registry.addViewController("/").setViewName("home");
    // }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
            .addResourceHandler("/media/**")
            //.addResourceLocations("file:/Y:/LC101-Java/LiftOff/shoppingcart/target/classes/static/media/");
            .addResourceLocations("file:/Y:/LC101-Java/LiftOff/shoppingcart/src/main/resources/static/media/");
    }
    
}
