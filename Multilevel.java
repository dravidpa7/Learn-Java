class Student{
    int roll;
    void getroll(int x){
         roll=x;
    }
    void putroll(){
        System.out.println("Roll number"+roll);
    }
}
class Test extends Student{
    int m1;
    int m2;
    void getmark(int x,int y){
        m1=x;
        m2=y;
    }
    void putmark(){
        System.out.println("test 1 "+m1);
        System.out.println("test 2 "+m2);
    }
}
class Result extends Test{
    int total;
    void display(){
        putroll();
        putroll();
        total=m1+m2;
        System.out.println("total "+total);
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Result obj =new Result();
        obj.getroll(22022);
        obj.getmark(97, 92);
        obj.display();
    }
}
