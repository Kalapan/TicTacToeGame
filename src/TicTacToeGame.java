import java.util.Scanner;
import java.util.*;

public class TicTacToeGame {

    private String[] board = new String[9];
    private String turn;

    // go through all combinations to find winner
    public String checkWinner()
    {
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            //For X winner
            if (line.equals("XXX")) {
                return "X";
            }

            // For O winner
            else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(a + 1))) {
                break;
            }
            else if (a == 8) {
                return "draw";
            }
        }

        // To enter the X Or O at the exact place on board.
        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }

    // To print out the board.
    public void originalBoard()
    {
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }

        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    // To print out the board.
    public void playBoard()
    {
        System.out.println("|---|---|---|   |---|---|---|");
        System.out.println("| " + "1" + " | " + "2" + " | " + "3" + " |" + "   " + "| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|---|---|---|   |---|---|---|");
        System.out.println("| " + "4" + " | " + "5" + " | " + "6" + " |" + "   " + "| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|---|---|---|   |---|---|---|");
        System.out.println("| " + "7" + " | " + "8" + " | " + "9" + " |" + "   " + "| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|   |---|---|---|");
    }

    public void setTurn(String turn){
        this.turn = turn;
    }

    public String getTurn(){
        return turn;
    }

    //decide turn
    public String checkTurn(int numInput) {
        if (board[numInput - 1].equals(String.valueOf(numInput))) {
            board[numInput - 1] = turn;

            if (turn.equals("X")) {
                setTurn("O");
            }
            else {
                setTurn("X");
            }
        }
        else {
            System.out.println("Slot already taken; re-enter slot number:");
            return null;
        }
        return turn;
    }

    //board cases manually set for testing
    public void setBoardCaseZero() {
        board[0] = "X";
        board[1] = "X";
        board[2] = "X";
    }
    public void setBoardCaseOne() {
        board[3] = "X";
        board[4] = "X";
        board[5] = "X";
    }
    public void setBoardCaseTwo() {
        board[6] = "X";
        board[7] = "X";
        board[8] = "X";
    }
    public void setBoardCaseThree() {
        board[0] = "X";
        board[3] = "X";
        board[6] = "X";
    }
    public void setBoardCaseFour() {
        board[1] = "X";
        board[4] = "X";
        board[7] = "X";
    }
    public void setBoardCaseFive() {
        board[2] = "X";
        board[5] = "X";
        board[8] = "X";
    }
    public void setBoardCaseSix() {
        board[0] = "X";
        board[4] = "X";
        board[8] = "X";
    }
    public void setBoardCaseSeven() {
        board[2] = "X";
        board[4] = "X";
        board[6] = "X";
    }
}

