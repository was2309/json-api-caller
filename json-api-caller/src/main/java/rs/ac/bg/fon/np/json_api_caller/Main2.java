package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileWriter;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import rs.ac.bg.fon.np.json_api_caller.player.Igrac;
import rs.ac.bg.fon.np.json_api_caller.player.Tim;

public class Main2 {

	public static void main(String[] args) {
		
		Igrac i1 = new Igrac();
		i1.setIgracID(2889);
		i1.setIme("Nikola");
		i1.setPrezime("Jokic");
		i1.setPozicija("C");
		Tim t1 = new Tim();
		t1.setTimID(35);
		t1.setNazivTima("Denver Nuggets");
		i1.setTim(t1);
		
		
		Igrac i2 = new Igrac();
		i2.setIgracID(2890);
		i2.setIme("Bogdan");
		i2.setPrezime("Bogdanovic");
		i2.setPozicija("SG");
		Tim t2 = new Tim();
		t2.setTimID(36);
		t2.setNazivTima("Atlanta Hawks");
		i2.setTim(t2);
		
		
		Igrac i3 = new Igrac();
		i3.setIgracID(2891);
		i3.setIme("Nemanja");
		i3.setPrezime("Bjelica");
		i3.setPozicija("PF");
		Tim t3 = new Tim();
		t3.setTimID(37);
		t3.setNazivTima("Golden State Warriors");
		i3.setTim(t3);
		
		
		Igrac[] igraci = {i1, i2, i3};
		
		try(PrintWriter out = new PrintWriter(new FileWriter("niz_objekata.json"))) {
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			out.print(gson.toJson(igraci));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
