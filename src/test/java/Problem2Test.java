import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        //This was a placeholder
        //assertTrue(false);
        // add your tests here
        int[] testOne = {4, 5, 6};
        Problem2.bubbleSort(testOne);
        System.out.println();
        int[] testTwo = {5, 7, 2, 4, 9};
        Problem2.bubbleSort(testTwo);
        System.out.println();
        int[] testThree = {3, 4, 3, 3, 2, 6};
        Problem2.bubbleSort(testThree);

    }
}
