class DogAction {
    int DogAge;
    String A ="tara";
    void bark(){      //member function
        System.out.println("Barking");
    }
    void sleep(){
        System.out.println("Sleep");
    }
}

public class Dog{
    public static void main(String args[]){
        DogAction Gs = new DogAction();
        Gs.bark();
        Gs.sleep();
        Gs.DogAge=5;
        System.out.println(Gs.DogAge);
        System.out.println(Gs.A);
    }
}
