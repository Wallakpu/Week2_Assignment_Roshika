class Car {
    // Attributes of the Car class
    String brand;
    int year;

    // Constructor 
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    //display the details of the car
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class QuestionTen {
    public static void main(String[] args) {
        // Creating two Car objects
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2018);

        // Displaying details of both cars
        System.out.println("Car 1 Details:");
        car1.displayDetails();
        System.out.println();

        System.out.println("Car 2 Details:");
        car2.displayDetails();
    }
}

