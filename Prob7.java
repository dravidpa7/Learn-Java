import java.util.Scanner;
public class Prob7 {
    public static void main(String args[]){
        double tax_amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Fixted tax percentage was 2.2% ");
        System.out.println("Enter your income :");
        double income=sc.nextDouble();
        tax_amount= income*0.022;
        System.out.println("Your income "+income +"tax amount is "+tax_amount);
        sc.close();
    }
}
