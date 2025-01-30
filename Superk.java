class A{
    int a;
    int b;
    A(){
        super();
        a=10;
        b=12;
    } 
    A(int a,int b){
        this();
        this.a=a;
        this.b=b;
    }   

}
class B extends A{
    int c,d;
    B(){
        super(11,22);// i use zero para it will print 10,12
        c=14;
        d=16;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class Superk{
    public static void main(String[] args){
        B obj = new B();
        obj.display();
    }
}
