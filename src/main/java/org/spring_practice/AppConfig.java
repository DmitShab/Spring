package org.spring_practice;

import net.datafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;

@Configuration
@ComponentScan("org.spring_practice")
public class AppConfig {
    @Bean
    public Faker faker() {
        return new Faker(Locale.of("ru"));
    }
}