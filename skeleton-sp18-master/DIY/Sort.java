public class Sort {
    public static void sort(String[] x) {
        //find the smallest item
        //move it into the front
        // selection sort the rest (using recursion?)

        sort(x, 0);
    }


    /** sort the array from the start position */
    public static void sort(String[] x, int start) {
        int smallestIndex = findsmallest(x,start);
        if (start == x.length) {
            return;
        }
        swap(x, start, smallestIndex);
        sort(x, start + 1);
    }

    /** return the index of smallest string in x, from the start position */
    public static int findsmallest(String[] x, int start) {
        int smallestIndex = start;
        for (int i = start; i < x.length; i += 1) {
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp < 0) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    /** swap item a with b */
    public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }


}
