package search;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class BinarySearchTest {
    BinarySearch binarySearcher = new BinarySearch();

    List<Integer> integerList = new ArrayList<Integer>();
    List<String> stringList = new ArrayList<String>();
    List<Double> doubleList = new ArrayList<Double>();


    @Before
    public void setup() {
        Collections.addAll(integerList, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        Collections.addAll(stringList, "a", "b", "c", "d", "e", "fff", "gg", "z");
        Collections.addAll(doubleList, 0.1, 0.5, 1.3, 2.8, 999.0, 1000.200, 10000., 1500000.);
    }

    @Test
    public void integer_exists_1() {
        assertEquals(3, binarySearcher.inSortedList(4, integerList));
    }

    @Test
    public void string_exists_1() {
        assertEquals(7, binarySearcher.inSortedList("z", stringList));
    }

    @Test
    public void double_notfound_1() {
        assertEquals(-1, binarySearcher.inSortedList(0.001, doubleList));
    }

    @Test
    public void double_exists_1() {
        assertEquals(5, binarySearcher.inSortedList(1000.2, doubleList));
    }

    @Test
    public void integer_exists_2() {
        assertEquals(0, binarySearcher.inSortedList(1, integerList));
    }
}
