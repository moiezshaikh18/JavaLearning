import java.io.IOException;

class ExceptionH4 {
    public static void main(String[] args) throws Exception {

        System.out.println("A");

        try {
            throw new IOException("Printer Not found");
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }finally{
            System.out.println("Finally Message B");
        }
    }
}