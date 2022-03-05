import board.Board;
import board.Player.Player;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    public Board board;
    public PlayerTest() throws IOException {
        board = new Board();
    }

    @Test
    public void testStartingPostion() throws IOException {
        Player player1 = new Player();
        assertEquals(0, player1.getCurrentPosition());
        assertEquals("go", board.getBlockAtIndex(player1.getCurrentPosition()).getName());
    }

    @Test
    public void testPlayerPropertyList(){
        Player player1 = new Player();
        assertEquals(new ArrayList<>(), player1.getProperties());
    }

}

