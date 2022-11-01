package Q4;

public class MainQ4 {
    public static void main(String[]args){
        //object creation
        VendingMachine vm1 = new VendingMachine(90);

        vm1.fillUp(5);

        vm1.insertToken();
        vm1.insertToken();

        System.out.println("Can Count : " + vm1.getCanCount());
        System.out.println("Token Count : " + vm1.getTokenCount());
    }
}
