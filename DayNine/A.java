// with same name but has diffrenet args or no args this call Function OverLoading

class Example {

    void f1() {
        System.out.println("without args");
    }

    void f1(int x) {
        System.out.println(x);
    }

}

class A {
    public static void main(String[] args) {
        Example e1 = new Example();

        e1.f1();
        e1.f1(10);
    }
}