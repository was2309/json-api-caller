package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;

import rs.ac.bg.fon.np.json_api_caller.player.Igrac;

import com.google.gson.reflect.TypeToken;

public class Main3 {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("niz_objekata.json")) {
			
			List<Igrac> igraci;
			
			Gson gson = new Gson();
			
			Type tipLista = new TypeToken<List<Igrac>>() {}.getType();
			
			igraci = gson.fromJson(fr, tipLista);
			
			for (Igrac igrac : igraci) {
				System.out.println(igrac);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}
