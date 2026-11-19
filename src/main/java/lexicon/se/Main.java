package lexicon.se;

import lexicon.se.controller.ContactController;
import lexicon.se.data.ContactDAO;
import lexicon.se.data.FileContactDaoImpl;
import lexicon.se.view.ContactView;

public class Main {
    void main() {
        ContactDAO contactDAO = new FileContactDaoImpl();
        ContactView contactView = new ContactView();
        ContactController contactController = new ContactController(contactDAO, contactView);

        contactController.run();
    }
}