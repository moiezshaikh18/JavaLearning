class Demo {
    int x, y;

    // Constructor has same name of Class
    // Ex:- Demo -----> Demo()
    Demo(int p, int q) {
        x = p;
        y = q;
        System.out.println(p);
        System.out.println(q);
    }

    // Constructor Overloading
    Demo() {
        System.out.println("Without args");
    }

    Demo(int f) {
        x = f;
        System.out.println("With One Arg Constructor:" + f);

    }

    void f1() {
        System.out.println("Function F1 Executed");
    }

}

class Construct {
    public static void main(String[] args) {
        Demo d1 = new Demo(15, 20);
        Demo d3 = new Demo(); // don't throw an error as it has constructor overloading
        Demo d4 = new Demo(10);
    }
}