import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeGameTest {

    //test to make sure the board is empty
    @Test
    public void testEmptyBoard() {
        TicTacToeGame board1 = new TicTacToeGame();
        assertNull(board1.checkWinner(),null);
    }

    //test to make sure x turn is set
    @Test
    public void testTurn() {
        TicTacToeGame board1 = new TicTacToeGame();
        board1.setTurn("X");
        assertEquals(board1.getTurn(),"X");
    }

    //test all the possible win conditions
    @Test
    public void testBoardCaseZero() {
        TicTacToeGame board1 = new TicTacToeGame();
        board1.setBoardCaseZero();
        assertEquals(board1.checkWinner(),"X");
    }
    //test all the possible win conditions
    @Test
    public void testBoardCaseOne() {
        TicTacToeGame board1 = new TicTacToeGame();
        board1.setBoardCaseOne();
        assertEquals(board1.checkWinner(),"X");
    }
    //test all the possible win conditions
    @Test
    public void testBoardCaseTwo() {
        TicTacToeGame board1 = new TicTacToeGame();
        board1.setBoardCaseTwo();
        assertEquals(board1.checkWinner(),"X");
    }
    //test all the possible win conditions
    @Test
    public void testBoardCaseThree() {
        TicTacToeGame board1 = new TicTacToeGame();
        board1.setBoardCaseThree();
        assertEquals(board1.checkWinner(),"X");
    }
    //test all the possible win conditions
    @Test
    public void testBoardCaseFour() {
        TicTacToeGame board1 = new TicTacToeGame();
        board1.setBoardCaseFour();
        assertEquals(board1.checkWinner(),"X");
    }
    //test all the possible win conditions
    @Test
    public void testBoardCaseFive() {
        TicTacToeGame board1 = new TicTacToeGame();
        board1.setBoardCaseFive();
        assertEquals(board1.checkWinner(),"X");
    }
    //test all the possible win conditions
    @Test
    public void testBoardCaseSix() {
        TicTacToeGame board1 = new TicTacToeGame();
        board1.setBoardCaseSix();
        assertEquals(board1.checkWinner(),"X");
    }
    //test all the possible win conditions
    @Test
    public void testBoardCaseSeven() {
        TicTacToeGame board1 = new TicTacToeGame();
        board1.setBoardCaseSeven();
        assertEquals(board1.checkWinner(),"X");
    }

}
