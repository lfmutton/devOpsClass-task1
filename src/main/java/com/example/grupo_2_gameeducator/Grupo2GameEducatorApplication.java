package com.example.grupo_2_gameeducator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.hibernate.autoconfigure.HibernateJpaAutoConfiguration;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class Grupo2GameEducatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(Grupo2GameEducatorApplication.class, args);
        
    }

}
