import java.util.*;
import java.io.*;

public class SudokuEngine {
   public static void main(String[] args) {
      String fileName = "boards/data1.sdk";
      SudokuBoard board = new SudokuBoard(fileName);  
      System.out.println(board); 
   }
   if (!board.isValid()) {
    System.out.println("Board is invalid. Cannot solve.");
} else if (board.isSolved()) {
    System.out.println("Board is already solved.");
} else {
    if (board.solve()) {
        System.out.println("Solved!");
        System.out.println(board);
    } else {
        System.out.println("No solution exists.");
    }
}
}

/*
# PROGRAM OUTPUT

 +-------+-------+-------+
 | 2 - - | 1 - 5 | - - 3 |
 | - 5 4 | - - - | 7 1 - |
 | - 1 - | 2 - 3 | - 8 - |
 +-------+-------+-------+
 | 6 - 2 | 8 - 7 | 3 - 4 |
 | - - - | - - - | - - - |
 | 1 - 5 | 3 - 9 | 8 - 6 |
 +-------+-------+-------+
 | - 2 - | 7 - 1 | - 6 - |
 | - 8 1 | - - - | 2 4 - |
 | 7 - - | 4 - 2 | - - 1 |
 +-------+-------+-------+

*/
