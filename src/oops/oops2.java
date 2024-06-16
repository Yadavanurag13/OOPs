package oops;

class Student {
    //fix the value of variable
    final String name = "rahul";
    int roll_no;
    String address;
}

class Dog {
    String name;
    int id;

    void eat() {
        System.out.println(name + " eats");
    }
}
public class oops2 {
    public static void main(String[] args) {
        
        Student std1 = new Student();
        // we can not make any changes on the final initialised value

        //std1.name = "Rahul";
        std1.roll_no = 2;

        System.out.println(std1.name);

        //  std1.name = "Anurag";
        System.out.println(std1.name);

        Dog dog1 = new Dog();
        dog1.name = "Bruno";

        dog1.eat();
    

        //final keyword

    }
}
