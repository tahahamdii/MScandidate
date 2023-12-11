package com.microservices.candidate;

import com.microservices.candidate.entity.Candidat;
import com.microservices.candidate.repo.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CandidateApplication {

    public static void main(String[] args) {
        SpringApplication.run(CandidateApplication.class, args);
    }
    @Autowired
    private CandidatRepository repo ;

    @Bean
    ApplicationRunner init() {
        return (args) -> {
            repo.save(new Candidat("mariem","mm@es","d"));
            repo.save(new Candidat("mariem","mm@d","d"));
            repo.save(new Candidat("mariem","mm@a","d"));

            repo.findAll().forEach(System.out::println);
        };
    }
}
