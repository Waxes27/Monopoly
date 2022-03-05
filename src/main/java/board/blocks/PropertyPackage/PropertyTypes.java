package board.blocks.PropertyPackage;

import board.blocks.Block;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;

import java.io.*;
import java.util.Objects;

public class PropertyTypes {
    JSONObject types;


    public PropertyTypes() throws IOException {
        this.types = getPropertyTypes();
    }

    private JSONObject getPropertyTypes() throws IOException {
        File file = new File(
                Objects.requireNonNull(this.getClass().getClassLoader().getResource("propertyTypes.json")).getFile()
        );
        ObjectMapper mapper = new ObjectMapper();
        JSONObject json = mapper.readValue(file, JSONObject.class);
        System.out.println(json);

        return json;
    }

    public void initBlockType(Block block){
        String name = block.getName();

        if (name.contains("station")) {
            block.setType(types.get("station").toString());
        }

        // Equals Here
        else if(name.equalsIgnoreCase("go")){
            block.setType(types.get("go").toString());
        }

        else if(name.equalsIgnoreCase("chance")){
            block.setType(types.get("chance").toString());
        }

        else if(name.equalsIgnoreCase("chest")){
            block.setType(types.get("chest").toString());
        }

        else if(name.equalsIgnoreCase("jail")){
            block.setType(types.get("jail").toString());
        }

        else if(name.equalsIgnoreCase("free parking")){
            block.setType(types.get("free parking").toString());
        }


        // Equals ends here

        else if(name.contains("electric")){
            block.setType(types.get("electric").toString());
        }

        else if(name.contains("water")){
            block.setType(types.get("water").toString());
        }

        else{
            block.setType(types.get("property").toString());
        }
    }
}
