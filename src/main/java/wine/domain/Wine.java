package wine.domain;

import java.sql.Timestamp;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Wine {
	
	private long wineid;
	
	@NotNull
	@Size(min=5, max=255)
	private String winename;
	
	@NotNull
	private Country country;
	
	@Min(1900)
	@Max(2100)
	private int year;
	
	@NotNull
	private String type;
	
	@Size(max=255)
	private String area;
	private Timestamp timestamp;
	
	@Size(min=5, max=1500)
	private String notes;
	
	public Wine(long wineid, String winename, Country country, int year, String type, String area,
			Timestamp timestamp, String notes) {
		super();
		this.wineid = wineid;
		this.winename = winename;
		this.country = country;
		this.year = year;
		this.type = type;
		this.area = area;
		this.timestamp = timestamp;
		this.notes = notes;
	}
	
	public Wine(String winename, Country country, int year, String type, String area,
			Timestamp timestamp, String notes) {
		super();
		this.winename = winename;
		this.country = country;
		this.year = year;
		this.type = type;
		this.area = area;
		this.timestamp = timestamp;
		this.notes = notes;
	}
	
	public Wine () {
		super();
	}
	public long getWineid() {
		return wineid;
	}
	public void setWineid(long wineid) {
		this.wineid = wineid;
	}
	public String getWinename() {
		return winename;
	}
	public void setWinename(String winename) {
		this.winename = winename;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Wine [wineid=" + wineid + ", winename=" + winename + ", country=" + country + ", year=" + year
				+ ", type=" + type + ", area=" + area + ", timestamp=" + timestamp + ", notes=" + notes + "]";
	}
	
	
	
	
	
	
}
