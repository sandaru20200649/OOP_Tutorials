package Q2;

public class MainQ2 {

        public static void main(String[] args) {
            Employee emp1 = new Employee();
            Employee emp2 = new Employee("phil", 30000);
            Employee emp3 = new Employee("Mike ", 25000);
            System.out.println("e1: " + emp1.getName() + ", salary: " + emp1.getSalary());
            System.out.println("e2: " + emp2.getName() + ", salary: " + emp2.getSalary());
            System.out.println("e3: " + emp3.getName() + ", salary: " + emp3.getSalary());
        }
    }

