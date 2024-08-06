class ProcessOne implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("This is Process One Loop:- " + i);
        }
    }
}

class ProcessTwo implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("This is Process Two Loop:- " + i);
        }
    }
}

class Multi {
    public static void main(String[] args) {

        ProcessOne P1 = new ProcessOne();
        ProcessTwo P2 = new ProcessTwo();

        Thread t1 = new Thread(P1);
        Thread t2 = new Thread(P2);

        t1.start();
        t2.start();

    }
}
