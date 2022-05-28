package Wyjątki;

public class Task1 {
    public static double divide (double a, double b){
        if (b == 0){
            throw new RuntimeException("CannotDivideBy0Exception");
        }
        return a/b;
    }

    public static void main(String[] args) {
        double result = divide(4.2, 0);
        System.out.println(result);
    }
}
