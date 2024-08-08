import java.util.Scanner;

class Account extends Thread {
    int bal;

    Account(int b) {
        bal = b;

    }

    boolean isSufficientBal(int w) {
        if (bal > w) {
            return true;
        } else {
            return false;
        }
    }

    void withdraw(int amt, String g1) {
        bal = bal - amt;
        System.out.println(g1 + " " + "Transaction Successfull.");
        System.out.println(g1 + " " + "Current Balance:-" + bal);
    }

}

class Customer extends Thread {

    String n1;
    Account x1;

    Customer(Account j1, String m1) {
        x1 = j1;
        n1 = m1;
    }

    public void run() {
        synchronized (x1) {
            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter Amount For Withdraw for" + " " + n1);
            int amt = s1.nextInt();

            if (x1.isSufficientBal(amt)) {
                x1.withdraw(amt, n1);
            } else {
                System.out.println("Insufficient Balance.");
            }
        }
    }

}

class ThreadSyn {
    public static void main(String[] args) {

        Account a1 = new Account(5000);
        Customer c1 = new Customer(a1, "Gaurish");
        Customer c2 = new Customer(a1, "Girish");

        c1.start();
        c2.start();
    }
}