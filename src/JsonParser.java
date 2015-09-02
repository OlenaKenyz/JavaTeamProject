import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class JsonParser {

    private  static final String jsonfile="album.json";

    public static void main(String[] args) {
        try {

            FileReader reader = new FileReader(jsonfile);
            JsonParser  jsonParser1=new JsonParser ();
            JsonObject jsonObject= (JsonObject) jsonParser1.parse(reader);
            }

        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }

    }

    private static class JsonObject {
    }
}


