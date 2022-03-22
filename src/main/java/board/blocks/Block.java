package board.blocks;

import io.github.cdimascio.dotenv.Dotenv;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

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
    public Map setAttributes() throws IOException, ParseException;

}
