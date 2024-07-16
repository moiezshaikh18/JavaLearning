class Example {
    protected int x;
    protected int y;

    void f1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
    }

};

// "Super" keyword to access parent member in child

class Example1 extends Example {

    int x, y;

    void f3(int x, int y) {
        super.x = x;
        super.y = y;
    }

    void display() {
        System.out.println(super.x);
        System.out.println(super.y);
    }

}

class ThisK {
    public static void main(String[] args) {

        Example1 e2 = new Example1();

        e2.f3(8, 9);
        e2.display();
        // Example e1 = new Example();

        // e1.f1(2, 5);
        // e1.display();

    }

}
