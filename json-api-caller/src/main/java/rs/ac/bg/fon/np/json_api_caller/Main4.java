package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Main4 {

	public static void main(String[] args) {
		
		JsonObject igrac = new JsonObject();
		
		igrac.addProperty("first_name", "Boban");
		igrac.addProperty("last_name", "Marjanovic");
		igrac.addProperty("id", 2892);
		igrac.addProperty("position", "C");
		
		JsonObject tim = new JsonObject();
		tim.addProperty("id", 38);
		tim.addProperty("full_name", "Dallas Mavericks");
		
		igrac.add("team", tim);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		try (FileWriter fw = new FileWriter("rucni_upis.json")){
			gson.toJson(igrac, fw);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
