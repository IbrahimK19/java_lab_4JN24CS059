package sem3;

interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    int width, height;
    Rectangle(int w, int h) {
        width = w;
        height = h;
    }
    public void resizeWidth(int width) {
        this.width = width;
    }
    public void resizeHeight(int height) {
        this.height = height;
    }
    public String toString() {
        return "rectangle[width="+width+", height="+height+"]";
    }
}

public class lab7 {
    static void main(String[] args) {
        Rectangle r = new Rectangle(5,7);
        System.out.println(r.toString());
        System.out.println("Before resize "+r);
        r.resizeWidth(10);
        r.resizeHeight(20);
        System.out.println("After resize "+r);
    }
}
