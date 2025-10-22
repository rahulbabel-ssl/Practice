class Employee{

    private String name;
    private double salary;

    public Employee(){

    }

    public String getDetails(String name , double salary){
//        this.name = name;
//        this.salary = salary;
        return ("Name: " + name +" Salary: " + salary);
    }
}


class Manager extends Employee{
    public Manager() {
        super();
    }
    private String department;
    public String getDetails(String name , double salary , String department){
//        this.department = department;

        return ("Name: " + name + "Salary: " + salary + "department: " + department);
    }
}


public class Exercise {
    public static void main(String[] args) {

        Employee obj = new Employee();
        Manager obj2 = new Manager();

//        String details = obj2.getDetails("RB ",15000,"Software Development ");

        String detail  = obj.getDetails("BR",30000);

//        System.out.println(details);
        System.out.println(detail);

    }
}
