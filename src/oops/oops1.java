package oops;

public class oops1 {
    String name;
    int roll_no;

    public void printdata() {
        System.out.println(name);
        System.out.println(roll_no);
    }

    public static void main(String[] args) {
        oops1 std1 = new oops1();
        std1.name = "Anurag";
        std1.roll_no = 15;
        
        //class is like datatype and object is like variable name
        
        //value of data can be change 
        std1.name = "Raman";
        std1.printdata();

        oops1 std2 = new oops1();
        std2.name = "Ann";
        std2.roll_no = 13;

        std2.printdata();
    }
}
