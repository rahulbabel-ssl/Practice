class C extends Object{
    public C() {
        super();//here we are calling the constructor of the object class
        System.out.println("in c");
    }

    public C(int n) {
        //super();

        System.out.println("in c n");
    }
}

class D extends C{

    public D(){
        super();
        System.out.println("in d");
    }

    public D(int n){
        this();
        System.out.println("in d n");
    }

}

public class A {
    public static void main(String[] args) {

        D obj = new D(369);
    }
}
