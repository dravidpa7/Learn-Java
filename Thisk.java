class demo1{
    int a;
    int b;
    demo1(){
        a=10;
        b=20;
    }
    demo1(int a, int b){
        this(); // Calls the default constructor
        System.out.println("Before overwriting: " + this.a + ", " + this.b);
        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);

    }
}
public class Thisk {
    public static void main (String[] args){
        demo1 x =new demo1();
        x.display();
        demo1 y = new demo1(15, 7);
        y.display();
    }
}
