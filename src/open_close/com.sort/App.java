//Open for extensions, close for modification
//Can be ensured by applying Strategy Pattern , Template Pattern

package open_close.com.sort;

public class App {
    public static void main(String[] args) {
        PerformSort.start(new InsertionSort());
        PerformSort.start(new SelectionSort());
        PerformSort.start(new MergeSort());
    }
}
