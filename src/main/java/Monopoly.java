import board.Board;

import java.io.IOException;

public class Monopoly {
    public static void main(String[] args) throws IOException {
        Board board = new Board();
        System.out.println(board.getBlockAtIndex(5));
    }
}
