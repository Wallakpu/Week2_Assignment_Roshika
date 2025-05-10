class Car {
    // Attributes
    String brand;
    String model;
    double price;

    // Constructor
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display car details
    void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: Rs." + price);
        System.out.println();
    }
}

public class QnoTen {
    public static void main(String[] args) {
        // Create 5 car objects
        Car c1 = new Car("Toyota", "Fortuner", 4200000);
        Car c2 = new Car("Hyundai", "Creta", 1800000);
        Car c3 = new Car("BMW", "X5", 9000000);
        Car c4 = new Car("Tata", "Nexon", 1500000);
        Car c5 = new Car("Mercedes", "C-Class", 5500000);

        // Display only cars with price > Rs.20,00,000
        System.out.println("Cars priced above Rs.20,00,000:");
        System.out.println();

        if (c1.price > 2000000) c1.displayCar();
        if (c2.price > 2000000) c2.displayCar();
        if (c3.price > 2000000) c3.displayCar();
        if (c4.price > 2000000) c4.displayCar();
        if (c5.price > 2000000) c5.displayCar();
    }
}
