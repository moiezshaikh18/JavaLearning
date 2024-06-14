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

class Nokia3 extends Nokia2 {
    int w;

    void f4() {
        System.out.println("child function 1 Nokia3 executed");
    }
}

class Multilevel {
    public static void main(String[] args) {
        Nokia3 n3 = new Nokia3();

        n3.f1();
        n3.f2();
        n3.f3();
        n3.f4();
    }
}
