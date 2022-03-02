import board.Board;
import board.PropertyTypes;
import io.github.cdimascio.dotenv.Dotenv;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

import java.util.ArrayList;

public class BlockTest {
    public Board board = new Board();


    @Test
    public void testBlockPropertiesNames(){
        Dotenv propertyName = Dotenv.load();

        for (int i = 1; i <= 3; i++) {
            assertEquals(board.getBlockAtIndex(i).getName(),propertyName.get(String.valueOf(i)));
        }
    }

    @Test
    public void testBlockPropertyTypes() throws IOException {
        Board board = new Board();

        new PropertyTypes().initBlockType(board.getBlockAtIndex(6));
        new PropertyTypes().initBlockType(board.getBlockAtIndex(1));
        new PropertyTypes().initBlockType(board.getBlockAtIndex(13));
        new PropertyTypes().initBlockType(board.getBlockAtIndex(11));
        new PropertyTypes().initBlockType(board.getBlockAtIndex(18));
        new PropertyTypes().initBlockType(board.getBlockAtIndex(8));
        new PropertyTypes().initBlockType(board.getBlockAtIndex(7));
        new PropertyTypes().initBlockType(board.getBlockAtIndex(21));
        new PropertyTypes().initBlockType(board.getBlockAtIndex(29));

        assertEquals("station",board.getBlockAtIndex(6).getType());
        assertEquals("jail",board.getBlockAtIndex(11).getType());
        assertEquals("payment",board.getBlockAtIndex(1).getType());
        assertEquals("chance",board.getBlockAtIndex(8).getType());
        assertEquals("property",board.getBlockAtIndex(7).getType());
        assertEquals("utilities",board.getBlockAtIndex(13).getType());
        assertEquals("free parking",board.getBlockAtIndex(21).getType());
        assertEquals("chest",board.getBlockAtIndex(18).getType());
        assertEquals("utilities",board.getBlockAtIndex(29).getType());
    }
    @Test
    public void testBlockPropertyTypesStations() throws IOException {
        Board board = new Board();
        for (int i = 6; i < 40; i = i + 10) {
            new PropertyTypes().initBlockType(board.getBlockAtIndex(i));
            assertEquals("station",board.getBlockAtIndex(i).getType());
        }
    }


    @Test
    public void testBlockPropertyTypesFree() throws IOException {
        Board board = new Board();
        new PropertyTypes().initBlockType(board.getBlockAtIndex(21));
        assertEquals("free parking",board.getBlockAtIndex(21).getType());
    }


    @Test
    public void testBlockPropertyTypesChance() throws IOException {
        Board board = new Board();
        int[] listOfChance = {8,23,37};


        for (int i : listOfChance) {
            new PropertyTypes().initBlockType(board.getBlockAtIndex(i));
            assertEquals("chance",board.getBlockAtIndex(i).getType());
        }
    }

    @Test
    public void testBlockPropertyTypesCommunityChest() throws IOException {
        Board board = new Board();
        int[] listOfChance = {3,18,34};


        for (int i : listOfChance) {
            new PropertyTypes().initBlockType(board.getBlockAtIndex(i));
            assertEquals("chest",board.getBlockAtIndex(i).getType());
        }
    }


}
