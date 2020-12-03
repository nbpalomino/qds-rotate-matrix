package qds;

import java.util.Arrays;

public class RotateMatrix {

  public boolean isValid(int[][] matrix) {
    int size = matrix.length;
    return Arrays.stream(matrix).filter(item -> item.length != size).count() == 0;
  }

  public void apply(int[][] matrix) {
    if(isValid(matrix)) {
      int[][] rotated =  rotate(matrix);
      System.out.println("Matrix provided: "+ Arrays.deepToString(matrix));
      System.out.println("Matrix rotated: "+ Arrays.deepToString(rotated));
    } else {
      System.out.println("Matrix provided is invalid, it should be NxN matrix");
    }
  }

  public int[][] rotate(int[][] matrix) {
    if(!isValid(matrix)) return matrix;

    int size = matrix.length;
    int[][] rotatedMatrix = new int[size][size];

    //[1,2,3]  [3,6,9]
    //[4,5,6]  [2,5,8]
    //[7,8,9]  [1,4,7]
    //int[] row0 = rotatedMatrix[0];
    //int[] row1 = rotatedMatrix[1];
    //int[] row2 = rotatedMatrix[2];
    //row0[0] = item[2]
    //row1[0] = item[1]
    //row2[0] = item[0]

    for (int idx = 0; idx < size; idx++) {
      int[] vector = matrix[idx];

      int j = (size - 1);
      for (int i = 0; i < size; i++) {
        int[] row = rotatedMatrix[i];
        row[idx] = vector[j];
        j--;
      }
    }
    return rotatedMatrix;
  }
}
