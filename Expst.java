class Demo{
    int a;
    int b;
    Demo(){
        System.out.println("0 para parent con");
        a=10;
        b=20;
        System.out.println("0 para parent con exit");
    }
    Demo(int a,int b){
        this();
        System.out.println("para parent con");
        this.a=a;
        this.b=b;
        System.out.println("para parent con exit");
    }
}
class Demo2 extends Demo{
    int c;
    int d;
    Demo2(){
        this(11, 22);
        System.out.println("0 para child con");
        c=100;
        d=200;
        System.out.println("0 para child con exit");
    }
    Demo2(int c,int d){
        super(111,222);
        System.out.println("para child con");
        this.c=c;
        this.d=d;
        System.out.println("para child con exit");
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class Expst{
    public static void main(String[] args){
        Demo2 x= new Demo2();
        x.display();
    }

}