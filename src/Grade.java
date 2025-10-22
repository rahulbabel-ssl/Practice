class detail{
    public static String  rollNo(int no){
        return "roll no is : " + no;
    }
    public static String grade(int marks){
        if(marks>=90 && marks<=100){
            return "garde is: " + "A";
        } else if (marks<=89 && marks>=60) {
            return "garde is: " + "B";
        } else if (marks<=59 && marks>=39) {
            return "garde is: " + "C";
        }else{
            return "garde is: " + "fail";
        }
    }
}


public class Grade {
    public static void main(String[] args) {
        detail obj = new detail();
        obj.rollNo(123);
        obj.grade(56);
    }



}
