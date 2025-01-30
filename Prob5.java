public class Prob5 {
    public static void main(String args[]){
        int n=3;
        int A=5;
        int B=6;
        int Sum=0;
        for( int i=1;i<=n;i++){
            Sum=i*A;
            Sum+=10;
            System.out.print(Sum+" ");
        }
        for( int i=1;i<=n;i++){
            Sum=i*B;
            Sum-=5;
            System.out.print(Sum+" ");
        }

    }
}

