package sem3;
import java.util.Scanner;

class Stack {
    int size,top;
    int a[];
    Stack(int n) {
        size = n;
        top = -1;
        a = new int[size];
    }

    void push(int ele) {
        if(top==size-1)
            System.out.println("stack is full");
        else
            a[++top] = ele;
    }

    void display() {
        if(top==-1)
            System.out.println("stack is empty");
        else {
            for(int i=top; i>=0; i--)
                System.out.println(a[i]);
        }
    }

    void pop() {
        if(top==-1)
            System.out.println("stack is empty");
        else {
            System.out.println("popped element is "+a[top]);
            top--;
        }
    }
}

public class lab2 {
    static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }

}
