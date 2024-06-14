class Nokia1 {
    private int x, y;

    Nokia1(int p, int q) {
        x = p;
        y = q;
        System.out.println("parent's constructor  Executed");
        System.out.println(x);
        System.out.println(y);
    }

    void f1() {
        System.out.println("parent Function 1 Executed");

    }

    void f2() {
        System.out.println("parent Function 2 Executed");

    }
}

class Nokia2 extends Nokia1 {
    int z;

    Nokia2() {
        super(10, 12);
        System.out.println("Child 's nokia2 constructor  Executed");

    }

    void f3() {
        System.out.println("Child Function 1 Executed");
    }
}

class SingleWithConstruct {
    public static void main(String[] args) {

        Nokia2 n2 = new Nokia2();
        n2.f1();
        n2.f2();
        n2.f3();
    }
}
