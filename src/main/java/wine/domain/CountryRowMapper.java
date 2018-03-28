package wine.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CountryRowMapper implements RowMapper<Country> {
	
	public Country mapRow(ResultSet rs, int rowNum) throws SQLException {
		Country country = new Country();
		country.setCountryid(rs.getLong("countryid"));
		country.setName(rs.getString("countryname"));
		return country;
	}
}
