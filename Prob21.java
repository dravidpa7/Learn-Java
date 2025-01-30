import java.util.Scanner;
class Sphere{
    void volume(float y){
        double Area;
        Area = 4*3.14*y;
        System.out.println("area of sphere is :"+Area);
    }
}
class VolSphere extends Sphere{
    float vol;
    double volumeV;
    void volume(float x){
        super.volume(x);
        volumeV=(4/3)*(3.14*(x*x*x));
        System.out.println("volume of the sphere :"+volumeV);
    }

}
public class Prob21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of  Sphere :");
        float radius= sc.nextFloat();
        VolSphere objSphere = new VolSphere();
        objSphere.volume(radius);
        sc.close();
    }
}
