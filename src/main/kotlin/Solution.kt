class Solution {
    // Counter window goes brrrrrrr
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var startIndex = 0
        var offset = 1
        while ((startIndex + offset) < nums.size) {
            if (nums[startIndex] + nums[startIndex + offset] == target) {
                return intArrayOf(startIndex, startIndex + offset)
            }
            offset++
            if (startIndex + offset == nums.size) {
                startIndex++
                offset = 1
            }
        }
        return intArrayOf()
    }
}