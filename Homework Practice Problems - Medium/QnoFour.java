class Rectangle {
    double length;
    double breadth;

//constructor
Rectangle(double l, double b) {
    this.length= l;
    this.breadth = b;
}

//method
double calculateArea () {
    return length * breadth;
}
}

public class QnoFour {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 6);
        Rectangle r2 = new Rectangle(3, 2);
        Rectangle r3 = new Rectangle(6, 4);

        System.out.println("The area of rectangle 1 is: " + r1.calculateArea());
        System.out.println("The area of rectangle 2 is: " + r2.calculateArea());
        System.out.println("The area of rectangle 3 is: " + r3.calculateArea());
    }
}
