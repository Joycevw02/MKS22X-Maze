import java.util.*;
import java.io.*;
public class Maze{
    private char[][]maze;
    private boolean animate; //false by default

    /*Constructor loads a maze text file, and sets animate to false by default.
      1. The file contains a rectangular ascii maze, made with the following 4 characters:
      '#' - Walls - locations that cannot be moved onto
      ' ' - Empty Space - locations that can be moved onto
      'E' - the location of the goal (exactly 1 per file)
      'S' - the location of the start(exactly 1 per file)
      2. The maze has a border of '#' around the edges. So you don't have to check for out of bounds!
      3. When the file is not found OR the file is invalid (not exactly 1 E and 1 S) then:
         throw a FileNotFoundException or IllegalStateException
    */

    public Maze(String filename) throws FileNotFoundException{
        //COMPLETE CONSTRUCTOR
        File m = new File(filename);
        animate = false;
        int ecount = 0;
        int scount = 0;
        //This counts the number of rows and columns so that you can initialize
        //the array
        Scanner count = new Scanner(m);
        int row = 0;
        int col = 0;
        while (count.hasNextLine()){
          String temp = count.nextLine();
          if (row == 0){
            for (int i = 0; i < temp.length(); i ++){
              col += 1;
            }
          }
          row += 1;
        }
        count.close();

        Scanner array = new Scanner(m);
        char[][] maze = new char[row][col];
        int r = 0;
        //Loop through each row and add every char at each space
        while (array.hasNextLine()){
          String temp = array.nextLine();
          for (int i = 0; i < col; i ++){
            maze[r][i] = temp.charAt(i);
            //If the char is S, add one to scount and if the char is E, add one
            //to ecount
            if (temp.substring(i,i+1).equals("S")){
              scount ++;
            }
            if (temp.substring(i,i+1).equals("E")){
              ecount ++;
            }
          }
          r += 1;
        }
        array.close();

        if (ecount != 1 || scount != 1){
          throw new IllegalStateException();
        }
    }

    private void wait(int millis){
         try {
             Thread.sleep(millis);
         }
         catch (InterruptedException e) {
         }
     }

    public void setAnimate(boolean b){
        animate = b;
    }

    public void clearTerminal(){
        //erase terminal, go to top left of screen.
        System.out.println("\033[2J\033[1;1H");
    }

   /*Return the string that represents the maze.
     It should look like the text file with some characters replaced.
    */
    public String toString(){
      String ans = "";
      for (int row = 0; row < maze.length; row ++){
        for (int col = 0; col < maze[row].length; col ++){
          ans += maze[row][col];
        }
        ans += "\n";
      }
      return ans;
    }

    /*Wrapper Solve Function returns the helper function
      Note the helper function has the same name, but different parameters.
      Since the constructor exits when the file is not found or is missing an E or S, we can assume it exists.
    */
    public int solve(){
        //find the location of the S.
        //Srow and Scol store the row and col of S
        int Srow = 0;
        int Scol = 0;
        for (int row = 0; row < maze.length; row ++){
          for (int col = 0; col < maze[row].length; col ++){
            if (maze[row][col] == 'S'){
              Srow = row;
              Scol = col;
              row = maze.length;
            }
          }
        }
        //erase the S
        maze[Srow][Scol] = ' ';
        //and start solving at the location of the s.
        //return solve(???,???);
        return solve(Srow,Scol);
    }

    /*
      Recursive Solve function:

      A solved maze has a path marked with '@' from S to E.

      Returns the number of @ symbols from S to E when the maze is solved,
      Returns -1 when the maze has no solution.


      Postcondition:

        The S is replaced with '@' but the 'E' is not.

        All visited spots that were not part of the solution are changed to '.'

        All visited spots that are part of the solution are changed to '@'
    */
    private int solve(int row, int col){ //you can add more parameters since this is private
        //automatic animation! You are welcome.
        if(animate){
            clearTerminal();
            System.out.println(this);
            wait(20);
        }
        //COMPLETE SOLVE


        return -1; //so it compiles
    }

    private boolean mark(int row, int col){

    }


}
