class Solution {
    public int reverse(int x) {
        int reverse=0;
        boolean isNegative = (x < 0); 
        x = Math.abs(x);
        
        while (x != 0) {
            int digit = x % 10;

            // Check for overflow before updating reverse
            if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
                return 0; // Return 0 in case of overflow
            }

            reverse = reverse * 10 + digit;
            x /= 10;
        }

        return isNegative ? -reverse : reverse;
    }
}