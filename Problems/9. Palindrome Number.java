class Solution {
  //MY SOLUTION #MATHS
    public boolean isPalindrome(int x) {
        // If the number is negative, return false
        // If the last digit is zero, return false
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }

        int secondHalf = 0;
        while (x > secondHalf) {
            secondHalf = x % 10 + secondHalf * 10;
            x = x / 10;
        }
        // While first half > second half
        // To get the last digit, x % 10 (1221 % 10 = 1)
        // To get the Nnd to last digit, we can divide x / 10 (1221 / 10 = 122)in the first iteration, and then
        // get the value from doing x % 10 (122 % 10 = 2)

        // Multiply the previous digit by 10 (1 * 10) then add the most recent last digit, 1 * 10 + 2 = 12


        //if first half == second half, return true
        //if odd, if first half == second half / 10 return true
        return x == secondHalf || x == secondHalf / 10;
    }
}
