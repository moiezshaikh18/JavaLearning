package PackSixTwo;

import PackSixOne.*;

class PackageTwo {
    public static void main(String[] args) {
        PackageOne p1 = new PackageOne();

        p1.setData(5, 10);
        p1.display();
    }
}