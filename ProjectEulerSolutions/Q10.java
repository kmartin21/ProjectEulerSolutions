/*
//Summation of primes

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/

class Q10 {

    public static void main(String[] args) {
        System.out.println(sumOfPrimes());
    }

    private static double sumOfPrimes() {
        final int BOUND = 2000000;
        double sum = 2;

        for(double i = 3; i < BOUND; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    private static boolean isPrime(double num) {
        for (double i = 2; i <= getSqrtCeil(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static double getSqrtCeil(double num) {
        return Math.ceil(Math.sqrt(num));
    }
}







