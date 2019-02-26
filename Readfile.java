import java.io.*;
import java.util.*;
public class Readfile{
  public static void main(String args[]){
    try{
      File text = new File("Maze1.txt");
      Scanner s = new Scanner(text);
      while (s.hasNextLine()){
        String temp = s.nextLine();
        System.out.println(temp);
      }
    }
    catch (FileNotFoundException e){
      System.out.println("File not found");
    }
  }
}
