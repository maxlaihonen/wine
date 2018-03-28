package wine.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Country {
	
	@Max(12)
	@Min(0)
	private long countryid;
	
	@NotNull
	@Size(min=5, max=255)
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
