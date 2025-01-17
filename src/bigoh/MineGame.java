package bigoh;

import java.util.Scanner;

public class MineGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Mine game");
        System.out.println("Please select the Level you want to play: ");
        System.out.println("Enter 1 for easy level");
        System.out.println("Enter 2 for medium level");
        System.out.println("Enter 3 for hard level");

        int userLev = getValidInput(sc, true);
        System.out.println("Please enter Row Size between 1-9");
        int row = getValidInput(sc, false);
        System.out.println("Please enter Column Size between 1-9");
        int col = getValidInput(sc, false);

    

        startGame(row, col, userLev, sc);
    }
//taking inpu from user and checking range of input
    private static int getValidInput(Scanner sc, boolean isLevel) {
        while (true) {
            String input = sc.nextLine();
            if (isValidNumber(input)) {
                int value = Integer.parseInt(input);
                if (isLevel) {
                    if (value >= 1 && value <= 3) {
                        return value;
                    }
                    System.out.println("Please enter a level between 1 to 3");
                } else {
                    if (value >= 1 && value <= 9) {
                        return value;
                    }
                    System.out.println("Please enter a size between 1 to 9");
                }
            } else {
                System.out.println("Please enter a valid number");
            }
        }
    }
// checking input is a number
    private static boolean isValidNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

//initial prining he game and generating mines
    private static void startGame(int row, int col, int userLev, Scanner sc) {
        char[][] board = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = '-';
            }
        }
        printBoard(board);// print function

        char[][] mines = generateMines(row, col, userLev);// mines generation function
        playGame(mines, board, sc);// game start
    }

    
    // mines generation function
    private static char[][] generateMines(int row, int col, int Lev) {
        char[][] mineField = new char[row][col];
        int aa=(int) (System.currentTimeMillis()%40);// using mod 40 for time
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                if (Lev == 1 && ((j) % 2 == 0)&& aa>20) {
                    mineField[i][j] = 'm';
                } else if(Lev == 1 && ((j) % 3 == 0)&& aa<20){
                     mineField[i][j] = 'm';
                }
                
                else if (Lev == 2 && ((i) % 2 == 0 || ((i * j) % 5 == 0) && aa>20)) {
                    mineField[i][j] = 'm';
                } 
                  else if (Lev == 2 && ((i) % 3 == 0 || ((i * j) % 5 == 0) && aa<20)) {
                    mineField[i][j] = 'm';
                } 
                else if (Lev == 3 && ((((i * j) % 2 == 0 || (i * j) % 5 == 0 || (i * j) % 7 == 0)))&&aa>20) {
                    mineField[i][j] = 'm';
                }
                 else if (Lev == 3 && ((((i * j) % 3 == 0 || (i * j) % 6 == 0 || (i * j) % 7 == 0)))&&aa<20) {
                    mineField[i][j] = 'm';
                }
                
                
                else {
                    mineField[i][j] = '-';
                }
            }
        }
        return mineField;
    }
//using loop unitl user meets end
    private static void playGame(char[][] mines, char[][] board, Scanner sc) {
        while (true) {
            System.out.println("Select a row between 1 and " + mines.length);
            System.out.println("Select a column between 1 and " + mines[0].length);
            int row = getValidInput(sc, false) - 1;
            int col = getValidInput(sc, false) - 1;

            if (row < 0 || row >= mines.length || col < 0 || col >= mines[0].length) {
                System.out.println("Please enter numbers within the valid range.");
                continue;
            }

            if (mines[row][col] == 'm') {
                System.out.println("Game over Sorry");
                printBoard(mines);
                break;
            } else {
                if (board[row][col] == 'o') {
                    System.out.println("already been selected.");
                } else {
                    board[row][col] = 'o';
                   // DFS(mines,board,row,col);
                    printBoard(board);
                }
            }
        }
    }
//static void DFS(char[][] M,char board[][], int r, int c) {
//        int row = M.length;
//        int col = M[0].length;
//
//        // Base condition
//       
//        if (r < 0 || c < 0 || r >= row || c >= col || (M[r][c] == 'm'||board[r][c]!='o')) {
//            return;
//        }
//
//       
//        board[r][c] = 'o';
//
//        DFS(M,board,r+1,c);
//        DFS(M,board,r-1,c);
//        DFS(M,board,r,c+1);
//        DFS(M,board,r,c-1);}
        
// loop for prining the game
    
    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
