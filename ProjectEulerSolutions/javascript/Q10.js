/*
//Summation of primes

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/

function sumOfPrimes() {
    const BOUND = 2000000
    let sum = 2

    for (let i = 3; i < BOUND; i++) {
        if (isPrime(i)) {
            sum += i
        }
    }

    return sum
}

function isPrime(num) {
    for (let i = 2; i <= getSqrtCeil(num); i++) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}

function getSqrtCeil(num) {
    return Math.ceil(Math.sqrt(num))
}


console.log(sumOfPrimes())







