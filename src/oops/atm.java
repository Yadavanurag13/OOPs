package oops;
import java.util.*;

class ATMM{
    float Balance = 0.0f;
    int PIN = 1234;


    public void checkPin() {
        System.out.println("Enter your PIN :");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if(enteredPin == PIN) {
            menu();
        }else {
            System.out.println("Enter a valid pin");
            checkPin();
        }
        sc.close();
    }

    public void menu() {
        System.out.println("Enter you choice .");
        System.out.println("1. Check A/c Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);

        int opt = sc.nextInt();

        if (opt == 1) {
            checkBalance();
        }else if(opt == 2) {
            withdrawMoney();
        }else if(opt == 3) {
            depositeMoney();
        }else if(opt == 4) {
            exit();
        }else {
            System.out.println("Enter valid option");
        }
        sc.close();
    }

    public void checkBalance() {
        System.out.println("Balance :" + Balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if(amount > Balance) {
            System.out.println("Insufficient Balance");
        }else {
            Balance = Balance - amount;
            System.out.println("Money Withdrown successfully");
        }
        menu();

        sc.close();
    }

    public void depositeMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount");
        float amount = sc.nextFloat();

        Balance = Balance + amount;
        System.out.println("Money Deposited successfully");
        menu();
        sc.close();
    }

    public void exit() {

    }
}
public class atm {
     public static void main(String[] args) {
        ATMM obj = new ATMM();
        obj.checkPin();
     }
}
