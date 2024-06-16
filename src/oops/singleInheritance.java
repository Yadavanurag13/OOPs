package oops;

class Employee {
    void salary() {
        System.out.println("Salary:"+ 7000);
    }
}

class Hr extends Employee{
    void bonus() {
        System.out.println("Bonus" + 20000);
    }
}
public class singleInheritance {
    // when one parent class and one child class is there then it is single inheritance 

    //simplest
    //easy to understand

    public static void main(String[] args) {
        Hr hr1 = new Hr();

        hr1.salary();
        hr1.bonus();
    }
}
