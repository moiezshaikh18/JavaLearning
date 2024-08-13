class ExceptionH3 {
    public static void main(String[] args) {
        int currBal = 10000;
        int wBal = 14000;
        try {
            if (currBal < wBal) {
                throw new ArithmeticException("Balance is Low");
            }
            currBal = currBal - wBal;
            System.out.println("Transcation Successfull");
            System.out.println("Current Balance:-" + currBal);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Current Balance:-" + currBal);
        }
    }
}
