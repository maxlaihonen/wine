package wine.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class CountryDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Country> findAllCountries() {
		String sql = "SELECT * FROM countries ORDER BY countryname";
		RowMapper<Country> mapper = new CountryRowMapper();
		List<Country> countries = jdbcTemplate.query(sql, mapper);
		return countries;
	}

}