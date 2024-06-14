class Nokia1 {
    int x, y;

    void f1() {
        System.out.println("parent Function 1 Executed");

    }

    void f2() {
        System.out.println("parent Function 2 Executed");

    }
}

class Nokia2 extends Nokia1 {
    int z;

    void f3() {
        System.out.println("Child Function 1 Executed");
    }
}

class Single {
    public static void main(String[] args) {

        Nokia2 n2 = new Nokia2();
        n2.f1();
        n2.f2();
        n2.f3();
    }
}