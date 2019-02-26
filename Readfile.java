import java.io.*;
import java.util.*;
public class Readfile{
  public static void main(String args[]){
    int[][] maze;
    int row = 0;
    int col = 0;
    try{
      File text = new File("Maze1.txt");
      Scanner s = new Scanner(text);
      while (s.hasNextLine()){
        String temp = s.nextLine();
        System.out.println(temp);
      }
      while (s.hasNextLine()){
        String temp = s.nextLine();
        for (int i = 0; i < temp.length(); i ++){
          
        }
      }
    }
    catch (FileNotFoundException e){
      System.out.println("File not found");
    }
  }
}
