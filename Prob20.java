class Triangle{
    double area;
    Triangle(float a, float b){
         area = 0.5*(a*b);
    }
    void display(){
        System.out.println("Area of Triangle :"+area);
    }
}
public class Prob20 {
    public static void main(String[] args){
        Triangle obj = new Triangle(17, 15);
        obj.display();
    }
}
