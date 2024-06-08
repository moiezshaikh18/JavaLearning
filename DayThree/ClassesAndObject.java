class Nokia {
    private int mic;
    private int camera;

    void setVale() {
        mic = 2;
        camera = 40;
    }

    void display() {
        System.out.println(mic);
        System.out.println(camera);
    }

}

class ClassesAndObject {
    public static void main(String[] args) {

        Nokia n1 = new Nokia();
        n1.display();
        n1.setVale();

    }

}
