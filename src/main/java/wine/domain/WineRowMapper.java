package wine.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class WineRowMapper implements RowMapper<Wine> {
	
	public Wine mapRow(ResultSet rs, int rowNum) throws SQLException {

		Wine wine = new Wine();
		wine.setWineid(rs.getInt("wineid"));
		wine.setWinename(rs.getString("winename"));
		if (rs.getInt("year") != 0) { wine.setYear(rs.getInt("year")); }
		wine.setType(rs.getString("type"));
		if (rs.getString("area") != null) { wine.setArea(rs.getString("area")); }
		wine.setTimestamp(rs.getTimestamp("date"));
		if (rs.getString("notes") != null) { wine.setNotes(rs.getString("notes")); }
		wine.setCountry(new Country(rs.getLong("countryid"), rs.getString("countryname")));
		return wine;
	}
	

}