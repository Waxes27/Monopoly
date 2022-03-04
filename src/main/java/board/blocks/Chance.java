package board.blocks;

import board.Block;
import io.github.cdimascio.dotenv.Dotenv;

import java.util.ArrayList;

public class Chance implements Block {
    private int id;
    private ArrayList playerList;
    private String name;
    private String type;

    public Chance(int i){
        setId(i);
        setName(Dotenv.load().get(String.valueOf(i)));
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public ArrayList getPlayerList() {
        return null;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setPlayerList(ArrayList playerList) {
        this.playerList = playerList;
    }

}
