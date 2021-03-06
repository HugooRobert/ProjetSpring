package com.example.servingwebcontent.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.transaction.Transactional;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Transactional
@XmlRootElement(name="contact")
public class Contact implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    protected Contact() {}

    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Contact[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

    @XmlElement
    public Long getId() {
        return id;
    }

    @XmlElement
    public String getFirstName() {
        return firstName;
    }

    @XmlElement
    public String getLastName() {
        return lastName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinTable(name="JOINTURE_ADRESSES")
    @JsonIgnoreProperties("contacts")
    private Collection<Adresse> adresses;

    @OneToMany(mappedBy = "contact", fetch = FetchType.EAGER,  cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SUBSELECT)
    private Collection<Email> emails;

    public Collection<Adresse> getAdresses() {
        return adresses;
    }

    public void setAdresses(Collection<Adresse> adresses) {
        this.adresses = adresses;
    }

    public Collection<Email> getEmails() {
        return emails;
    }

    public void setEmails(Collection<Email> email) {
        this.emails = email;
    }
}