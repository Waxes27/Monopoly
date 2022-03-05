package board;



import board.blocks.Block;
import board.blocks.Chance;
import board.blocks.Chest;
import board.blocks.PropertyPackage.Parking;
import board.blocks.PropertyPackage.Property;
import board.blocks.PropertyPackage.PropertyTypes;
import board.blocks.PropertyPackage.Station;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Board {
    ArrayList<Block> listOfBlocks = new ArrayList<>();
    List<Integer> stationList = List.of(5,15,25,35);
    List<Integer> chanceList = List.of(7,22,36);
    List<Integer> chestList = List.of(2,17,33);

    public Board() throws IOException {
        PropertyTypes type = new PropertyTypes();
        for (int i = 0; i < 40; i++) {
            if(stationList.contains(i))
            {
                listOfBlocks.add(new Station(i));
            }
            else if (i == 20){
                listOfBlocks.add(new Parking(i));
            }
            else if(chanceList.contains(i)){
                listOfBlocks.add(new Chance(i));
            }

            else if(chestList.contains(i)){
                listOfBlocks.add(new Chest(i));
            }

            else {
                listOfBlocks.add(new Property(i));
            }

        }

        for (Block i : listOfBlocks){
            type.initBlockType(i);
        }
    }

    public Block getBlockAtIndex(int index) throws IOException {
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
