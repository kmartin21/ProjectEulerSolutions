/*
//Smallest multiple

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

function smallestEvenlyDivisible() {
    let smallestNum = 2520
    let isDivisible = true

    while (true) {
        isDivisible = true
        for (let i = 11; i <= 20; i++) {
            if (smallestNum % i != 0) {
                isDivisible = false
                smallestNum += 2
                break
            }
        }
        if (isDivisible) break
    }

    return smallestNum
}

console.log(smallestEvenlyDivisible())








