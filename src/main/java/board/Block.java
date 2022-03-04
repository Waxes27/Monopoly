package board;

import io.github.cdimascio.dotenv.Dotenv;

import java.util.ArrayList;

public class Block {
    private int id = 0;
    private ArrayList playerList;
    private String name;
    private String type;

    public Block(int id){

        setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        Dotenv propertyName = Dotenv.load();
        setName(propertyName.get(String.valueOf(id)));

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList playerList) {
        this.playerList = playerList;
    }

    public void setType(String type) {
        System.out.println(type);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Block{" +
                "id=" + id +
                ", playerList=" + playerList +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
