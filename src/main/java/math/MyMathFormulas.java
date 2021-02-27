package math;

import java.util.function.Function;

public class MyMathFormulas {
    private static final double dx = 1e-6;
    public static long getSumOfElementsBetween(long left, long right) {
        return (right * (right + 1) - left * (left - 1)) / 2;
    }

    public static double Integrate(Function<Double, Double> f, double a, double b) {
        double now = a;
        double sum = 0;
        while (now < b) {
            double f1 = f.apply(now);
            double f2 = f.apply(Math.min(b, now + dx));
            sum += (f1 + f2) / 2 * dx;
            now += dx;
        }
        return sum;
    }
}
