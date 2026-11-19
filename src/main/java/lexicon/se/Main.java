package lexicon.se;

import lexicon.se.controller.ContactController;
import lexicon.se.view.ContactView;

public class Main {
    static void main() {
        ContactController contactController;

        ContactDAO contactDAO = new ContactDAO();
        ContactView contactView = new ContactView();
    }
}