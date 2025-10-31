/* LeetCode 231: Power of Two

Problem Description:
Given an integer n, determine if it is a power of two.
Return true if there exists an integer x such that n == 2ˣ, otherwise return false. */
class leetcode231 {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i <= 30; i++) {
            int ans = (int) Math.pow(2, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        leetcode231 obj = new leetcode231();
        System.out.println(obj.isPowerOfTwo(16));  
        System.out.println(obj.isPowerOfTwo(3));   
        System.out.println(obj.isPowerOfTwo(1));  
    }
}
