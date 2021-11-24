package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student miriam = new Student(
                    "Miriam",
                    "abc",
                    "miriagm@mail.com"
            );

            Student alex = new Student(
                    "alex",
                    "pqr",
                    "alex@mail.com"
            );

            repository.saveAll(
                    List.of(miriam, alex)
            );
        };
    }
}
