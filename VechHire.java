// Base class
class Vehicle {
    int maxSpeed;

    Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Vehicle Maximum Speed: " + maxSpeed + " km/h");
    }
}

// Intermediate class that extends Vehicle
class Car extends Vehicle {
    int numberOfSeats;

    Car(int maxSpeed, int numberOfSeats) {
        super(maxSpeed); // Call the constructor of Vehicle
        this.numberOfSeats = numberOfSeats;
    }

    void displayInfo() {
        super.displayInfo(); // Call the displayInfo method from Vehicle
        System.out.println("Car Number of Seats: " + numberOfSeats);
    }
}

// Derived class that extends Car
class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(int maxSpeed, int numberOfSeats, int batteryCapacity) {
        super(maxSpeed, numberOfSeats); // Call the constructor of Car
        this.batteryCapacity = batteryCapacity;
    }

    
    void displayInfo() {
        super.displayInfo(); // Call the displayInfo method from Car
        System.out.println("Electric Car Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class VechHire {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar(200, 5, 75);
        tesla.displayInfo();
    }
}
