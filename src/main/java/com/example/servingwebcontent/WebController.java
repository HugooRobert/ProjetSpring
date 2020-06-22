////package com.example.servingwebcontent;
////
////import javax.management.Query;
////import javax.validation.Valid;
////
////import com.example.servingwebcontent.model.*;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Controller;
////import org.springframework.ui.Model;
////import org.springframework.validation.BindingResult;
////import org.springframework.web.bind.annotation.*;
////import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
////import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
////
////
////@Controller
////public class WebController implements WebMvcConfigurer {
////
////    @Override
////    public void addViewControllers(ViewControllerRegistry registry) {
////        registry.addViewController("/results").setViewName("results");
////    }
////
////    @GetMapping("/form")
////    public String showForm(ContactForm contactForm) {
////        return "form";
////    }
////
////    @Autowired ContactRepository cr;
////
////    @PostMapping("/form")
////    public String checkPersonInfo(@Valid ContactForm contactForm, BindingResult bindingResult) {
////
////        if (bindingResult.hasErrors()) {
////            return "form";
////        }
////
////        cr.save(new Contact(contactForm.getFirstName(), contactForm.getLastName()));
////
////        return "redirect:/listContacts";
////    }
////
////    long temp;
////
////    @GetMapping("/update")
////    public String showModification(ContactForm contactForm, @RequestParam(value="id", required = false, defaultValue = "-1") String x) {
////        if(cr.existsById(Long.parseLong(x)) == false){
////            return "redirect:/listContacts";
////        }
////        temp = (Long.parseLong(x));
////
////        return "update";
////    }
////
////    @PostMapping("/update")
////    public String modifierContact(@Valid ContactForm contactForm, BindingResult bindingResult) {
////
////        if (bindingResult.hasErrors()) {
////            return "form";
////        }
////
////        Contact contact = cr.findById(temp);
////        contact.setFirstName(contactForm.getFirstName());
////        contact.setLastName(contactForm.getLastName());
////        cr.save(contact);
////
////        return "redirect:/listContacts";
////    }
////
////    @GetMapping("/delete")
////    public String deleteContact(ContactForm contactForm, @RequestParam(value="id", required = false, defaultValue = "-1") String x) {
////        if(cr.existsById(Long.parseLong(x)) == false){
////            return "redirect:/listContacts";
////        }
////        cr.deleteById(Long.parseLong(x));
////
////        return "redirect:/listContacts";
////    }
////
////    @Autowired
////    private AdresseRepository adresseRepository;
////
////
////    @GetMapping("/adresses")
////    public String showContact(@RequestParam(value="id", required = false, defaultValue = "-1") String x, Model model){
////        Iterable<Adresse> ad = cr.findById(Long.parseLong(x)).getAdresses();
////        model.addAttribute("adresses", ad);
////        return "adresses";
////    }
////
////    @Autowired
////    private EmailRepository emailRepository;
////
////    @GetMapping("/emails")
////    public String showEmail(@RequestParam(value="id", required = false, defaultValue = "-1") String x, Model model){
////        Iterable<Email> em = cr.findById(Long.parseLong(x)).getEmails();
////        model.addAttribute("emails", em);
////        return "emails";
////    }
////}
//
//package com.example.servingwebcontent;
//
//import javax.management.Query;
//import javax.validation.Valid;
//
//import com.example.servingwebcontent.model.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//
//@Controller
//public class WebController implements WebMvcConfigurer {
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/results").setViewName("results");
//    }
//
//    @GetMapping("/form")
//    public String showForm(ContactForm contactForm) {
//        return "form";
//    }
//
//    @Autowired ContactRepository cr;
//
//    @PostMapping("/form")
//    public String checkPersonInfo(@Valid ContactForm contactForm, BindingResult bindingResult) {
//
//        if (bindingResult.hasErrors()) {
//            return "form";
//        }
//
//        cr.save(new Contact(contactForm.getFirstName(), contactForm.getLastName()));
//
//        return "redirect:/listContacts";
//    }
//
//    long temp;
//
//    @GetMapping("/update")
//    public String showModification(ContactForm contactForm, @RequestParam(value="id", required = false, defaultValue = "-1") String x) {
//        if(cr.existsById(Long.parseLong(x)) == false){
//            return "redirect:/listContacts";
//        }
//        temp = (Long.parseLong(x));
//
//        return "update";
//    }
//
//    @PostMapping("/update")
//    public String modifierContact(@Valid ContactForm contactForm, BindingResult bindingResult) {
//
//        if (bindingResult.hasErrors()) {
//            return "form";
//        }
//
//        Contact contact = cr.findById(temp);
//        contact.setFirstName(contactForm.getFirstName());
//        contact.setLastName(contactForm.getLastName());
//        cr.save(contact);
//
//        return "redirect:/listContacts";
//    }
//
//    @GetMapping("/delete")
//    public String deleteContact(ContactForm contactForm, @RequestParam(value="id", required = false, defaultValue = "-1") String x) {
//        if(cr.existsById(Long.parseLong(x)) == false){
//            return "redirect:/listContacts";
//        }
//        cr.deleteById(Long.parseLong(x));
//
//        return "redirect:/listContacts";
//    }
//
//    @Autowired
//    private AdresseRepository adresseRepository;
//
//
//    @GetMapping("/adresses")
//    public String showContact(@RequestParam(value="id", required = false, defaultValue = "-1") String x, Model model){
//        Iterable<Adresse> ad = cr.findById(Long.parseLong(x)).getAdresses();
//        model.addAttribute("adresses", ad);
//        return "adresses";
//    }
//
//    @Autowired
//    private EmailRepository emailRepository;
//
//    @GetMapping("/emails")
//    public String showEmail(@RequestParam(value="id", required = false, defaultValue = "-1") String x, Model model){
//        Iterable<Email> em = cr.findById(Long.parseLong(x)).getEmails();
//        model.addAttribute("emails", em);
//        return "emails";
//    }
//}

