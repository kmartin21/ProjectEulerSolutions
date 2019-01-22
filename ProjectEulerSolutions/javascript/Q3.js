/*
// Largest prime factor

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143? 
*/

function largestPrimeFactor(inputNumber) {
    const primeFactors = []
    
    for(let i = 2; i <= inputNumber; i++) {
        if (inputNumber % i === 0) {
            primeFactors.push(i)
            inputNumber /= i
            i--;
        }
    }

    return Math.max(...primeFactors)
}

console.log(largestPrimeFactor(600851475143))

