import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //student database;
        Student obj1 = new Student(1, "Narendra Tomar", "BCA", "Jalgaon", 0);
        Student obj2 = new Student(2, "Devendra Bhatia", "MBA", "Mumbai", 10000);
        Student obj3 = new Student(3, "Derek Arora", "BA", "Bandra", 5000);
        Student obj4 = new Student(4, "Anirudhha Gupta", "BCOM", "Bangalore", 0);

        System.out.print("Enter student Id : ");
        int sId = sc.nextInt();
        Student ob = new Student();
        if (sId == 1) {
            ob = obj1;
        } else if (sId == 2) {
            ob = obj2;
        } else if (sId == 3) {
            ob = obj3;
        } else {
            ob = obj4;
        }

        System.out.println("Hello " + ob.getName());

        System.out.print("Want to do some transaction if yes then type Y if no then type N : ");
        String tej;
        tej = sc.next();
        while(tej.equals("Y"))
        {
            System.out.println("1. Total Fee");
            System.out.println("2. Fee paid till now");
            System.out.println("3. Pay Fee");
            System.out.println("4. Remaining Fees");
            System.out.print("Please enter the choice number for processing you transaction : ");
            int input = sc.nextInt();
            if (input == 1) {
                System.out.println("Total fee is " + ob.getTotalFees());
            } else if (input == 2) {
                System.out.println("Fees paid till now is " + ob.getFeesPaid());
            } else if (input == 3) {
                System.out.print("Enter the amount you want to pay now : ");
                int amountTopay = sc.nextInt();
                ob.setFeesPaid(ob.getFeesPaid() + amountTopay);
                int rem = ob.getTotalFees() - ob.getFeesPaid();
                System.out.println("Your amount is paid succesfully And your remaining fee is " + rem);
            } else if (input == 4) {
                int amt = ob.getTotalFees() - ob.getFeesPaid();
                System.out.println("You remaining fee is : " + amt);
            }

            System.out.print("Want to do some other transaction is yes then type Y if no then type N : ");
            tej = sc.next();
        }

    }
}