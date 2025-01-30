public class Prob3 {
    public static void main(String args[]){
        int a=10;
        float c;
        c=((a++ - --a * a++)/(float)(a++ + --a));
        System.out.printf("Result: %.5f\n",c);
    }
}
