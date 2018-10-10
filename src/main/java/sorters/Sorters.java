package java.sorters;

import java.util.List;

public class Sorters {
    private interface Sorter {
        void sort(List<Comparable> list);
    }

    /**
     * Iterative implementation using only 2*n memory total.
     */
    public static class MergeSort implements Sorter {

        public void sort(List<Comparable> list) {

        }
    }

    /**
     * In-place implementation using no extra memory over the input object.
     */
    public static class QuickSort implements Sorter {

        public void sort(List<Comparable> list) {

        }
    }

}
