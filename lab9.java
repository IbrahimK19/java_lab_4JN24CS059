package sem3;

class DivisionByZero extends Exception {
    DivisionByZero(String msg) {
        super(msg);
    }
}

public class lab9 {
    static void main(String[] args) {
        try {
            throw new DivisionByZero("/ by 0");
        }
        catch(DivisionByZero ob) {
            System.out.println("Inside catch block "+ob);
        }
        finally {
            System.out.println("Inside finally");
        }
        System.out.println("Program still runs");
    }
}
