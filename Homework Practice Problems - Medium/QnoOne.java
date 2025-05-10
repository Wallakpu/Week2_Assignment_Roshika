class Book {
    // Attributes
    String title;
    String author;
    String ISBN;

    // Constructor
    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Method to display book details
    void showDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN  : " + ISBN);
        System.out.println();
    }
}

public class QnoOne {
    public static void main(String[] args) {
        // Creating 5 Book objects manually
        Book book1 = new Book("1984", "George Orwell", "9780451524935");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", "9781503290563");
        Book book5 = new Book("The Hobbit", "J.R.R. Tolkien", "9780547928227");

        // Displaying details of each book
        book1.showDetails();
        book2.showDetails();
        book3.showDetails();
        book4.showDetails();
        book5.showDetails();
    }
}
