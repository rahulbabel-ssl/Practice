class s{

    public void show1(){
        System.out.println("in s show");
    }
}
class r extends s{

    public void show2(){
        System.out.println("in r show");
    }
}


public class UpDown {
    public static void main(String[] args) {
//        r obj = new r();
//        obj.show1();
//        obj.show2();

        s obj = (s) new r();
        obj.show1();

         r obj1 = (r) obj;
         obj1.show2();

    }
}
