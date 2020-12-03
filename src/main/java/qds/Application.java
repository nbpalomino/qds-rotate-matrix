package qds;

public class Application {
    public static void main(String[] args) {
      RotateMatrix rotateMatrix = new RotateMatrix();
      int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
      System.out.println("Rotating 3x3 matrix...");
      rotateMatrix.apply(matrix);

      int[][] matrix2x2 = {{1,2},{3,4}};
      System.out.println("Rotating 2x2 matrix...");
      rotateMatrix.apply(matrix2x2);

      int[][] matrix4x4 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      System.out.println("Rotating 4x4 matrix...");
      rotateMatrix.apply(matrix4x4);
  }
}
