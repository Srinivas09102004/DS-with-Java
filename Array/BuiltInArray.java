package builtinarray;
import java.util.Arrays;
public class BuiltInArray {
 public static void main(String[] args) {
 int[] array = {33, 12, 44, 55, 66};
 System.out.println(array);
 System.out.println(Arrays.toString(array));
 //deepToString
 int[][] array2 = {{1, 2}, {3, 4}};
 System.out.println(array2);
 System.out.println(Arrays.deepToString(array2));
 //sort
 Arrays.sort(array);
 System.out.println(Arrays.toString(array));
 int[] array3 = new int[10];
 //fill
 Arrays.fill(array3, 5);
 System.out.println(Arrays.toString(array3));
 //copyOf 
 int[] array4 = {1, 2, 3, 4, 5};
 int[] copy = Arrays.copyOf(array4, 3);
 System.out.println(Arrays.toString(copy));
 int[] copy2 = Arrays.copyOf(array4, 6);
 System.out.println(Arrays.toString(copy2));
 //copyOfRange
 int[] copy3 = Arrays.copyOfRange(array4, 2, 5);
 System.out.println(Arrays.toString(copy3));
 }
}