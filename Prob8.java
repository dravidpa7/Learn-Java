import java.util.Scanner;
public class Prob8 {
    public static void main(String args[]){
        float Fahrenheit;
        float celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fahrenheit");
        Fahrenheit = sc.nextFloat();
        celsius =(Fahrenheit -32)*5/9;
        System.out.println("celsius is :"+celsius);
        sc.close();

    }
}
