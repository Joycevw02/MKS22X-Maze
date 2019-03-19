import java.util.*;
import java.io.*;
public class Driver{
    public static void main(String[]args){
      String file1 = "data1.dat";
      String file2 = "data2.dat";
      String file3 = "data3.dat";
      try{
        Maze f1, f2, f3;

        f1 = new Maze(file1);
        f2 = new Maze(file2);
        f3 = new Maze(file3);

        f1.setAnimate(true);
        f2.setAnimate(true);
        f3.setAnimate(true);

        f1.solve();
        f2.solve();
        f3.solve();

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
      }catch(FileNotFoundException e){
        System.out.println("Invalid filename");
      }
    }
}
