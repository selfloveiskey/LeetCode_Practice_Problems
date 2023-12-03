import java.util.Arrays;

public class Solution {
    public Solution() {
    }

    public int singleNumber(int[] nums) {

        /**
         * 1st step is to sort the array to make it easier
         * to find the element that is not repeated in the array
         */
        int[] sortedArray = Arrays.stream(nums).sorted().toArray();

        /**
         * Will iterate through the array using two pointers to speed up the process
         */
        int current = 0;
        int next = 1;

        int distinctNumber = -9999;
        int iterationCounter = 1;

        /**
         * Check to see if the array only has one value.
         */
        if(sortedArray.length == 1){

            distinctNumber = nums[current];

            return distinctNumber;
        }

        while (iterationCounter != sortedArray.length) {

            /**
             * Scenario #1
             * If the current and next values do not match we have our distinct element..Yaay!!
             */
            if (sortedArray[current] != sortedArray[next]) {

                distinctNumber = sortedArray[current];

                break;
            }
            /**
             * Scenario #2
             * If we will throw an out-of-bounds error when we update the next pointer,
             * increase the current pointer then assign it as the distinct element then
             * break out of the loop.
             */
            else if((next + 2) == sortedArray.length){

                distinctNumber = sortedArray[current + 2];

                break;
            }

            /**
             * Increment the following to grab the two next elements. Skips the duplicates.
             */
            current = current + 2;
            next = next + 2;

            /**
             * Increment
             */
            iterationCounter++;
        }
        return distinctNumber;
    }
}