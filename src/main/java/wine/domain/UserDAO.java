package wine.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public User findOne(String username) {
		String sql = "select username, password, authority from users where username = ?";
		Object[] parameters = new Object[] { username };
		RowMapper<User> mapper = new UserRowMapper();
		User user = jdbcTemplate.queryForObject(sql, parameters, mapper);
		return user;

	}

}
