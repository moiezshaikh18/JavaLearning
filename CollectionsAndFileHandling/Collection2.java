import java.util.*;

class Collection2 {
    public static void main(String[] args) {
        ArrayList<String> l2 = new ArrayList<>();

        l2.add("A");
        l2.add("b");
        l2.add("c");
        l2.add(3, "d");
        l2.add(4, "e");

        Iterator<String> g1 = l2.iterator();
        while (g1.hasNext()) {
            if (g1.next() == "A") {
                System.out.println(g1.next());
            }
        }
    }
}
