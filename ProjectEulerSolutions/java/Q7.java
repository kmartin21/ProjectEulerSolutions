/*
//10001st prime

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10001st prime number?
*/

class Q7 {

    public static void main(String[] args) {
        System.out.println(findPrimeNumber());
    }

    private static int findPrimeNumber() {
        int currNum = 1;
        int totalPrimeNumCount = 1;

        while (totalPrimeNumCount < 10001) {
            currNum += 2;
            if (isPrime(currNum)) {
                totalPrimeNumCount += 1;
            }
        }

        return currNum;
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= getSqrtCeil(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static int getSqrtCeil(int num) {
        return (int) Math.ceil(Math.sqrt(num));
    }
}

