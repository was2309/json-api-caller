package rs.ac.bg.fon.np.json_api_caller.player;

public class Igrac {
	
	private String ime;
	private int igracID;
	private String pozicija;
	private String tim;
	private int timID;
	
	
	
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
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
	public String getTim() {
		return tim;
	}
	public void setTim(String tim) {
		this.tim = tim;
	}
	public int getTimID() {
		return timID;
	}
	public void setTimID(int timID) {
		this.timID = timID;
	}
	
	
	
	@Override
	public String toString() {
		return "Igrac [ime=" + ime + ", igracID=" + igracID + ", pozicija=" + pozicija + ", tim=" + tim + ", timID="
				+ timID + "]";
	}
	
}
