/*
//Special Pythagorean triplet

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

*/

class Q9 {

    public static void main(String[] args) {
        System.out.println(findPythagTriple());
    }

    private static double findPythagTriple() {
        final int BOUNDS = 1000;

        for (double a = 0; a < BOUNDS; a++) {
            for (double b = a + 1; b < BOUNDS; b++) {
                double squaredResult = Math.pow(a, 2) + Math.pow(b, 2);
                double c = Math.sqrt(squaredResult);

                if ((c > b) && (a + b + c == 1000)) {
                    return a * b * c;
                }
            }
        }

        return 0;
    }

}











