class Demo{
    int a;
    int b;
    int c;
    static int x;
    static int y;
    static int z;

    {
        System.out.println("non static block");
        a=10;
        b=20;
        c=30;
        System.out.println("non static block exit");
    }
    static{
        System.out.println("static block");
        x=11;
        y=22;
        z=33;
        System.out.println("Static block exit");
    }
    Demo(){
        System.out.println("zero parameter con");
        a=100;
        b=200;
        c=300;
        System.out.println("zero para con exit");
    }
    Demo(int a,int b,int c){
        System.out.println("para con");
        this.a=a;
        System.out.println("para con exit");
    }
    void display(){
        System.out.println("non static method");
        System.out.println(a+" "+b+" "+c);
        System.out.println("non static method exit");
    }
    void display2(){
        System.out.println("static method");
        System.out.println(x+""+y+""+z);
        System.out.println("static method exit");
    }

}
public class Mem{
    public static void main(String[] args) {
        Demo d1= new Demo();
        d1.display();
        Demo d2=new Demo(1000,2000,3000);
        d2.display2();
    }
}