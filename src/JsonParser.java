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


            JSONArray songs= (JSONArray) jsonObject.get("songs");
            List<Song> songCollection = new ArrayList<>();

            for(int i = 0; i<songs.size(); i++) {
                JSONObject obj = (JSONObject) songs.get(i);

                String artist = (String) obj.get("artist");
                String song = (String) obj.get("song");
                String duration = (String) obj.get("duration");

                Song songElement = new Song(song, artist, duration);
                songCollection.add(songElement);
            }

            /*for (Song song : songCollection) {
                System.out.println(song);
                System.out.println("================================================================================");
            }*/

            String artist=(String) jsonObject.get("artist");
            System.out.println("The first song is - " + artist);
            reader.close();

        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }

    }

    private static class JsonObject {
    }
}


