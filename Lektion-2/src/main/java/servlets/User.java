package servlets;

public class User {
	private String name;
	private String role;

	public User(String name) {
		this.name = name;
		this.role = "User";
	}

	@Override
	public String toString() {
		return "The name is: " + this.name + " and the role " + this.role;
	}
}