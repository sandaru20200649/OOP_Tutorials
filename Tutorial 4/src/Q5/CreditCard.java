package Q5;

public class CreditCard extends Card {
    private int pinNumber;
    private int number;

    public CreditCard(String name, int pinNumber, int num) {

        super(name);
        this.pinNumber = pinNumber;
        number = num;
    }

    public void setPinNumber(int pinNumber) {
        this.number = number;

    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public int getNumber() {
        return number;
    }

    public boolean isExpired() {
        return false;

    }
}
