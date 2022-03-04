package board;

import io.github.cdimascio.dotenv.Dotenv;

import java.util.ArrayList;

public interface Block {
    int id = 0;
    ArrayList playerList = new ArrayList();
    String name = "";
    String type = "";

//    public Block(int id){
//        setId(id);
//    }

    public int getId();
    public ArrayList getPlayerList();
    public String getType();
    public String getName();


    public void setId(int id);
    public void setName(String name);
    public void setType(String type);
    public void setPlayerList(ArrayList playerList);

}
