package lexicon.se;

import lexicon.se.controller.ContactController;
import lexicon.se.data.ContactDAO;
import lexicon.se.data.FileContactDaoImpl;
import lexicon.se.exception.ContactStorageException;
import lexicon.se.exception.ExceptionHandler;
import lexicon.se.view.ContactView;

public class Main {
    void main() {
        ContactView contactView = new ContactView();
        try {
            ContactDAO contactDAO = new FileContactDaoImpl("src/main/resources/contacts.txt");
            ContactController contactController = new ContactController(contactDAO, contactView);

            contactController.run();
        } catch (ContactStorageException e) {
            ExceptionHandler.handle(e, contactView);
        }
    }
}