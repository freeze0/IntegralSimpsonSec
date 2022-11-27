import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill lower bound");
        double a = sc.nextDouble();
        System.out.println("Fill answer");
        double q = sc.nextDouble();
        System.out.println("Fill fragmentation");
        double n = sc.nextDouble();
        SimpsonSec ss = new SimpsonSec(a, q, n);
        System.out.println("Fill accuracy");
        double eps = sc.nextDouble();
        System.out.println("Fill bounds of Secant method");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        System.out.println(ss.Sec(x1, x2, eps));
    }
}
