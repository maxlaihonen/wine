package wine.domain;

public class Country {
	
	private long countryid;
	private String name;
	
	
	
	public Country(long countryid, String name) {
		super();
		this.countryid = countryid;
		this.name = name;
	}
	
	public Country() {
		super();
	}
	
	public long getCountryid() {
		return countryid;
	}
	public void setCountryid(long countryid) {
		this.countryid = countryid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
