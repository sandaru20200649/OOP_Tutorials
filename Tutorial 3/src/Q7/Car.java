package Q7;

public class Car {
    private String licensePlate;
    private double speed; // kilometers per hour
    private double maxSpeed;// kilometers per hour

    public Car(String licensePlate1, double maxSpeed1, double speed1) {
        this.licensePlate = licensePlate1;
        this.speed = 0.0;
        if (maxSpeed1 >= 0.0) {
            maxSpeed = maxSpeed1;
        }
        else {
            maxSpeed = 0.0;
        }

        if (speed1 < 0)
            speed = 0;
        else if (speed1 > maxSpeed)
            speed = maxSpeed;
        else
            speed = speed1;
    }

    public Car(String k123WMI, double maxSpeed1) {
    }

    public void print() {
        System.out.println("Current speed: " + speed + "\nMax speed: " +
                maxSpeed + "\nLicence: " + licensePlate);
    }
}
