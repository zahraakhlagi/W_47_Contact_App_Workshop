package lexicon.se.view;

public class ContactView {
// --- Fields (State/Data) ---


// --- Body (Actions) ---

// --- Constructors ---
/*
    // Default Constructor 'ContactView':
    public ContactView() {
    } // Default Constructor 'ContactView' end --

    // Constructor 'ContactView':
    public ContactView(String variableName1, int variableName2, String variableName3, int variableName4) {
        this.variableName1 = variableName1;
        this.variableName2 = variableName2;
        this.variableName3 = variableName3;
        this.variableName4 = variableName4;
    } // Constructor 'ContactView' end --
*/

// --- Setters & Getters ---
    // --- Setters ---

    // Setter 'setId':

    // Setter Method 'setId' end --


    // --- Getters ---

    // Getter 'getId':

    // Getter Method 'getId' end --


// --- Methods ---
    // Method 'getUserInput':
    public static String getUserInput(String prompt) {
        // --- Local variables (static) ---


        // --- Body (Actions) ---
        IO.print("Select option: ");
        return IO.readln(prompt);
    } // Method 'getUserInput' end --

    // Method 'displayMenu':
    public static void displayMenu() {
        // --- Local variables (static) ---


        // --- Body (Actions) ---
        IO.println("========================================================");
        IO.println("                   Contact Application");
        IO.println("========================================================");
        IO.println("1. Contact view");
        IO.println("2. Find contact");
        IO.println("3. Add contact");
        IO.println("4. Delete contact");
        IO.println("0. Exit program");
        IO.println("========================================================");
    } // Method 'displayMenu' end --
/*
    // Method 'displayContacts':
    public static void displayContacts(List<Contact> contacts) {
        // --- Local variables (static) ---


        // --- Body (Actions) ---
        for(Contact contact : contacts) {
            IO.println(contact);
        }
    } // Method 'displayContacts' end --
*/
    // Method 'displayMessage':
    public static void displayMessage(String message) {
        // --- Local variables (static) ---


        // --- Body (Actions) ---
        IO.println("Message: " + message);
    } // Method 'displayMessage' end --

    // Method 'displayError':
    public static void displayError(String message) {
        // --- Local variables (static) ---


        // --- Body (Actions) ---
        IO.println("Error message: " + message);
    } // Method 'displayError' end --

    // Method 'methodName':
    public static void methodName() {
        // --- Local variables (static) ---


        // --- Body (Actions) ---


    } // Method 'methodName' end --

} // Class end --