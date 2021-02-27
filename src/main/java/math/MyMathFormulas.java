package math;

public class MyMathFormulas {
    public static long getSumOfElementsBetween(long left, long right) {
        return (right * (right + 1) - left * (left - 1)) / 2;
    }
}
