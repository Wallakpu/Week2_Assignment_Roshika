class Product {
    // Attributes
    String name;
    double price;
    double discountPercentage;

    // Constructor
    Product(String name, double price, double discountPercentage) {
        this.name = name;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    // Method to calculate final price after discount
    double calculateFinalPrice() {
        return price - (price * discountPercentage / 100);
    }

    // Method to display product info
    void displayFinalPrice() {
        System.out.println("Product: " + name);
        System.out.println("Original Price: $" + price);
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.println("Final Price: $" + calculateFinalPrice());
        System.out.println();
    }
}

public class QnoSeven {
    public static void main(String[] args) {
     
        Product p1 = new Product("Laptop", 1000, 15);
        Product p2 = new Product("Smartphone", 800, 10);
        Product p3 = new Product("Headphones", 200, 5);

        p1.displayFinalPrice();
        p2.displayFinalPrice();
        p3.displayFinalPrice();
    }
}
