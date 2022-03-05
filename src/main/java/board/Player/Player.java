package board.Player;

import board.Board;
import board.blocks.Block;
import board.blocks.PropertyPackage.Property;

import java.io.IOException;
import java.util.ArrayList;

public class Player {
    int currentPosition;
    ArrayList<Property> properties;
    Block currentBlock;

    public Player(){
        currentPosition = 0;
        properties = new ArrayList<>();
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public Block getCurrentBlock() {
        return currentBlock;
    }

    public void setCurrentBlock(Board board) throws IOException {
        this.currentBlock = board.getBlockAtIndex(this.currentPosition);
    }

    public void setCurrentBlock(Block currentBlock) {
        this.currentBlock = currentBlock;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }


}
