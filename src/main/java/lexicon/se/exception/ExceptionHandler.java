package lexicon.se.exception;

import lexicon.se.view.ContactView;

public class ExceptionHandler {
    public static void handle(Exception e, ContactView contactView)
    {
        switch (e)
        {
            case DuplicateContactException dce ->
            {
                contactView.displayMessage("Duplicate Contact Exception");
                contactView.displayError(e.getMessage());
            }
            case IllegalArgumentException iae ->
            {
                contactView.displayMessage("Illegal argument Exception");
                contactView.displayError(e.getMessage());
            }
            case ContactStorageException cse ->
            {
                contactView.displayMessage("Contact Storage Exception");
                contactView.displayError(e.getMessage());
            }
            default -> {
                e.printStackTrace();
                throw new IllegalStateException("Unexpected value: " + e);
            }
        }
    }
}
