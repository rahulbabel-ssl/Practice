class discount{
 String author;
 int price;

 public String disc(String author , int price) {
     if(price > 500){
         System.out.println("book by " + author + " and valid for discount");
     }
     return "discount of rs : " + (price*10)/100;
 }

}



public class Book {
    public static void main(String[] args) {
        discount obj = new discount();
        String  res = obj.disc("RB",963);
        System.out.print(res);
    }

}
