public class AverageMethod {
    public static void main(String[] args) {
        System.out.println(avg());
    }
    public static double sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static String avg() {
        return "The average is: "+ (sum(2, 5, 8) / 3);
    }
}
