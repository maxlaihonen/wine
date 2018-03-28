package wine.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class WineDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Wine> findAll() {
		String sql = "SELECT CONVERT_TZ(date, @@session.time_zone, '+03:00') AS date, wineid, winename, year, area, notes, type, countries.countryid, countries.countryname FROM wines LEFT JOIN countries ON wines.countryid = countries.countryid; ";
		RowMapper<Wine> mapper = new WineRowMapper();
		List<Wine> wines = jdbcTemplate.query(sql, mapper);
		return wines;
	}
	
	public void save(Wine wine) {
		String sql = "insert into wines(type, winename, year, countryid, area, notes) values(?,?,?,?,?,?)";
		Object[] parameters = new Object[] {
				wine.getType(),
				wine.getWinename(),
				wine.getYear(),
				wine.getCountry().getCountryid(),
				wine.getArea(),
				wine.getNotes()
				};
		jdbcTemplate.update(sql, parameters);

	}

}
