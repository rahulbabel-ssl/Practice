class human{

   private int age;
    private String name;

    public human(){
      age = 22;
      name = "rb";
    }

    public human(int age,String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getName(){
        return  name;
    }

    public void setAge(int age ){//, human obj) {
//        human obj1 = obj;
//        obj1.age = age;
         this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Alien {
    public static void main(String[] args) {
       human obj = new human();
new human();

       human obj1 = new human(22,"rahul");


//       obj.setAge(22);
//       obj.setName("RB");

       System.out.println(obj.getName());
       System.out.println(obj.getAge());

        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
    }
}
