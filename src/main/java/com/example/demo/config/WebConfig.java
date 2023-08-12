package com.example.demo.config;

import com.example.demo.converters.NameConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(namesConverter());
    }

    @Bean
    public NameConverter namesConverter() {
        return new NameConverter();
    }
}
