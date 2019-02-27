import java.io.*;
import java.util.*;
public class Readfile{
  public static void main(String args[]){
    try{
      File text = new File("Maze1.txt");

      System.out.println("Reading from the string form:");
      Scanner stringform = new Scanner(text);
      while (stringform.hasNextLine()){
        String temp = stringform.nextLine();
        System.out.println(temp);
      }
      System.out.println();
      stringform.close();

      System.out.println("Reading from the array form:");
      Scanner arraycount = new Scanner(text);
      int row = 0;
      int col = 0;
      //This counts the number of rows and columns so that you can initialize
      //the array
      while (arraycount.hasNextLine()){
        String temp = arraycount.nextLine();
        if (row == 0){
          for (int i = 0; i < temp.length(); i ++){
            col += 1;
          }
        }
        row += 1;
      }
      arraycount.close();

      Scanner arrayform = new Scanner(text);
      char[][] maze = new char[row][col];
      int r = 0;
      //Loop through each row and add every char at each space
      while (arrayform.hasNextLine()){
        String temp = arrayform.nextLine();
        for (int i = 0; i < col; i ++){
          maze[r][i] = temp.charAt(i);
        }
        r += 1;
      }
      //Loop through each row and add every char at each column and a new line
      //once it reaches the end of the row
      for (int r2 = 0; r2 < row; r2 ++) {
        for (int c = 0; c < col; c ++) {
          System.out.print(maze[r2][c]);
        }
        System.out.println();
      }
      arrayform.close();
    }
    catch (FileNotFoundException e){
      System.out.println("File not found");
    }
  }
}
