package lexicon.se.view;

import lexicon.se.model.Contact;

import java.util.List;

public class ContactView {
// --- Methods ---
    // Method 'getUserInput':
    public String getUserInput(String prompt) {
        return IO.readln(prompt);
    } // Method 'getUserInput' end --

    // Method 'displayMenu':
    public void displayMenu() {
        IO.println("========================================================");
        IO.println("                   Contact Application");
        IO.println("========================================================");
        IO.println("1. Contact view");
        IO.println("2. Find contact");
        IO.println("3. Add contact");
        IO.println("0. Exit program");
        IO.println("========================================================");
    } // Method 'displayMenu' end --

    // Method 'displayContacts':
    public void displayContacts(List<Contact> contacts) {
        for(Contact contact : contacts) {
            IO.println(contact.getName() + ", " + contact.getPhoneNumber());
        }
    } // Method 'displayContacts' end --

    // Method 'displayMessage':
    public void displayMessage(String message) {
        IO.println(message);
    } // Method 'displayMessage' end --

    // Method 'displayError':
    public void displayError(String message) {
        IO.println("Error: " + message);
    } // Method 'displayError' end --

} // Class end --