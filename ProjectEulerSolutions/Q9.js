/*
//Special Pythagorean triplet

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

*/

function findPythagTriplet() {
    const BOUND = 1000

    for (let a = 0; a < BOUND; a++) {
        for (let b = a + 1; b < BOUND; b++) {
            let squaredResult = Math.pow(a, 2) + Math.pow(b, 2)
            let c = Math.sqrt(squaredResult) 

            if ((c > b) && (a + b + c === 1000)) {
                return a * b * c
            }
        }
    }
}


console.log(findPythagTriplet())









