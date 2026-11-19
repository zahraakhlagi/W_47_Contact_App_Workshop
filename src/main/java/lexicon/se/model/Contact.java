package lexicon.se.model;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact (String name, String phoneNumber) {
        setName(name);
        setPhoneNumber(phoneNumber);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Phone number cannot be empty");
        }
        if (!phoneNumber.matches("^\\d{10}$")) {
            throw new IllegalArgumentException("Phone number must be 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }
}
