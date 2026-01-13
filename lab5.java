package sem3;

class shape {
    void draw() {
        System.out.println("shape drawn");
    }
    void erase() {
        System.out.println("shape erased");
    }
}

class circle extends shape {
    void draw() {
        System.out.println("circle drawn");
    }
    void erase() {
        System.out.println("circle erased");
    }
}

class triangle extends shape {
    void draw() {
        System.out.println("triangle drawn");
    }
    void erase() {
        System.out.println("triangle erased");
    }
}

class square extends shape {
    void draw() {
        System.out.println("square drawn");
    }
    void erase() {
        System.out.println("square erased");
    }
}

public class lab5 {
    static void main(String[] args) {
        shape[] shapes = {new circle(), new triangle(), new square()};
        for(shape s:shapes) {
            s.draw();
            s.erase();
        }
    }
}
