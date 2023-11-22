package codes.manon.config;

import codes.manon.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

    // the method to add beans in the Spring context, should be the bean's name
    // often this is the same name as the class
    @Bean
    Parrot parrot() {
        return new Parrot("Koko");
    }

    @Bean(name="Kiki")
    Parrot parrot2() {
        return new Parrot("Kiki");
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    String goodbye() {
        return "Goodbye";
    }

    @Bean (value ="coffee")
    String coffee() {
        return "coffee";
    }

    @Bean
    Integer ten() {
        return 10;
    }

    @Bean("eleven")
    Integer eleven() {
        return 11;
    }
}
