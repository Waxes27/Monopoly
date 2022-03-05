package board.blocks.PropertyPackage;

import board.Player.Player;
import board.blocks.Block;
import io.github.cdimascio.dotenv.Dotenv;

import java.util.ArrayList;

public class Station implements Block {
    private int id;
    private ArrayList playerList;
    private String name;
    private String type;
    private Player owner;

    public Station(int i){
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
