abstract class Demo1 {
    int x, y;

    abstract void f1();

    Demo1() {
        x = 5;
        y = 5;
    }
}

class Demo extends Demo1 {
    void f1() {
        System.out.println("This has been executed from Demo class");
    }
}

class Abs {
    public static void main(String[] args) {
        Demo d1 = new Demo();

        d1.f1();
        System.out.println(d1.x);
        System.out.println(d1.y);

    }
}