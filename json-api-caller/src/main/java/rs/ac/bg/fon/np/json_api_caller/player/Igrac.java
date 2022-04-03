package rs.ac.bg.fon.np.json_api_caller.player;

import com.google.gson.annotations.SerializedName;

public class Igrac {
	
	
	@SerializedName("first_name")
	private String ime;
	
	@SerializedName("last_name")
	private String prezime;
	
	@SerializedName("id")
	private int igracID;
	
	@SerializedName("position")
	private String pozicija;
	
	@SerializedName("team")
	private Tim tim;
	
	
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getIgracID() {
		return igracID;
	}
	public void setIgracID(int igracID) {
		this.igracID = igracID;
	}
	public String getPozicija() {
		return pozicija;
	}
	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	
	public Tim getTim() {
		return tim;
	}
	
	public void setTim(Tim tim) {
		this.tim = tim;
	}
	
	
	@Override
	public String toString() {
		return "Igrac [ime=" + ime + ", prezime=" + prezime + ", igracID=" + igracID + ", pozicija=" + pozicija
				+ ", tim=" + tim + "]";
	}
	
	
	
	
	
	
	
}
