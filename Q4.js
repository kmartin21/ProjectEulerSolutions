/* 
//Largest palindrome product

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

function largestThreeDigitPalindrome() {
    let largestPalindrome = 0

    for (let i = 101; i <= 999; i++) {
        for (let j = 101; j <= 999; j++) {
            let result = i * j
            if (result === reverseNum(result) && result > largestPalindrome) {
                largestPalindrome = result
            }
        }
    }

    return largestPalindrome
}

function reverseNum(num) {
    const reversedNumStr = num.toString().split("").reverse().join("")
    return parseInt(reversedNumStr)
}

console.log(largestThreeDigitPalindrome())



