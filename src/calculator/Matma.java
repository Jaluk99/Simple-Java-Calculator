package calculator;

public class Matma {

    public static void delta(double a, double b, double c) {

        double d;
        double x0, x1, x2;

        d = Math.pow(b, 2) - 4 * a * c;
        d = Math.sqrt(d);

        if((int) d == 0) {
            x0 = -b / 2 * a;
            System.out.println("Wynik delty to x0: " + x0);
        } else if((int) d > 0) {
            x1 = (-b - d) / 2 * a;
            x2 = (-b + d) / 2 * a;
            System.out.println("Wynik delty to x1: " + x1 + " x2: " + x2);
        } else {
            System.out.println("Delta nie ma rozwiązania");
        }
    }

    public static double dodawanie(double a, double b) {
        return a + b;
    }

    public static double odejmowanie(double a, double b) {
        return a - b;
    }

    public static double dzielenie(double a, double b) {
        return a / b;
    }

    public static double mnozenie(double a, double b) {
        return a * b;
    }

    public static double potegowanie(double a, double b) {
        return Math.pow(a, b);
    }

    public static double pierwiastkowanie(double a) {
        return Math.sqrt(a);
    }
}
