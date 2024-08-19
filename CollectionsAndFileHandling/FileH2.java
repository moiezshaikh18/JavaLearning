import java.io.*;

class FileH2 {

    public static void main(String[] args) throws Exception {

        String s1 = "Coding Seekho";

        File h1 = new File("a.txt");

        FileOutputStream f1 = new FileOutputStream(h1, true);

        char c1[] = s1.toCharArray();

        for (int i = 0; i < c1.length; i++) {

            f1.write(c1[i]);
        }
        f1.close();
    }

}
