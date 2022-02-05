package org.virajshah.jleetcode.problems.MostBeautifulItem2070;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    private Solution solution;

    private int[][] EXAMPLE1_ITEMS = new int[][] { { 1, 2 }, { 3, 2 }, { 2, 4 }, { 5, 6 }, { 3, 5 } };
    private int[] EXAMPLE1_QUERIES = new int[] { 1, 2, 3, 4, 5, 6 };
    private int[] EXAMPLE1_EXPECTED = new int[] { 2, 4, 5, 5, 6, 6 };

    private int[][] EXAMPLE2_ITEMS = new int[][] { { 1, 2 }, { 1, 2 }, { 1, 3 }, { 1, 4 } };
    private int[] EXAMPLE2_QUERIES = new int[] { 1 };
    private int[] EXAMPLE2_EXPECTED = new int[] { 4 };

    private int[][] EFFICIENCY1_ITEMS = new int[][] { { 1, 1 }, { 1, 1000000000 }, { 1, 1000000000 } };
    private int[] EFFICIENCY1_QUERIES = new int[] { 1000000000 };
    private int[] EFFICIENCY1_EXPECTED = new int[] { 1000000000 };

    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public final void testExample1() {
        int[] res = solution.maximumBeauty(EXAMPLE1_ITEMS, EXAMPLE1_QUERIES);
        assertEquals(Arrays.toString(EXAMPLE1_EXPECTED), Arrays.toString(res));
    }

    @Test
    public final void testExample2() {
        int[] res = solution.maximumBeauty(EXAMPLE2_ITEMS, EXAMPLE2_QUERIES);
        assertEquals(Arrays.toString(EXAMPLE2_EXPECTED), Arrays.toString(res));
    }

    @Test
    public final void testEfficiency1() {
        int[] res = solution.maximumBeauty(EFFICIENCY1_ITEMS, EFFICIENCY1_QUERIES);
        assertEquals(Arrays.toString(EFFICIENCY1_EXPECTED), Arrays.toString(res));
    }

    @Test
    public final void testWhenQueryIsNotInMap() {
        int[] res = solution.maximumBeauty(new int[][] { { 5000, 5000 } }, new int[] { 5001 });
        assertEquals(Arrays.toString(new int[] { 5000 }), Arrays.toString(res));
    }

    @Test
    public final void testOther() {
        int[] res = solution.maximumBeauty(
                new int[][] { { 193, 732 }, { 781, 962 }, { 864, 954 }, { 749, 627 }, { 136, 746 }, { 478, 548 },
                        { 640, 908 }, { 210, 799 }, { 567, 715 }, { 914, 388 }, { 487, 853 }, { 533, 554 },
                        { 247, 919 }, { 958, 150 }, { 193, 523 }, { 176, 656 }, { 395, 469 }, { 763, 821 },
                        { 542, 946 }, { 701, 676 } },
                new int[] { 885, 1445, 1580, 1309, 205, 1788, 1214, 1404, 572, 1170, 989, 265, 153, 151, 1479, 1180,
                        875, 276, 1584 });
        assertEquals(Arrays.toString(new int[] { 962, 962, 962, 962, 746, 962, 962, 962, 946, 962, 962, 919, 746, 746,
                962, 962, 962, 919, 962 }), Arrays.toString(res));
    }

}
