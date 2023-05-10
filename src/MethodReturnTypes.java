public class MethodReturnTypes {
    public static void main(String[] args) {
       System.out.println(returnString());
       System.out.println(returnInteger());
       System.out.println(returnBoolean());
    }
    public static String returnString() {
            return "String of text";
    }
    public static int returnInteger() {
        return 5;
    }
    public static boolean returnBoolean() {
        return false;
    }
}
