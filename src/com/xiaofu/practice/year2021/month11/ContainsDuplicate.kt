package com.xiaofu.practice.year2021.month11

class ContainsDuplicate {
    // 效率不高，占用空间大
    fun isDuplicate(nums: IntArray): Boolean {
        val map = HashMap<Int, Int>()
        for (i in nums.indices){
            if (map[nums[i]] != null){
                return true
            }else{
                map[nums[i]] = nums[i]
            }
        }
        return false
    }
}