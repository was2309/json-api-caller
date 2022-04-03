package rs.ac.bg.fon.np.json_api_caller.player;

import com.google.gson.annotations.SerializedName;

public class Tim {
	
	
	@SerializedName("id")
	private int timID;
	
	@SerializedName("full_name")
	private String nazivTima;
	
	
	public int getTimID() {
		return timID;
	}
	public void setTimID(int timID) {
		this.timID = timID;
	}
	public String getNazivTima() {
		return nazivTima;
	}
	public void setNazivTima(String naziv) {
		this.nazivTima = naziv;
	}
	@Override
	public String toString() {
		return "Tim [timID=" + timID + ", nazivTima=" + nazivTima + "]";
	}
	
	
	
	
}
