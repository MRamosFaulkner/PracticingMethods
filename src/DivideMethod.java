public class DivideMethod {
    public static void main (String[] args) {
        divide(1,3);
    }
    public static double divide(int num1, int num2) {
        double d = (double)num1 / num2;

        System.out.println(num1 +" / " + num2 + " = " + d);

        return d;
    }
}
