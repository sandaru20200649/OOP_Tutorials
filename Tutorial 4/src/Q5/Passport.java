package Q5;
import java.util.*;

public class Passport extends Card {
    private String birthLocation;
    private int expirationYear;

    public Passport(String name, String birth, int expire) {
        super(name);
        birthLocation = birth;
        expirationYear = expire;
    }

    public void setBirthLocation(String birthLocation) {
        this.birthLocation = birthLocation;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public String getBirthLocation() {
        return birthLocation;
    }
    public int getExpirationYear(){
        return expirationYear;
    }

    public boolean isExpired() {

        GregorianCalendar calendar = new GregorianCalendar();
        int current_year = calendar.get(Calendar.YEAR);
        if (expirationYear < current_year)
            return true;
        else
            return false;
    }
}