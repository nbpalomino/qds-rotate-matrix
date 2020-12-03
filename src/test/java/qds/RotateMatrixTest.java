package qds;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrixTest {

  private RotateMatrix matrix;
  private final int[][] normalMatrix = {{1,2,3}, {4,5,6}, {7,8,9}};
  private final int[][] rotatedMatrix = {{3,6,9}, {2,5,8}, {1,4,7}};
  private final int[][] rotated2Matrix = {{9,8,7}, {6,5,4}, {3,2,1}};
  private final int[][] wrongMatrix = {{1,2,3}, {4,5,6}, {7,8}};

  private final int[][] matrix4x4 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
  private final int[][] rotatedMatrix4x4 = {{4,8,12,16},{3,7,11,15},{2,6,10,14},{1,5,9,13}};

  @BeforeEach
  void setUp() {
    this.matrix = new RotateMatrix();
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void isValid() {
    assertTrue(matrix.isValid(normalMatrix));
    assertFalse(matrix.isValid(wrongMatrix));
  }

  @Test
  void apply() {
    //no operative
  }

  @Test
  void rotate() {
    assertArrayEquals(rotatedMatrix, matrix.rotate(normalMatrix));

    assertArrayEquals(rotated2Matrix, matrix.rotate(rotatedMatrix));

    assertArrayEquals(rotatedMatrix4x4, matrix.rotate(matrix4x4));
  }
}
