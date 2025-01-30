import java.util.Scanner;
public class Prob6 {
    public static void main (String args[]){
        float yard ;
        float miles;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter how many feet :");
        int feet = sc.nextInt();
        yard = feet/3;
        miles= yard/1760;
        System.out.println("feet is "+feet +", yards "+yard +", miles are "+miles +".");
        sc.close();
    }
}
