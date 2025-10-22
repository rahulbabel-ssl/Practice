 class demo {
     public demo() {
         System.out.println("objected");
     }

     public void show() {
         System.out.println("showed");
     }


 }

public class anonymous {
    public static void main(String[] args) {
       new demo().show();
        new demo().show();
    }
}

