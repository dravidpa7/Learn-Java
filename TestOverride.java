class A1 {
    int i, j;

    A1(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j " + i + " " + j);
    }
}

class B1 extends A1 {
    int k;

    B1(int a, int b, int c) {
        super(a, b); // Call the constructor of A1 to initialize i and j
        k = c;       // Initialize k specific to B1
    }

    // @Override use this in updated version 
    void show() {
        super.show(); // Call A1's show method
        System.out.println("k " + k); // Add functionality for k
    }
}

public class TestOverride {
    public static void main(String[] args) {
        B1 obj = new B1(12, 23, 43);
        obj.show(); // Calls B1's show method
    }
}