//package com.example.servingwebcontent;
//
//import javax.management.Query;
//import javax.validation.Valid;
//
//import com.example.servingwebcontent.model.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//
//@Controller
//public class WebController implements WebMvcConfigurer {
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/results").setViewName("results");
//    }
//
//    @GetMapping("/form")
//    public String showForm(ContactForm contactForm) {
//        return "form";
//    }
//
//    @Autowired ContactRepository cr;
//
//    @PostMapping("/form")
//    public String checkPersonInfo(@Valid ContactForm contactForm, BindingResult bindingResult) {
//
//        if (bindingResult.hasErrors()) {
//            return "form";
//        }
//
//        cr.save(new Contact(contactForm.getFirstName(), contactForm.getLastName()));
//
//        return "redirect:/listContacts";
//    }
//
//    long temp;
//
//    @GetMapping("/update")
//    public String showModification(ContactForm contactForm, @RequestParam(value="id", required = false, defaultValue = "-1") String x) {
//        if(cr.existsById(Long.parseLong(x)) == false){
//            return "redirect:/listContacts";
//        }
//        temp = (Long.parseLong(x));
//
//        return "update";
//    }
//
//    @PostMapping("/update")
//    public String modifierContact(@Valid ContactForm contactForm, BindingResult bindingResult) {
//
//        if (bindingResult.hasErrors()) {
//            return "form";
//        }
//
//        Contact contact = cr.findById(temp);
//        contact.setFirstName(contactForm.getFirstName());
//        contact.setLastName(contactForm.getLastName());
//        cr.save(contact);
//
//        return "redirect:/listContacts";
//    }
//
//    @GetMapping("/delete")
//    public String deleteContact(ContactForm contactForm, @RequestParam(value="id", required = false, defaultValue = "-1") String x) {
//        if(cr.existsById(Long.parseLong(x)) == false){
//            return "redirect:/listContacts";
//        }
//        cr.deleteById(Long.parseLong(x));
//
//        return "redirect:/listContacts";
//    }
//
//    @Autowired
//    private AdresseRepository adresseRepository;
//
//
//    @GetMapping("/adresses")
//    public String showContact(@RequestParam(value="id", required = false, defaultValue = "-1") String x, Model model){
//        Iterable<Adresse> ad = cr.findById(Long.parseLong(x)).getAdresses();
//        model.addAttribute("adresses", ad);
//        return "adresses";
//    }
//
//    @Autowired
//    private EmailRepository emailRepository;
//
//    @GetMapping("/emails")
//    public String showEmail(@RequestParam(value="id", required = false, defaultValue = "-1") String x, Model model){
//        Iterable<Email> em = cr.findById(Long.parseLong(x)).getEmails();
//        model.addAttribute("emails", em);
//        return "emails";
//    }
//}

