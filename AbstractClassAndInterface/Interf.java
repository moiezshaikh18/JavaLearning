interface i1 {
    int x = 6;

    void f2();
}

interface i2 extends i1 {
    int y = 4;

    void f3();
}

class Csub implements i2 {
    public void f2() {
        System.out.println(x);
    }

    public void f3() {
        System.out.println(y);

    }
}

class Interf {
    public static void main(String[] args) {
        Csub c1 = new Csub();
        c1.f2();
        c1.f3();
    }
}