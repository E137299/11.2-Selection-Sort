import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {
    @Test
    public void testSelectionSort() {
        int[] array = {64, 25, 12, 22, 11};
        int[] expected = {11, 12, 22, 25, 64};
        
        SelectionSort.selectionSort(array);
        assertArrayEquals(expected, array);
    }
}