package org.ukiuni.inspect.hogan.entity;

public class User {
	private String name;
	private String description;
	public static User load(String userName) {
		User user = new User();
		user.setName("userName");
		user.setDescription("This user is a user.");
		return user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
