class abc{
    public void show(){
        System.out.println("in a show");
    }
}

class bac extends abc{
    public void show(){
        System.out.println("in b show");
    }
}

class cba extends abc{
    public void show(){
        System.out.println("in c show");
    }
}


public class DMD {
    public static void main(String[] args) {
      abc obj = new abc();
      obj.show();

//      System.out.println(obj);

        obj = new cba();
        obj.show();


        obj = new bac();
        obj.show();

    }
}
