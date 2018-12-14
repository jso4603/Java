public class StringEqualsExample {
    public static void main(String[] args) {
        String strvar1 = "장상옥";
        String strvar2 = "장상옥";
        String strvar3 = new String("장상옥");

        System.out.println(strvar1 == strvar2);
        System.out.println(strvar1 == strvar3);
        System.out.println();
        System.out.println((strvar1.equals(strvar2)));
        System.out.println(strvar1.equals(strvar3));
    }
}
