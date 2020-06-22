package com.example.servingwebcontent.model;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Email implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(unique=true)
    private String email;

    protected Email() {}

    public Email(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(
                "Email[id=%d, email='%s']",
                id, email);
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @ManyToOne
    @JoinColumn(name="contact_fk")
    private Contact contact;

    public void setId(Long id) {
        this.id = id;
    }

    @XmlTransient
    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
