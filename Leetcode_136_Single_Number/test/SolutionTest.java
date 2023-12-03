import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution accessToSolution = new Solution();

    SolutionTest() {
    }

    @Test
    @DisplayName("Test Case #1")
    void singleNumberTestCaseOne() {
        int[] nums = new int[]{2, 2, 1};
        int output = 1;
        int actual = this.accessToSolution.singleNumber(nums);
        Assertions.assertEquals(output, actual);
    }

    @Test
    @DisplayName("Test Case #2")
    void singleNumberTestCaseTwo() {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        int output = 4;
        int actual = this.accessToSolution.singleNumber(nums);
        Assertions.assertEquals(output, actual);
    }

    @Test
    @DisplayName("Test Case #3")
    void singleNumberTestCaseThree() {
        int[] nums = new int[]{1};
        int output = 1;
        int actual = this.accessToSolution.singleNumber(nums);
        Assertions.assertEquals(output, actual);
    }

    @Test
    @DisplayName("Test Case #4")
    void singleNumberTestCaseFour() {
        int[] nums = new int[]{-336, 513, -560, -481, -174, 101, -997, 40, -527, -784, -283, -336, 513, -560, -481, -174, 101, -997, 40, -527, -784, -283, 354};
        int output = 354;
        int actual = this.accessToSolution.singleNumber(nums);
        Assertions.assertEquals(output, actual);
    }
}