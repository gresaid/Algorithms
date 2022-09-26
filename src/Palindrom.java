public class Palindrom {
    public boolean isPalindrome(int x) {

        int reversNum = 0;
        int num = x;
        if (num < 0|| (x % 10 == 0 && x != 0))
            return false;
        else {
            while (num != 0) {

                int digit = num % 10;
                reversNum = reversNum * 10 + digit;

                num /= 10;
            }
            return reversNum == x;
        }
    }
}
