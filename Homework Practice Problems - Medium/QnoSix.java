class Employee {
    // Attributes
    String name;
    double salary;
    int Exp;

    // Constructor
    Employee(String name, double salary, int Exp) {
        this.name = name;
        this.salary = salary;
        this.Exp = Exp;
    }

    // Method to calculate and display bonus
    void calculateBonus() {
        double bonus;
        if (Exp > 5) {
            bonus = 0.20 * salary;
        } else {
            bonus = 0.10 * salary;
        }
        System.out.println("Employee: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Years of Experience: " + Exp);
        System.out.println("Bonus: $" + bonus);
        System.out.println();
    }
}

public class QnoSix {
    public static void main(String[] args) {
        // Create employee objects
        Employee e1 = new Employee("Alice", 50000, 6);
        Employee e2 = new Employee("Bob", 45000, 3);
        Employee e3 = new Employee("Charlie", 70000, 8);
        Employee e4 = new Employee("Diana", 60000, 4);

        // Display bonuses
        e1.calculateBonus();
        e2.calculateBonus();
        e3.calculateBonus();
        e4.calculateBonus();
    }
}
