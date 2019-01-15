/*
//Smallest multiple

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

class Q5 {
    public static void main(String[] args) {
        System.out.println(smallestEvenlyDivisible());
    }

    private static int smallestEvenlyDivisible() {
        int smallestEvenlyDivisible = 2520;
        boolean isDivisible = true;
        while(true) {
            isDivisible = true;

            for (int i = 11; i <= 20; i++) {
                if (smallestEvenlyDivisible % i != 0) {
                    isDivisible = false;
                    smallestEvenlyDivisible += 2;
                    break;
                }
            }

            if (isDivisible) {
                break;
            }
        }

        return smallestEvenlyDivisible;
    }
}