/* 
//Largest palindrome product

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

/* 
//Largest palindrome product

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

class Q4 {

    public static void main(String[] args) {
        System.out.println(largestThreeDigitPalindrome());
    }

    private static int largestThreeDigitPalindrome() {
        int largestPalindrome = 0;
        
        for (int i = 101; i <= 999; i++) {
            for (int j = 101; j <= 999; j++) {
                int result = i * j;
                
                if (reverseNum(result) == result && result > largestPalindrome) {
                    largestPalindrome = result;
                }
            }
        }

        return largestPalindrome;
    }

    private static int reverseNum(int num) {
        int reverse = 0;
        while (num != 0) {
            reverse = (reverse * 10) + (num % 10);
            num = num / 10;
        }
        
        return reverse;
    }
}




