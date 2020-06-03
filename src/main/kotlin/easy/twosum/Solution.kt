package easy.twosum

class Solution {
    /**
     * My original solution
     *
     * Size O(1)
     * Speed O(n^2)
     *
     * Submit results
     * --------------
     * Runtime: 288 ms, faster than 26.42% of Kotlin online submissions for Two Sum.
     * Memory Usage: 34.6 MB, less than 100.00% of Kotlin online submissions for Two Sum.
     */
    fun twoSum_size(nums: IntArray, target: Int): IntArray {
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
        throw IllegalArgumentException("No solution available")
    }


    /**
     * Created after looking at provided Java solutions
     *
     * Size O(1)
     * Speed O(n^2)
     *
     * Submit results
     * --------------
     * Runtime: 184 ms, faster than 83.55% of Kotlin online submissions for Two Sum.
     * Memory Usage: 35 MB, less than 100.00% of Kotlin online submissions for Two Sum.
     */
    fun twoSum_speed(nums: IntArray, target: Int): IntArray {
        val complementMap = HashMap<Int, Int>()
        var complement = 0
        for (i in nums.indices) {
            complement = target - nums[i]
            complementMap[nums[i]]?.let { return intArrayOf(it, i) }
            complementMap[complement] = i
        }
        throw IllegalArgumentException("No solution available")
    }
}

