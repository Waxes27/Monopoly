import board.Board;
import board.blocks.PropertyPackage.PropertyTypes;
import io.github.cdimascio.dotenv.Dotenv;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class BlockTest {
    public Board board = new Board();

    public BlockTest() throws IOException {
    }


    @Test
    public void testBlockPropertiesNames() throws IOException {
        Dotenv propertyName = Dotenv.load();

        for (int i = 1; i <= 3; i++) {
            assertEquals(board.getBlockAtIndex(i).getName(),propertyName.get(String.valueOf(i)));
        }
    }

    @Test
    public void testBlockPropertyTypes() throws IOException {
        Board board = new Board();

        new PropertyTypes().initBlockType(board.getBlockAtIndex(5));
        new PropertyTypes().initBlockType(board.getBlockAtIndex(0));
        new PropertyTypes().initBlockType(board.getBlockAtIndex(12));
        new PropertyTypes().initBlockType(board.getBlockAtIndex(10));
        new PropertyTypes().initBlockType(board.getBlockAtIndex(17));
        new PropertyTypes().initBlockType(board.getBlockAtIndex(7));
        new PropertyTypes().initBlockType(board.getBlockAtIndex(6));
        new PropertyTypes().initBlockType(board.getBlockAtIndex(20));
        new PropertyTypes().initBlockType(board.getBlockAtIndex(28));

        assertEquals("station",board.getBlockAtIndex(5).getType());
        assertEquals("jail",board.getBlockAtIndex(10).getType());
        assertEquals("payment",board.getBlockAtIndex(0).getType());
        assertEquals("chance",board.getBlockAtIndex(7).getType());
        assertEquals("property",board.getBlockAtIndex(6).getType());
        assertEquals("utilities",board.getBlockAtIndex(12).getType());
        assertEquals("free parking",board.getBlockAtIndex(20).getType());
        assertEquals("chest",board.getBlockAtIndex(17).getType());
        assertEquals("utilities",board.getBlockAtIndex(28).getType());
    }
    @Test
    public void testBlockPropertyTypesStations() throws IOException {
        Board board = new Board();
        for (int i = 5; i < 40; i = i + 10) {
            board.getBlockAtIndex(i);
            assertEquals("station",board.getBlockAtIndex(i).getType());
        }
    }


    @Test
    public void testBlockPropertyTypesFreeParking() throws IOException {
        Board board = new Board();
        new PropertyTypes().initBlockType(board.getBlockAtIndex(20));
        assertEquals("free parking",board.getBlockAtIndex(20).getType());
    }


    @Test
    public void testBlockPropertyTypesChance() throws IOException {
        Board board = new Board();
        int[] listOfChance = {7,22,36};


        for (int i : listOfChance) {
            new PropertyTypes().initBlockType(board.getBlockAtIndex(i));
            assertEquals("chance",board.getBlockAtIndex(i).getType());
        }
    }

    @Test
    public void testBlockPropertyTypesCommunityChest() throws IOException {
        Board board = new Board();
        int[] listOfChance = {2,17,33};


        for (int i : listOfChance) {
            new PropertyTypes().initBlockType(board.getBlockAtIndex(i));
            assertEquals("chest",board.getBlockAtIndex(i).getType());
        }
    }


}
