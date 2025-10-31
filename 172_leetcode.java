/* LeetCode 172: Factorial Trailing Zeroes

Problem Description:
Given an integer n, return the number of trailing zeroes in n! (n factorial).

A trailing zero is produced by the factors 10 = 2 × 5.
In any factorial, there are always more factors of 2 than factors of 5, so the number of trailing zeroes depends only on the number of times 5 is a factor in the numbers from 1 to n. */
class 172_leetcode {
    public int trailingZeroes(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }
    public static void Main(String[] args){
        int n=8;
        System.out.println(trailingZeroes(n));
    }
}
