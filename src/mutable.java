public class mutable {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("RJB");
        System.out.println(sb.capacity());
        sb.append(" biggest trading and investing firm ");
        System.out.println(sb);
    }
}
