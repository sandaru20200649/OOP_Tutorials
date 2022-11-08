package Q5;

public class MainQ5 {
    public static void main(String[] args) {
        CreditCard crd1 = new CreditCard("John ",449039,458473633);
        DriverLicense dl1 = new DriverLicense("John ", 2024);
        Passport p1 = new Passport("John ", "New york", 2024);

        System.out.println("Is Expired" + dl1.isExpired());
        System.out.println("Is Expired" + p1.isExpired());

        System.out.println("\nCredit card \n\n" + crd1.format() + "\n\nDrivers License\n\n" + dl1.format() + "\n\nPassport\n\n" + p1.format());
    }
}
