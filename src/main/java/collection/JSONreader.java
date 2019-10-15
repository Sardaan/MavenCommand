package collection;


import collection.Campus;
import collection.Human;
import collection.HumanData;
import collection.Location;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class JSONreader {

    /**
     * convert JSONObject to Human
     *
     * @param jsonString
     * @return Human
     * @throws IOException
     */

    public static Human getHumanFromJSON(String jsonString) {

        try {

            HumanData humanData = new GsonBuilder().create().fromJson(jsonString, HumanData.class);

            String name = humanData.getName().trim();
            int course = humanData.getCourse();
            Date birthDate = null;
            Location location = humanData.getLocation();


            try {
                if (humanData.getBirthDate()!=null)
                    birthDate = new SimpleDateFormat("dd.MM.yyyy").parse(humanData.getBirthDate());
            } catch (ParseException e) {
                System.err.println(e.getMessage());
            }
            if (course==0 || course>6 ||course<1){
                course = new Random().nextInt(5) + 1;
            }

            if (location==null){
                int pick1 = new Random().nextInt(Campus.values().length);
                location = new Location(Campus.values()[pick1], new Random().nextInt(3) + 1);

            }

            Human human = null;
            if (!name.equals("") && birthDate!=null) {
                human = new Human(name, course, birthDate, location);

            }


            return human;
        }catch (JsonSyntaxException | NullPointerException e){
            return null;
        }
    }


}