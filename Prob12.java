public class Prob12 {
    public static void  main(String args[]){
        int n=3;
        int sum=1;
        for(int i=n;i>0;i--){
            sum*=i;
        }
        System.out.println("Factorial for "+n +" is"+sum);
    }
}
