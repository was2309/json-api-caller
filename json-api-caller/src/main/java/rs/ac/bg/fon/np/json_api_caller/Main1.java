package rs.ac.bg.fon.np.json_api_caller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import rs.ac.bg.fon.np.json_api_caller.player.Igrac;

public class Main1 {
	
	public static String BASE_URL = "https://www.balldontlie.io/api/v1/players/";
	public static String PLAYER_ID = "237";
	
	
	public static void main(String[] args) {
		
		
		try {
			URL url = new URL(BASE_URL+PLAYER_ID);
			System.out.println(url);
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			Gson gson = new GsonBuilder().create();
			
			Igrac igrac = gson.fromJson(br, Igrac.class);
			
			br.close();
			
			System.out.println(igrac);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
