class one{
    int x=10;
    int y=20;
    void display(){
        System.out.println("x "+x);
        System.out.println("y "+y);
    }
}
class Two extends one {
    void add(){
        System.out.println("add "+ (x+y));
    }
}
class Three extends one{
    void mul(){
        System.out.println("mul "+ x*y);
    }
}
public class Hire {
    public static void main(String[] args) {
        Two obj1 = new Two();
        Three obj2 = new Three();
        obj1.display();
        obj1.add();
        obj2.display();
        obj2.mul();
    }
}
