package de.anhquan.deutschlernen;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan(basePackages={"de.anhquan.deutschlernen"})
@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("List of beans provided by Spring Boot");

            String[] names = ctx.getBeanDefinitionNames();
            Arrays.sort(names);
            for (String name : names) {
                System.out.println("name = " + name);
            }
        };
    }
}
