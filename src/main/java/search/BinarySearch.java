package search;

import java.util.List;

public class BinarySearch {
    /**
     * Returns the index at which the element exists in a sorted List. Returns -1 if not found.
     * @param element the Comparable to search for
     * @param list the pre-sorted List
     * @return
     */
    public synchronized <T> int inSortedList(T element, List<? extends Comparable<? super T>> list) {
        int leftbound = 0;
        int rightbound = list.size();
        int middle;
        Comparable currentElement;
        int compareTo;

        while (leftbound <= rightbound) {
            middle = (leftbound + rightbound)/2;
            currentElement = list.get(middle);
            compareTo = currentElement.compareTo(element);
            if (compareTo == 0) {
                return middle;
            } else if (compareTo > 0) { // current element greater than / true index less than
                rightbound = middle - 1;
            } else { // current element less than / true element greater than
                leftbound = middle + 1;
            }
        }
        return -1;
    }
}
