import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle : ");
        double principle = sc.nextDouble();

        System.out.print("Enter Rate : ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time : ");
        double time = sc.nextDouble();

        double simpleInterest = (principle*rate*time) / 100.0 ;

        System.out.println("Simple Interest : "+simpleInterest);

    }
}
