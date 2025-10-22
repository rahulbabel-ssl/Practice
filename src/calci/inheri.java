
package calci;
 class calci {
     public int add(int n1, int n2) {
         return n1 + n2;
     }

     public int sub(int n1, int n2) {
         return n1 - n2;
     }


     public class inheri {

         public static class advcalci extends calci {
             public int mul(int n1, int n2) {
                 return n1 * n2;
             }

             public int div(int n1, int n2) {
                 return n1 / n2;
             }
         }

         public static class vadavcalci extends advcalci {
             public double power(int n1, int n2) {
                 return Math.pow(n1, n2);
             }
         }

         public static void main(String[] args) {
             vadavcalci obj = new vadavcalci();
             int r = obj.add(1, 2);
             int r2 = obj.mul(1, 2);
             double r3 = obj.power(2, 2);
             System.out.println(r2);
         }


     }

 }