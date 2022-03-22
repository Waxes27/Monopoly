package board.blocks.PropertyPackage;

import board.Player.Player;
import board.blocks.Block;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.cdimascio.dotenv.Dotenv;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class Parking implements Block {
    private int id;
    private ArrayList playerList;
    private String name;
    private String type;
            private Player owner;

    public Parking(int i){
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

    @Override
    public Map setAttributes() throws IOException {
        File file = new File(
                Objects.requireNonNull(this.getClass().getClassLoader()
                        .getResource("propertiesTemplate.json")).getFile()
        );
        ObjectMapper mapper = new ObjectMapper();
        JSONObject json = mapper.readValue(file, JSONObject.class);
        System.out.println(json);
        return json;
    }
}
