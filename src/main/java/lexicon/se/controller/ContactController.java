package lexicon.se.controller;

public class ContactController {

    private final ContactDAO contactDAO;
    private final ContactView contactView;

    public ContactController(ContactDAO contactDAO, ContactView contactView) {
        this.contactDAO = contactDAO;
        this.contactView = contactView;
    }

    public void run() {
        
    }
}
