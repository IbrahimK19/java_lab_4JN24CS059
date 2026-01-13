package sem3;

class Outer {
    void display() {
        System.out.println("inside Outer class display()");
    }
    class Inner {
        void display() {
            System.out.println("Inside Inner class display()");
        }
    }
}

public class lab8 {
    static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        outer.display();
        inner.display();
    }
}
