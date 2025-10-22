

public class Student {
    String name;
    static int marks;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name =  "tyu";
        s1.marks  = 90;

        Student s2 = new Student();
        s2.name = "yui";
        s2.marks = 89;

        Student []students = new  Student[2];
        students[0] = s1;
        students[1] = s2;

           for(int i = 0 ; i<2 ;i++){
               System.out.println("s1 name " + students[i].name + "s1 marks "+students[i].marks);
            }

        for(Student stud : students){
            System.out.println("s1 name " + stud.name + "s1 marks "+stud.marks);


            String str =  new String("rahul");
            System.out.println(str.charAt(2));

       }


   }



}
