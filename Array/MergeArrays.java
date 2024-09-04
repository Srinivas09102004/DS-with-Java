package mergearrays;
import java.util.Arrays;
public class MergeArrays {
 public static void main(String[] args) {
 // Part 1: arrays to be merged.
 int[] values = {10, 20, 30};
 int[] values2 = {100, 200, 300};
 // Part 2: merge the 2 arrays with for-loops.
 int[] merge = new int[values.length + values2.length];
 for (int i = 0; i < values.length; i++) {
 merge[i] = values[i];
 }
 // Part 3: loop with offset.
 for (int i = 0; i < values2.length; i++) {
 merge[i + values.length] = values2[i];
 }
 // Display the merged array.
 System.out.println(Arrays.toString(merge));
 }
}