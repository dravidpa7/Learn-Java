import java.util.Scanner;
public class Prob11 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a table you need :");
        int n=sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(i +"x"+ n +"="+i*n);
        }
        sc.close();
    }
}
