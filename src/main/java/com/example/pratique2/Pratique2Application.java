package com.example.pratique2;

import com.example.pratique2.entities.Patient;
import com.example.pratique2.repositories.PatientRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Pratique2Application  {



    public static void main(String[] args) {
        SpringApplication.run(Pratique2Application.class, args);
    }






    @Bean
    CommandLineRunner commandLineRunner(PatientRepositorie pr){
        return args -> {
            pr.save(new Patient(null,"amine",new Date(),false,20));
            pr.save(new Patient(null,"hassan2",new Date(),false,20));
            pr.save(new Patient(null,"amine2",new Date(),false,20));
            pr.save(new Patient(null,"amine3",new Date(),false,20));
            pr.save(new Patient(null,"amine4",new Date(),false,20));
            pr.save(new Patient(null,"amine5",new Date(),false,20));
            pr.save(new Patient(null,"amine6",new Date(),false,20));
            pr.save(new Patient(null,"amine7",new Date(),false,20));
            pr.save(new Patient(null,"amine8",new Date(),false,20));
            pr.save(new Patient(null,"amine9",new Date(),false,20));
            pr.save(new Patient(null,"hassan3",new Date(),false,20));
            pr.save(new Patient(null,"hassan4",new Date(),false,20));
            pr.save(new Patient(null,"hassan5",new Date(),false,20));
            pr.save(new Patient(null,"hassan6",new Date(),false,20));
            pr.save(new Patient(null,"amine7",new Date(),false,20));
            pr.save(new Patient(null,"amine99",new Date(),false,20));
            pr.save(new Patient(null,"amine",new Date(),false,20));
            pr.save(new Patient(null,"amine",new Date(),false,20));
            pr.save(new Patient(null,"amine",new Date(),false,20));
            pr.save(new Patient(null,"amine",new Date(),false,20));

            pr.findAll().forEach(p -> {
                System.out.println(p.getNom());
                System.out.println(p.getDate());
                System.out.println(p.isMalade());
                System.out.println(p.getScore());
            });
        };

    }





}

