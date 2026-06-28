package StringToInter;

class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        int result = 0;
        int index = 0;
        int n = s.length();

        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        if (index < n && (s.charAt(index) == '-' || s.charAt(index) == '+')) {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        for (int i = index; i < n; i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') break;

            int digit = c - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
        }

        return result * sign;
    }
}
