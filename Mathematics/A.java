//Given two numbers a and b, find the sum of a and b. Since the sum can be very large, find the sum modulo 109+7.

public class A {
    public static long sumUnderModulo(long a, long b) {
        return ((a % 1000000007) + (b % 1000000007)) % 1000000007;// code here
    }
}
