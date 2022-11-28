import java.util.*;

public class SimpsonSec {

    private double a, q, n;

    public SimpsonSec(double a, double q, double n) {
        this.a = a;
        this.q = q;
        this.n = n;
    }

    public double func(double x) {
        return x / (Math.pow(x, 4) + 4);
    }

    public double Simpson(double x) {
        double sumchet = 0;
        double sumnechet = 0;
        double xi = a;
        double h = (x - a) / (2 * n);
        double x2n = a + 2 * n * h;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                sumnechet += func(xi);
            if (i % 2 == 0 && i != n)
                sumchet += func(xi);
            xi = a + i * h;
        }
        return (h / 3) * (func(a) + func(x2n) + 4 * sumnechet + 2 * sumchet) - q;
    }

    public double Sec(double x_prev, double x_curr, double e) {
        double x_next = 0;
        double tmp;
        do {
            tmp = x_next;
            x_next = x_curr - Simpson(x_curr) * (x_prev - x_curr) / (Simpson(x_prev) - Simpson(x_curr));
            x_prev = x_curr;
            x_curr = tmp;
        } while (Math.abs(x_next - x_curr) > e);
        return x_next;
    }

}
// 0 0,37274 5 0,00001 0 10
