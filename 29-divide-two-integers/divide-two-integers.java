class Solution {
    public int divide(int dividend, int divisor) {

        // Overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        // Determine sign
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert to positive long
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;

        // Bit manipulation
        while (a >= b) {
            int shift = 0;
            while (a >= (b << (shift + 1))) {
                shift++;
            }
            a -= (b << shift);
            result += (1 << shift);
        }

        return negative ? -result : result;
    }
}
