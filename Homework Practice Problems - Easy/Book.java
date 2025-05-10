public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author =author;
    }
    public void showBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book myBook = new Book("Alchemist", "Paulo Coelho");
        myBook.showBook();
    }
}
