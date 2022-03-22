import board.Board;
import board.blocks.Block;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Monopoly {
    public static void main(String[] args) throws IOException, ParseException {
        ObjectMapper mapper = new ObjectMapper();
        Board board = new Board();
        for (Block i: board.getListOfBlocks()) {
            i.setAttributes();
            System.exit(2);
            ;
        }
    }
}
