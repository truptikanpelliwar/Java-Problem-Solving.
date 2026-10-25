import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        double pi = 3.1415;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius of Sphere : ");
        double radius = sc.nextDouble();

        double volume = (3/4.0)*pi*radius*radius*radius;

        System.out.println("The Volume of Sphere is "+ volume);

    }
}
