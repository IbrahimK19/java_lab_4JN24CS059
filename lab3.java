package sem3;
class employee {
    String id, name;
    double salary;

    employee(String i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }
    void display() {
        System.out.println("employee id: "+id);
        System.out.println("employee name: "+name);
        System.out.println("employee salary: "+salary);
    }
    void raiseSalary(int percent){
        salary = salary + salary + percent/100;
    }
}

public class lab3 {
    public static void main(String args[]) {
        employee e= new employee("S456","Chandler",10000.5);
        System.out.println("Before Salary hike");
        e.display();
        e.raiseSalary(50);
        System.out.println("After salary hike");
        e.display();

    }

}
