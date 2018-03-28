package wine.domain;


public class User {
	
	String username;
	String passwordhash;
	String role;

	public User(String username, String passwordhash, String role) {
		super();
		this.username = username;
		this.passwordhash = passwordhash;
		this.role = role;
	}

	public User() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswordhash() {
		return passwordhash;
	}

	public void setPasswordhash(String passwordhash) {
		this.passwordhash = passwordhash;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	

}
