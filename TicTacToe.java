import java.util.Scanner;

public class TicTacToe 
{
    private char [][] grid;
    char player;
    
    public TicTacToe()
    {
        grid = new char [3][3];
        char [] symbols = {'X', 'O'};
        int r = (int)(Math.random() * 2)+0;
        player = symbols[r];
        
        for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col < grid[row].length; col++)
                grid[row][col] = '*';
        }
        System.out.println("here is your board");
        print();
    }
    
    public char winner()
    {
        char winner = '!';
        for(int row = 0; row < grid.length; row++)
        {
          if(grid[row][0] == grid[row][1] && grid[row][1] == grid[row][2] && grid[row][0] != '*' )
          {
            winner = grid[row][0];
          }
          for(int col = 0; col < grid[row].length; col ++) 
          {
            if(grid[0][col] == grid[1][col] && grid[1][col] == grid[2][col] && grid[0][col] != '*')
            {
              winner = grid[0][col];
            }
          }
          
        }
        if(grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[0][0] != '*')
        {
          winner = grid[0][0];
        }
        if(grid[2][0] == grid[1][1] && grid[1][1] == grid[0][2] && grid[2][0] != '*')
        {
          winner = grid[2][0];
        }
        return winner;
    }

    public void turn()
    {
        System.out.println("Player is: " + player);
        Scanner scan = new Scanner(System.in);
        //Enter Row
        System.out.print("Enter row: ");
        int r = scan.nextInt() - 1;
      
        //Enter Col
        System.out.print("Enter column: ");
        int c = scan.nextInt() - 1;
      
        //TAKEN SPOT
        while (grid[r][c] != '*' )
        {
            System.out.println("That space is occupied, please choose another spot");
            System.out.print("Enter row: ");
             r = scan.nextInt() - 1;
            
            
            System.out.print("Enter column: ");
             c = scan.nextInt() - 1;
        }
        //Switch player
        grid[r][c] = player;
        if(player == 'X')
            player = 'O';
        else
            player = 'X';
    }
    
    public void print()
    {
      for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col < grid[row].length; col++)
                System.out.print(grid[row][col] + " ");
            
            System.out.println("");
        }                 
    }

    public void game()
    {
      char status = winner();
      int counter = 0;

      while (counter < 9)
      {
        counter++;
        if (status != '!')
        {
          status = winner();
        }
        else
        {
          turn();
          print();
          status = winner();

        }
      }
      if(status != '!')
        System.out.println("The winner is: " + status);
      else
        System.out.println("YOU GUYS TIED");
      
    }
    public static void main(String args[]) 
    {
       Main g = new Main();
       g.game();
        
    }
}