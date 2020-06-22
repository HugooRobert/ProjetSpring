package com.example.servingwebcontent;

import com.example.servingwebcontent.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ServingWebContentApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(ServingWebContentApplication.class);

    Contact c1 = new Contact("Francis","Lalane");
    Contact c2 = new Contact("Michel","Sardou");
    Contact c3 = new Contact("Ezechiel","Samussa");
    Contact c4 = new Contact("Morey","Ruslof");
    Contact c5 = new Contact("Maggy","Histolace");
    Adresse Ad1 = new Adresse("Sarry", "51110", "11", "rue des potiers");
    Adresse Ad2 = new Adresse("Reims", "52000", "12", "rue des solsies");
    Adresse Ad3 = new Adresse("Chalons", "54710", "41", "rue des dolers");
    Adresse Ad4 = new Adresse("Paris","93000","177", "boulevard de la Paix");
    Email e1 = new Email("email1@gmail.com");
    Email e2 = new Email("email2@gmail.com");
    Email e3 = new Email("email3@gmail.com");
    Email e4 = new Email("email4@gmail.com");




    List<Contact> GENS = Arrays.asList(c1, c2, c3, c4, c5);
    List<Adresse> ADRESSE = Arrays.asList(Ad1,Ad2,Ad3,Ad4);
    List<Email> EMAIL = Arrays.asList(e1, e2, e3, e4);

    @Autowired
    ContactRepository crr;

    @Autowired
    EmailRepository err;

    @Autowired
    AdresseRepository arr;
    public static void main(String[] args) {
        SpringApplication.run(ServingWebContentApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        crr.saveAll(GENS);
        arr.saveAll(ADRESSE);
        err.saveAll(EMAIL);


        Contact test = crr.findById(1);
        test.getAdresses().add(arr.findById(6L));
        test.getAdresses().add(arr.findById(7L));
        crr.save(test);

        Contact test1 = crr.findById(2);
        test1.getAdresses().add(arr.findById(6L));
        crr.save(test1);


        Email e = err.findById(10L);
        e.setContact(crr.findById(1L));
        err.save(e);
        e = err.findById(11L);
        e.setContact(crr.findById(1L));
        err.save(e);
        e = err.findById(12L);
        e.setContact(crr.findById(2L));
        err.save(e);


//        e = err.findById(10L);
//        e.setContact(crr.findById(2L));
//        err.save(e);
    }

}