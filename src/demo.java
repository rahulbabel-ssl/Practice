

class phone {
    int version;
    static int price;

    static {
        price =54673;
        System.out.println("in static block");
    }

    public phone(){
        version = 1457;
//        price = 12345;
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(version + " : " + price + " : ");
    }

//    public static void show1(phone sam) {
//        System.out.println(sam.version);
//    }
public static class demo {

        public static void main(String[] args) {
            phone app = new phone();
            app.version = 123;


//            phone sam = new phone();
//            sam.version = 234;
//            sam.price = 34500;
//
//            phone.show1(sam);




            phone obj = new phone();

        }

     }

    }







