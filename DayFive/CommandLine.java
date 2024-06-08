class CommandLine {
    public static void main(String[] args) {

        // String a[] = new String[3];
        // a[0] = "Moiz";
        // a[1] = "Husen";
        // a[2] = "Shaikh";

        for (var i = 0; i < args.length; i++) {

            System.out.println(Integer.parseInt(args[i]));
        }

    }
}