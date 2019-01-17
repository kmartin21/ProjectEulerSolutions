/*
//10001st prime

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10001st prime number?
*/

function findPrimeNumber() {
    let currNum = 1
    let totalPrimeNumCount = 1

    while (totalPrimeNumCount < 10001) {
        currNum += 2
        if (isPrime(currNum)) {
            totalPrimeNumCount += 1
        }
    }

    return currNum
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


console.log(findPrimeNumber())




