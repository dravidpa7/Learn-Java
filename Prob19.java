import java.util.Scanner;
public class Prob19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area  of square :");
        float var = sc.nextFloat();
        float side= var/2;
        System.out.println("Each side of square is "+side +".m ,"+ side*10 +"cm");
        sc.close();

    }
}
