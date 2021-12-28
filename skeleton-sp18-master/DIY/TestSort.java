public class TestSort {
    public static void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);

        org.junit.Assert.assertArrayEquals(input, expected);

    }

    /** test for method find the smallest item */
    public static void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;
        int actual = Sort.findsmallest(input, 0);
        org.junit.Assert.assertEquals(expected, actual);

        String[] input2 = {"there", "are", "many", "pigs"};
        int expected2 = 1;
        int actual2 = Sort.findsmallest(input2, 1);
        org.junit.Assert.assertEquals(expected2, actual2);
    }

    /** test for method to swap A and B */
    public static void testSwap() {
        int a = 0;
        int b = 2;
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "have", "i", "egg"};
        Sort.swap(input, a, b);

        org.junit.Assert.assertArrayEquals(input, expected);

    }

    /** test for method to selection sort the rest */
    public static void test() {
        int a = 0;
        int b = 2;
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "have", "i", "egg"};
        Sort.swap(input, a, b);

        org.junit.Assert.assertArrayEquals(input, expected);

    }

    /** test for the sort method */
    public static void testsort() {
        String[] input = {"a", "c", "d", "b"};
        String[] expected = {"a", "b", "c", "d"};
        Sort.sort(input, 0);
        org.junit.Assert.assertArrayEquals(input, expected);
    }

    public static void main(String[] args) {
        testsort();
//        testFindSmallest();
    }
}