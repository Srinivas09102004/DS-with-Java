package twodimensionalarrays;
public class TwoDimensionalArrays {
 public static void main(String[] args) {
 // Step 1: create 2-dimensional array.
 int[][] values1 = new int[4][4];
 // Step 2: assign three elements in it.
 values1[0][0] = 1;
 values1[1][1] = 2;
 values1[2][2] = 3;
 values1[3][3] = 4;
 // Step 3: loop over top-level arrays.
 for (int i = 0; i < values1.length; i++) {
 // Step 4: loop and display sub-arrays.
 int[] sub = values1[i];
 for (int x = 0; x < sub.length; x++) {
 System.out.print(sub[x] + " ");
 }
 System.out.println();
 }
 // Use initialize syntax.
 int[][] values2 = {{1, 2}, {3, 4}};
 System.out.println(values2[0][0]);
 System.out.println(values2[1][0]);
 System.out.println(values2[0][1]);
 System.out.println(values2[1][1]);
 // Create an array of String arrays: a jagged array.
 String[][] values3 = new String[2][];
 // Fill first row with 2-element array.
 values3[0] = new String[2];
 values3[0][0] = "cat";
 values3[0][1] = "dog";
 // Use 3-element array for second row.
 values3[1] = new String[3];
 values3[1][0] = "fish";
 values3[1][1] = "bird";
 values3[1][2] = "lizard";
 // Display rows and elements.
 for (String[] array : values3) {
 for (String element : array) {
 System.out.print(element);
 System.out.print(" ");
 }
 System.out.println();
 }
 }
}