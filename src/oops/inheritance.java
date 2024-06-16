package oops;

// class Parent {
//     void display() {
//         System.out.println("parent class");
//     }
// }

// class Child extends Parent {
//     void show() {
//         System.out.println("child class");
//     }
// }

class Vehicle {
    double price;
    double milage;
    String color;

    void display() {
        System.out.println(price);
        System.out.println(milage);
        System.out.println(color);
    }
}

class Car extends Vehicle {
    String type;
    boolean sunroof;
    String brand;
}
public class inheritance {
    //one class inherit the properties in new class

    //sub class/ child class jo inherit karta hai

    //parent class -> jisse inherit hota hia


    // child class extends parentClass {
    //     child class data member and methods
    // }

        //  is relationship reltionship betwween child and parent



        public static void main(String[] args) {
            // Child child1 = new Child();
            // child1.display();
            // child1.show();

            Car car1 = new Car();
            car1.brand = "tata";
            car1.color = "red";
            car1.milage = 10;
            car1.sunroof = false;
            car1.type = "Disel";

            System.out.println(car1.brand);
            System.out.println(car1.color);
            System.out.println(car1.milage);
            System.out.println(car1.sunroof);
            System.out.println(car1.type);

        }
}
