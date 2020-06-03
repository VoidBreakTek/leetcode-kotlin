package easy.twosum

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {
    private val solution = Solution()

    @org.junit.jupiter.api.Test
    fun test_twoSum_first_last_size() {
        assertTrue(
            solution.twoSum_size(intArrayOf(1, 3, 4), 5).contentEquals(intArrayOf(0, 2))
        )
    }

    @org.junit.jupiter.api.Test
    fun test_twoSum_second_last_size() {
        assertTrue(
            solution.twoSum_size(intArrayOf(1, 3, 4), 7).contentEquals(intArrayOf(1, 2))
        )
    }

    @org.junit.jupiter.api.Test
    fun test_twoSum_first_second_size() {
        assertTrue(
            solution.twoSum_size(intArrayOf(1, 3, 4), 4).contentEquals(intArrayOf(0, 1))
        )
    }

    @org.junit.jupiter.api.Test
    fun test_twoSum_negative_size() {
        assertTrue(
            solution.twoSum_size(intArrayOf(-1, -2, -3, -4, -5), -8).contentEquals(intArrayOf(2, 4))
        )
    }

    @org.junit.jupiter.api.Test
    fun test_twoSum_no_solution_size() {
        assertThrows(
            IllegalArgumentException::class.java
        ) {
            solution.twoSum_size(intArrayOf(1, 2, 3), 9)
        }
    }

    @org.junit.jupiter.api.Test
    fun test_twoSum_first_last_speed() {
        assertTrue(
            solution.twoSum_speed(intArrayOf(1, 3, 4), 5).contentEquals(intArrayOf(0, 2))
        )
    }

    @org.junit.jupiter.api.Test
    fun test_twoSum_second_last_speed() {
        assertTrue(
            solution.twoSum_speed(intArrayOf(1, 3, 4), 7).contentEquals(intArrayOf(1, 2))
        )
    }

    @org.junit.jupiter.api.Test
    fun test_twoSum_first_second_speed() {
        assertTrue(
            solution.twoSum_speed(intArrayOf(1, 3, 4), 4).contentEquals(intArrayOf(0, 1))
        )
    }

    @org.junit.jupiter.api.Test
    fun test_twoSum_negative_speed() {
        assertTrue(
            solution.twoSum_speed(intArrayOf(-1, -2, -3, -4, -5), -8).contentEquals(intArrayOf(2, 4))
        )
    }

    @org.junit.jupiter.api.Test
    fun test_twoSum_no_solution_speed() {
        assertThrows(
            IllegalArgumentException::class.java
        ) {
            solution.twoSum_speed(intArrayOf(1, 2, 3), 9)
        }
    }
}