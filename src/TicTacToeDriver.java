import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToeDriver {
    public static void main(String[] args)
    {
        TicTacToeGame game = new TicTacToeGame();
        Scanner in = new Scanner(System.in);

        String winner = null;
        game.setTurn("X");

        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        game.originalBoard();

        System.out.println("X will play first. Enter a slot number to place X in:");

        while (winner == null) {
            int numInput;

            // check if valid number inputed
            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Invalid input; re-enter slot number:");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input; re-enter slot number:");
                continue;
            }
            game.checkTurn(numInput);
            game.playBoard();
            winner = game.checkWinner();
        }

        // if no winner then draw
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("It's a draw! Thanks for playing.");
        }

        // message for winner
        else {
            System.out.println(winner + " has won! Thanks for playing.");
        }
    }
}
