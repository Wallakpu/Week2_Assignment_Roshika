class Circle {
    // Attribute
    double radius;

    // Final constant
    final double PI = 3.14159;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * PI * radius;
    }

    // Method to calculate area
    double calculateArea() {
        return PI * radius * radius;
    }

    // Method to display results
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + calculateCircumference());
        System.out.println("Area: " + calculateArea());
        System.out.println();
    }
}

public class QnoNine {
    public static void main(String[] args) {
        // two Circle objects
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(7.5);

        c1.displayDetails();
        c2.displayDetails();
    }
}
