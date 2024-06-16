package oops;

class Class1 {
    void display() {
        System.out.println("Hello");
    }
}
class Class2 extends Class1 {
    void show() {
        System.out.println("I'm class 2");
    }
}
class Class3 extends Class2{
    void dekh() {
        System.out.println("I'm class 3");
    }
}
public class multilevelInheritance {
    //multi level papa and dada 
    public static void main(String[] args) {
        Class3 class3 = new Class3();
        class3.display();
        class3.show();
        class3.dekh();
    }
}
