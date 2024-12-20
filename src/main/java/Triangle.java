import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Введи a, b, c:");
        double num1 = new Scanner(System.in).nextDouble();
        double num2 = new Scanner(System.in).nextDouble();
        double num3 = new Scanner(System.in).nextDouble();

        is_Triangle(num1, num2, num3);

    }

    static double get_triangle_area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("S = " + s);
        return s;
    }

    static boolean is_Triangle(double a, double b, double c) {
        if (a + b > c && c + b > a && a + c > b) {
            System.out.println("Yes, Exists");
            get_triangle_area(a, b, c);
            return true;
        } else {
            System.out.println("Not exists");
            return false;
        }
    }
}
