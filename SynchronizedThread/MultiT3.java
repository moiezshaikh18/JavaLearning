import java.util.Scanner;

class Account extends Thread {

    int bal;

    Account(int b) {
        bal = b;

    }

    boolean isSufficientBal(int withdraw) {
        if (bal >= withdraw) {
            return true;
        } else {
            return false;
        }
    }

    public void withdrawAmount(int withdrawBal) {
        bal = bal - withdrawBal;
        System.out.println("Withdraw SuccessFull");
        System.out.println("Curent Balance:- " + bal);
    }

}

class Customer extends Thread {
    String name;
    Account p1;

    Customer(Account j1, String n) {
        p1 = j1;
        name = n;
    }

    public void run() {
        synchronized (p1) {
            Scanner s1 = new Scanner(System.in);
            System.out.println(name + " Enter Withdraw Amount:- ");
            int amt = s1.nextInt();

            if (p1.isSufficientBal(amt)) {
                p1.withdrawAmount(amt);
            } else {
                System.out.println("Insufficient Balance.");
            }
        }

    }
}

class MultiT3 {
    public static void main(String[] args) {
        Account a1 = new Account(6000);

        Customer c1 = new Customer(a1, "Moiz");
        Customer c2 = new Customer(a1, "Moin");

        c1.start();
        c2.start();

    }
}