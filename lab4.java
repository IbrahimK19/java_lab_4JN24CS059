package sem3;
class MyPoint {
    int x,y;
    MyPoint(){
        x=y=0;
    }
    MyPoint(int x, int y) {
        this.x = x;
        this.y=y;
    }
    void SetXY(int a, int b) {
        x=a;
        y=b;
    }
    int[] getXY() {
        return new int[]{x,y};
    }
    public String toString() {
        return "("+x+","+y+")";
    }
    double distance(int x, int y) {
        double xdif = this.x-x;
        double ydif = this.y=y;
        return Math.sqrt(xdif*xdif + ydif*ydif);
    }
    double distance() {
        return distance(0,0);
    }
    double distance(MyPoint another) {
        return distance(another.x, another.y);
    }
}
public class lab4 {
    static void main(String[] args) {
        MyPoint p1 = new MyPoint(3,4);
        MyPoint p2 = new MyPoint();
        p2.SetXY(7,8);
        System.out.println("p1.x = "+p1.getXY()[0]);
        System.out.println("p1.y = "+p1.getXY()[1]);
        System.out.println(p1);
        System.out.println(p2.toString());
        System.out.printf("distance = %.2f",p1.distance(6,7));
        System.out.printf("\ndistance = %.2f",p1.distance());
        System.out.printf("\ndistance = %.2f",p1.distance(p2));
    }
}
