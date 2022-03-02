package board;

import java.util.ArrayList;

public class Board {
    ArrayList<Block> listOfBlocks = new ArrayList<>();

    public Board(){
        for (int i = 0; i < 40; i++) {
            listOfBlocks.add(new Block(i));
        }
    }

    public Block getBlockAtIndex(int index){
        /*
        Get a Block object at a specific index
         */
        for (Block i: listOfBlocks) {
            if (i.getId() == index){
                System.out.println(i);
                return i;
            };
        }

        return null;
    }
}
