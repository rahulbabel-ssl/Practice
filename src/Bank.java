class operations{

    double balance;

    public String deposit(int amt){

        return "Deposited money is " + (balance + amt);
    }
    public String withdraw(int wamt){
        if (wamt > balance) {
            return "Insufficient balance! Current balance: " + balance;
        }
        balance -= wamt;
        return "Withdrawn money is: " + wamt;

    }
    public double displayBalance(){
        return  balance;
    }
}




public class Bank {

    public static void main(String[] args) {
        operations obj = new operations();

        obj.balance = 10000;
        System.out.println("balance " + obj.displayBalance());
        String d = obj.deposit(1600);
        String w = obj.withdraw(1000);
        System.out.println(d);
        System.out.println(w);
        System.out.println("balance " +  obj.displayBalance());


    }
}
