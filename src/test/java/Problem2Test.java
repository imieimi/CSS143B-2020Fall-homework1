import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        //assertTrue(false);
        // add your tests here
        int inputs[][] = {
                {},
                {1},
                {2, 1},
                {3, 1, 2},
                {4, 2, 1, 3},
                {1, 5, 4, 2, 3},
                {4, 1, 3, 2, 6, 5}
        };
        int answers[][] = {
                {},
                {1},
                {1, 2},
                {1, 2, 3},
                {1, 2, 3, 4},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5, 6}
        };

        for(int i = 0; i < inputs.length; i++) {
            int[] currentArray = inputs[i];
            int[] currentExpected = answers[i];
            Problem2.bubbleSort(currentArray);
                assertArrayEquals(currentExpected, currentArray);
        }
    }
}
