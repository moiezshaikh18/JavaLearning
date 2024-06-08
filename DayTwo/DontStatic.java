class NonStatic{


    int x; // this is instance(Object) member varibale
     int y; //this is instance member varibale

    void funOne(){ // member function
System.out.println("FunOne");
    }
    void funTwo(){
System.out.println("Funtwo");
    }
}

class DontStatic{
    public static void main(String[]args){

NonStatic n1 = new NonStatic();

n1.funOne();
n1.funTwo();


System.out.println(n1.x);

    }
}