package oops;

class Students {
    int id;
    int age;

    Students(int id, int age) {
        this.id = id;
        this.age = age;
        System.out.println("hwllo P constructor");
    }

    Students() {
        System.out.println("hello d construct");
    }
}
public class constructor {
    //name equal to kaam
    public static void main(String[] args) {
        Students obj = new Students(1, 1);
         
        //Students obj = new Students(1, 10);
        System.out.println(obj.id);
    }
}
