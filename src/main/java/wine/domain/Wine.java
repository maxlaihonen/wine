package wine.domain;

import java.util.ArrayList;
import java.util.List;

public class Wine {
	
	private long wineid;
	private String name;
	private Country country;
	private String area;
	private List<Note> notes = new ArrayList<Note>();
	
	
	public Wine(long wineid, String name, Country country, String area, List<Note> notes) {
		super();
		this.wineid = wineid;
		this.name = name;
		this.country = country;
		this.area = area;
		this.notes = notes;
	}
	
	public Wine() {
		super();
	}

	public long getWineid() {
		return wineid;
	}

	public void setWineid(long wineid) {
		this.wineid = wineid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}	
}
