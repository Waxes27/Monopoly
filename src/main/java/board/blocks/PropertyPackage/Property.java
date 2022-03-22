package board.blocks.PropertyPackage;

import board.Player.Player;
import board.blocks.Block;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.github.cdimascio.dotenv.Dotenv;
//import org.json.JSONObject;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Property implements Block {

    private int id;
    private ArrayList playerList;
    private String name;
    private String type;
    private Player owner;
    private Map attributes;

    public Property(int i){
        setId(i);
        setName(Dotenv.load().get(String.valueOf(i)));
    }


    public Map setAttributes() throws IOException {
        File file = new File(
                Objects.requireNonNull(this.getClass().getClassLoader()
                        .getResource("propertiesTemplate.json")).getFile()
        );
        ObjectMapper mapper = new ObjectMapper();
        Map json = mapper.readValue(file, Map.class);
        String[] list = json.get("properties").toString()
                .replace("[", "")
                .replace("]", "").split("}");

        for (String i: list) {
            System.out.println(mapper.readValue("\n"+i +"}",Map.class));
            System.exit(0);
        }
        return new HashMap();
    }

    public Map getAttributes(){
        return attributes;
    }

    public Player getOwner() {
        return owner;
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
