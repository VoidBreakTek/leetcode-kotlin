import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {
    val solution = Solution()

    @org.junit.jupiter.api.Test
    fun test_twoSum_first_last() {
        assertTrue(solution.twoSum(intArrayOf(1, 3, 4), 5).contentEquals(intArrayOf(0, 2)))
    }

    @org.junit.jupiter.api.Test
    fun test_twoSum_second_last() {
        assertTrue(solution.twoSum(intArrayOf(1, 3, 4), 7).contentEquals(intArrayOf(1, 2)))
    }

    @org.junit.jupiter.api.Test
    fun test_twoSum_first_second() {
        assertTrue(solution.twoSum(intArrayOf(1, 3, 4), 4).contentEquals(intArrayOf(0, 1)))
    }

    @org.junit.jupiter.api.Test
    fun test_twoSum_negative() {
        assertTrue(solution.twoSum(intArrayOf(-1, -2, -3, -4, -5), -8).contentEquals(intArrayOf(2, 4)))
    }
}