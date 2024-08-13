class ExceptionH2 {
    public static void main(String[] args) {
        System.out.println(5 / 0); // program will directly terminnate bcause its is infinate
        System.out.println("A");
        String s1 = null;
        try {
            System.out.println(s1.length());
        } catch (ArithmeticException e1) {
            System.out.println(e1.getMessage());
        } finally {
            System.out.println("B");
        }
        System.out.println("C");
    }
}