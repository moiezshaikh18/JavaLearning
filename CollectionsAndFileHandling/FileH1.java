import java.io.*;

class FileH1 {
    public static void main(String[] args) throws Exception {
        File f1 = new File("Text.txt");
        boolean a = f1.exists();

        if (a) {
            System.out.println("This file Exists");
        } else

        {
            System.out.println("Not Exists");
        }

        try {
            f1.createNewFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}