package com.example.servingwebcontent;

import javax.management.Query;
import javax.validation.Valid;

import com.example.servingwebcontent.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Controller
public class WebController implements WebMvcConfigurer {

    @Autowired ContactRepository cr;
    @Autowired AdresseRepository adresseRepository;
    @Autowired EmailRepository emailRepository;


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // registry.addViewController("/").setViewName("index");
        registry.addViewController("/listContacts").setViewName("listContacts");
        registry.addViewController("/login").setViewName("login");
    }

    @GetMapping("/form")
    public String showForm(ContactForm contactForm) {
        return "form";
    }

    @PostMapping("/form")
    public String checkPersonInfo(@Valid ContactForm contactForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }

        cr.save(new Contact(contactForm.getFirstName(), contactForm.getLastName()));

        return "redirect:/listContacts";
    }

    String temmmp;
    @GetMapping("/formAdresse")
    public String showFormAdresse(AdresseForm adresseForm, @RequestParam(value="id", required = false, defaultValue = "-1") String x) {
        temmmp = x;
        return "formAdresse";
    }

    @PostMapping("/formAdresse")
    public String checkAdresseInfo(@Valid AdresseForm adresseForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "formAdresse";
        }
        try {
            Adresse a = new Adresse(adresseForm.getVille(), adresseForm.getCodePostal(), adresseForm.getNumeroRue(), adresseForm.getLibelleVoirie());
            adresseRepository.save(a);

            Contact c = cr.findById(Long.parseLong(temmmp));
            c.getAdresses().add(a);
            cr.save(c);

        } catch(Exception e){
        }
        return "redirect:/listContacts";
    }

    long temp;

    @GetMapping("/update")
    public String showModification(ContactForm contactForm, @RequestParam(value="id", required = false, defaultValue = "-1") String x) {
        if(cr.existsById(Long.parseLong(x)) == false){
            return "redirect:/listContacts";
        }
        temp = (Long.parseLong(x));

        return "update";
    }

    @PostMapping("/update")
    public String modifierContact(@Valid ContactForm contactForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }

        Contact contact = cr.findById(temp);
        contact.setFirstName(contactForm.getFirstName());
        contact.setLastName(contactForm.getLastName());
        cr.save(contact);

        return "redirect:/listContacts";
    }

    @GetMapping("/delete")
    public String deleteContact(ContactForm contactForm, @RequestParam(value="id", required = false, defaultValue = "-1") String x) {
        if(cr.existsById(Long.parseLong(x)) == false){
            return "redirect:/listContacts";
        }
        cr.deleteById(Long.parseLong(x));

        return "redirect:/listContacts";
    }




    @GetMapping("/adresses")
    public String showContact(@RequestParam(value="id", required = false, defaultValue = "-1") String x, Model model){
        Contact c = cr.findById(Long.parseLong(x));
        model.addAttribute("contact", c);
        return "adresses";
    }



    @GetMapping("/emails")
    public String showEmail(@RequestParam(value="id", required = false, defaultValue = "-1") String x, Model model){
        Iterable<Email> em = cr.findById(Long.parseLong(x)).getEmails();
        model.addAttribute("emails", em);
        return "emails";
    }

    @RequestMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody
    ContactListXML apiXML(@RequestParam(value = "id", required = false, defaultValue = "0") String x, @RequestParam(value ="action", required = false, defaultValue = "getContact") String action) {
        ContactListXML contact = new ContactListXML();


        if (action.equals("listContacts")) {
            for (Contact c : cr.findAll()) {
                c.setAdresses(null);
                c.setEmails(null);
                contact.getContact().add(c);
            }
            return contact;
        }

        if (x.equals("0") && action.equals("getContact")){
            for(Contact c : cr.findAll()){
                contact.getContact().add(c);
            }
            return contact;
        } else if(!x.equals("0") && action.equals("getContact")) {
            contact.getContact().add(cr.findById(Long.parseLong(x)));
            return contact;
        }

        if (action.equals("delContact") && !x.equals("0")) {
            if(cr.existsById(Long.parseLong(x))){
                cr.deleteById(Long.parseLong(x));
            }
        }

        return null;
    }
}