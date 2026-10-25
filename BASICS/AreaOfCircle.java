import java.util.Scanner;

class AreaOfCircle 
{
    public static void main(String[] args) {
        double pi = 3.1415;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle : ");
        double radius = sc.nextDouble();

        double area = pi*radius*radius;

        System.out.println("The Area of Circle is " + area);
    }
}