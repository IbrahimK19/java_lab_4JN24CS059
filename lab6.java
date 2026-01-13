package sem3;

abstract class Shape {
    void calculateArea() {}
    void calculatePerimeter() {}
}

class Circle extends Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }
    void calculateArea() {
        System.out.println("Area of circle = "+Math.PI*radius*radius);
    }
    void calculatePerimeter() {
        System.out.println("Circumference of  circle = "+2*Math.PI*radius);
    }
}

class Triangle extends Shape {
    double a,b,c;
    Triangle(double s1, double s2, double s3) {
        a = s1;
        b = s2;
        c = s3;
    }
    void calculateArea() {
        double s = (a+b+c)/2;
        System.out.println("Area of triangle = "+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
    void calculatePerimeter() {
        System.out.println("Perimeter of triangle = "+(a+b+c));
    }
}

public class lab6 {
    static void main(String[] args) {
        Circle c = new Circle(2);
        c.calculatePerimeter();
        c.calculateArea();
        Triangle t = new Triangle(3,4,5);
        t.calculatePerimeter();
        t.calculateArea();
    }
}
