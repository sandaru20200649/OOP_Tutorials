package Q1;

public class MainQ1 {
    public static void main(String[] args) {
        double sum1 = CalcManager.add(10.5, 20.6);
        System.out.println("sum1 = " + sum1);
        double sum2 = CalcManager.add(1,2, 3.4);
        System.out.println("sum2 = " + sum2);

        System.out.println("isEven(4): " + CalcManager.isEven(2));
        System.out.println("isEven(7): " + CalcManager.isEven(5));
        System.out.println("cube(3): " + CalcManager.cube(2));
        System.out.println("cube(10): " + CalcManager.cube(3));
    }
}
