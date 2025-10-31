/*
LeetCode 704: Binary Search

Problem Description:
Given an array of integers nums which is sorted in ascending order, 
and an integer target, write a function to search for target in nums.

If target exists, return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.


*/

class binarysearch {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        binarysearch obj = new binarysearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};

        System.out.println("Target 9 found at index: " + obj.search(nums, 9));   
        System.out.println("Target 2 found at index: " + obj.search(nums, 2));   
    }
}
