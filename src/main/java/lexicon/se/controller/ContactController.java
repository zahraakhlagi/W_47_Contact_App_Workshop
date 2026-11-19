package lexicon.se.controller;

import lexicon.se.data.ContactDAO;
import lexicon.se.model.Contact;
import lexicon.se.view.ContactView;

public class ContactController {

    private final ContactDAO contactDAO;
    private final ContactView contactView;

    public ContactController(ContactDAO contactDAO, ContactView contactView) {
        //error handling for null values
        if (contactDAO == null) {
            throw new IllegalArgumentException("ContactDAO must not be null");
        }
        if (contactView == null) {
            throw new IllegalArgumentException("ContactView must not be null");
        }
        
        this.contactDAO = contactDAO;
        this.contactView = contactView;
    }

    public void run() {
        boolean running = true;
        while (running) {
            contactView.displayMenu();
            String choice = contactView.getUserInput("Choose an option: ");

            try {
                switch (choice) {
                    case "1" -> contactView.displayContacts(contactDAO.findAll());
                    case "2" -> findContact();
                    case "3" -> addContact();
                    case "0" -> running = false;
                    default -> contactView.displayMessage("Unknown option, please try again.");
                }
            } catch (Exception e) {
                contactView.displayMessage(e.getMessage());
            }
        }
        contactView.displayMessage("Goodbye!");
    }
    
    private void addContact() {
        String name = contactView.getUserInput("Name: ");
        String phoneNumber = contactView.getUserInput("Phone number (10 digits): ");

         Contact contact = new Contact(name, phoneNumber);
             
        contactDAO.save(contact);
        contactView.displayMessage("Contact saved.");
    }
    
    private void findContact() {
        String name = contactView.getUserInput("Name to search for: ");
        Contact contact = contactDAO.findByName(name);
        
        if (contact == null) {
            contactView.displayMessage("No contact found with name '" + name + "'.");
        } else {
            contactView.displayMessage(contact.getName() + ", " + contact.getPhoneNumber());
        }
    }
}
