class laptop {

    String model;
    int price;

    public String toString(){
        return model + " : " + price;
    }

    public boolean equals(laptop that){
        if(this.model.equals(that.model)&& this.price == that.price){
            return true;
        }
        else
            return false;
    }

}



public class Hash {
    public static void main(String[] args) {
        laptop obj1 = new laptop();
        obj1.model = "dell vostro";
        obj1.price = 15000;

        laptop obj2 = new laptop();
        obj2.model = "dell vostro";
        obj2.price = 15000;

        boolean result = obj1.equals(obj2);
        System.out.println(result);

    }
}
