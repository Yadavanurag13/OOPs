package oops;

class A {
    void show() {
        System.out.println("Class A");
    }
}

class B {
    void show() {
        System.out.println("Class B");
    }
}

class C extends A{
    // C extends A B, now compiler is confused that from which class this is comming
    //
    void dekh() {
        System.out.println("heec");
    }
}
public class multipleInheritance {
    //java me nhi lagta due to ambiguity

    //ek child ke two parent  in not possible in java



    //how to solve this issue in java  ----> using interface
}
