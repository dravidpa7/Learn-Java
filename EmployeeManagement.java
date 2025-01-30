class Employee {
    // Static variable to generate unique IDs
    private static int idCounter = 0;

    // Static variable to count total employees
    private static int totalEmployees = 0;

    // Instance variables for each employee
    private int id;  // Unique ID for each employee
    private String name; // Name of the employee

    // Static block for one-time initialization
    static {
        System.out.println("Employee Management System Initialized");
        idCounter = 1000; // Starting ID number
    }

    // Constructor for initializing employee details
    public Employee(String name) {
        this.id = ++idCounter;  // Increment the ID counter and assign it
        this.name = name;       // Set the employee's name
        totalEmployees++;       // Increment total employee count
    }

    // Getter method for employee ID
    public int getId() {
        return id;
    }

    // Getter method for employee name
    public String getName() {
        return name;
    }

    // Static method to get total employees
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        // Create employees
        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");
        Employee emp3 = new Employee("Dravid");


        // Display employee details
        emp1.display();
        emp2.display();
        emp3.display();

        // Display total employees
        System.out.println("Total Employees Created: " + Employee.getTotalEmployees());
    }
}
