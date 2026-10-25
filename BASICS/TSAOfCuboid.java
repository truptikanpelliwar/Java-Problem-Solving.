import java.util.Scanner;

public class TSAOfCuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Total Surface Area of Cuboid = 2(lw + lh + wh)

        //Taking Length, Height and Weidth as an Input.
        System.out.print("Enter Length of Cuboid : "); 
        double length = sc.nextDouble();

        System.out.print("Enter Height of Cuboid : ");
        double height = sc.nextDouble();

        System.out.print("Enter Weidth of Cuboid : ");
        double weidth = sc.nextDouble(); 

        double tsa = 2*((length*weidth) + (length*height) + (weidth*height));
        
        System.out.println("The Total Surface Area of the Cuboid is " + tsa);
    }
}
