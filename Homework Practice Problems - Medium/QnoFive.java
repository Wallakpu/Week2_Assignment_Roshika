class Movie {
    // Attributes
    String name;
    String language;
    float rating;  

    // Constructor
    Movie(String name, String language, float rating) {
        this.name = name;
        this.language = language;
        this.rating = rating;
    }

    // Method to display movie details
    void displayMovieDetails() {
        System.out.println("Movie Name: " + name);
        System.out.println("Language: " + language);
        System.out.println("Rating: " + rating + " / 5");
        System.out.println();
    }
}

public class QnoFive {
    public static void main(String[] args) {
        //4 Movie objects
        Movie m1 = new Movie("Inception", "English", 4.8f);
        Movie m2 = new Movie("3 Idiots", "Hindi", 4.5f);
        Movie m3 = new Movie("Your Name", "Japanese", 4.7f);
        Movie m4 = new Movie("Parasite", "Korean", 4.6f);

        // Display details
        m1.displayMovieDetails();
        m2.displayMovieDetails();
        m3.displayMovieDetails();
        m4.displayMovieDetails();
    }
}
