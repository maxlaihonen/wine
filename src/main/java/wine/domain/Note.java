package wine.domain;

import java.sql.Timestamp;

public class Note {
	
	private long noteid;
	private Timestamp timestamp;
	private String notes;
	private int year;
	
	
	public Note(long noteid, Timestamp timestamp, String notes, int year) {
		super();
		this.noteid = noteid;
		this.timestamp = timestamp;
		this.notes = notes;
		this.year = year;
	}
	
	public Note(Timestamp timestamp, String notes, int year) {
		super();
		this.timestamp = timestamp;
		this.notes = notes;
		this.year = year;
	}
	
	public Note() {
		super();
	}

	public long getNoteid() {
		return noteid;
	}

	public void setNoteid(long noteid) {
		this.noteid = noteid;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	

}
