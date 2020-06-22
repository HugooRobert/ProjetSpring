package com.example.servingwebcontent.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="contacts")
public class ContactListXML implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Contact> contact = new ArrayList<>();

    public List<Contact> getContact() { return contact; }

    public void setContact(List<Contact> contact) { this.contact = contact; }

}
