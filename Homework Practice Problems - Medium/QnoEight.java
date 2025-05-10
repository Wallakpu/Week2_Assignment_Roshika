class Contact {
    // Fields
    String name;
    String phoneNumber;
    String emailAddress;

    // Constructor
    Contact(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    // Method to display contact info
    void displayContact() {
        if (!emailAddress.isEmpty()) {
            System.out.println("Name: " + name);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Email Address: " + emailAddress);
            System.out.println();
        }
    }
}

public class QnoEight {
    public static void main(String[] args) {
        
        Contact c1 = new Contact("Alice", "9834549350", "alice@example.com");
        Contact c2 = new Contact("Bob", "9876543210", "");
        Contact c3 = new Contact("Charlie", "9834352212", "charlie@mail.com");

        c1.displayContact();
        c2.displayContact();
        c3.displayContact();
    }
}
