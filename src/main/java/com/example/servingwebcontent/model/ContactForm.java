package com.example.servingwebcontent.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ContactForm {
    @NotNull
    @Size(min=2, max=30)
    private String firstName;

    @NotNull
    @Size(min=2, max=30)
    private String lastName;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "Contact(FirstName: " + this.firstName + ", LastName: " + this.lastName + ")";
    }
}
