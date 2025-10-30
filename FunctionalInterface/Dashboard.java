package FunctionalInterface;

interface Vehicle {
    void displaySpeed();
    default void displayBattery() {
        System.out.println("Battery: 85%");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Speed: 70 km/h");
    }
}

public class Dashboard {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.displaySpeed();
        e.displayBattery();
    }
}