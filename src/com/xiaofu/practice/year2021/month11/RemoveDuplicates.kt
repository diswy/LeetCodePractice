package com.xiaofu.practice.year2021.month11

class RemoveDuplicates {
    fun remove(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }
        var left = 0
        for (right in 1 until nums.size) {
            if (nums[left] != nums[right]){
                nums[++left] = nums[right]
            }
        }
        return left
    }
}