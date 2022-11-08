package Q5;

import java.time.Year;

public class DriverLicense extends Card {
    private int expirationYear;

    public DriverLicense(String name, int expire) {
        super(name);
        this.expirationYear = expirationYear;
    }

    //get Expiration year
    public int getExpirationYear() {
        return expirationYear;
    }

    //Set Expiration year
    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }


    public boolean isExpired() {
        Year year = Year.now();
        Year expired = Year.of(expirationYear);

        if (year.compareTo(expired) < 0) {
            return false;
        } else {
            return true;
        }
    }
}

