class Wrap {
    public static void main(String[] args) {
        int x = Integer.parseInt("123");
        Integer i1 = Integer.valueOf("10110", 2);
        Integer i2 = Integer.valueOf("10111110", 8);

        int y = i1.intValue();
        int y2 = i2.intValue();

        System.out.println(x);
        System.out.println(y);
        System.out.println(y2);

    }
}