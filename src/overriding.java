class a{
    public void show(){
        System.out.println("in a");
    }

    public void con(){
        System.out.println("in a config");
    }
}
class b extends a{
    public void show(){
        System.out.println("in b");
    }
}


public class overriding {
    public static void main(String[] args) {
        b obj = new b();
        obj.show();
        obj.con();
    }

}
