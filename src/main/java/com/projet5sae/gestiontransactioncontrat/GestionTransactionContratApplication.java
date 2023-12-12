package com.projet5sae.gestiontransactioncontrat;

import com.projet5sae.gestiontransactioncontrat.entities.Transaction;
import com.projet5sae.gestiontransactioncontrat.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class GestionTransactionContratApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionTransactionContratApplication.class, args);
    }

    @Autowired
    private TransactionRepository repo;

    @Bean
    ApplicationRunner init() {
        return(args) ->{
            repo.save(new Transaction(11, 12.25F,null,null,null));

            repo.findAll().forEach(System.out::println);
        };
    }
}
