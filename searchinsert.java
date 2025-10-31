/*
 LeetCode 35: Search insert Position

Problem Description:
Given a sorted array of distinct integers and a target value,
return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
*/
class Solution {
    public int searchinsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; 
            } else if (nums[mid] < target) {
                start = mid + 1; 
            } else {
                end = mid - 1;  
            }
        }

        return start; 
    }

    
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums1 = {1, 3, 5, 6};
        System.out.println("insert position for 5: " + obj.searchinsert(nums1, 5)); 
        System.out.println("insert position for 2: " + obj.searchinsert(nums1, 2)); 
        System.out.println("insert position for 7: " + obj.searchinsert(nums1, 7)); 
        System.out.println("insert position for 0: " + obj.searchinsert(nums1, 0)); 
    }
}
