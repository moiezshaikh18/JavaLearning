class ProcessOne extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("This is Process One Loop:- " + i);
        }
    }
}

class ProcessTwo extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("This is Process Two Loop:- " + i);
        }
    }
}

class ThreadC {
    public static void main(String[] args) {

        ProcessOne P1 = new ProcessOne();
        ProcessTwo P2 = new ProcessTwo();

        P1.start();
        P2.start();
    }
}