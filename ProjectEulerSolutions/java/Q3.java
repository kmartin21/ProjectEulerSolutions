import java.util.*;

/*
// Largest prime factor

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143? 
*/

class Q3 {
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(600851475143L));
    }

    private static long largestPrimeFactor(long inputNumber) {
        Set<Long> primeFactors = new HashSet<Long>();

        for (long i = 2; i <= inputNumber; i++) {
            if (inputNumber % i == 0) {
                primeFactors.add(i);
                inputNumber /= i;
                i--;
            }
        }
        
        return findLargestNum(primeFactors);
    }

    private static long findLargestNum(Set<Long> primeFactors) {
        long currLargestNum = 0;
        for (long primeFactor : primeFactors) {
            if (currLargestNum < primeFactor) {
                currLargestNum = primeFactor;
            }
        }
        return currLargestNum;
    }
}