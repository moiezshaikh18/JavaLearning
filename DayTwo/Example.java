class Area{
    static void funOne(){
        System.out.println("Area 1");
    }
}


class Example{

static void funOne(){
    System.out.println("A");
}

static void funTwo(){
    System.out.println("B");
}

    public static void main(String[]args){
        System.out.println("Example java");
        funOne();
        funTwo();
        Area.funOne();
    }
}