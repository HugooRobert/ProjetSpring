package com.example.servingwebcontent;

import com.example.servingwebcontent.model.Contact;
import com.example.servingwebcontent.model.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class GreetingController {

    @Autowired
    private ContactRepository contactRepository;

    @ModelAttribute("contacts")
    public Iterable<Contact> getContact(){
        return contactRepository.findAll();
    }

    @GetMapping("/listContacts")
    public String showContact(){
        return "listContacts";
    }

}