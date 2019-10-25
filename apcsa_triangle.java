
import java.util.Scanner; 
public class apcsa_triangle {


    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
       
        System.out.print("Enter a base: ");
        double base = in.nextDouble();
        System.out.print("Enter a height: ");
        double height = in.nextDouble();
        System.out.print("Enter a hypotenuse: ");
        double hypotenuse = in.nextDouble();

        double formula = (base * base) + (height * height);
        double hypFormula = (hypotenuse * hypotenuse);

        if (formula == hypFormula){
            System.out.print("Yes, that's a right triangle!\n");
        } else {
            System.out.print("Nope...not a right traingle.\n");
        }
    }
}