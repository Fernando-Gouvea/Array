package entities;

public class room {
	
	
	private int room;
	private String name;
	private String email;
	
	public room(int room, String name, String email) {
		this.room = room;
		this.name = name;
		this.email = email;
	}

	public int getroom() {
		return room;
	}

	public void setroom(int room) {
		this.room = room;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return 		"--------------------\n"
				  +"number:" +room  + "\n"
				  +"name:" + name + "\n"
				  +"email:" + email
				  +"\n--------------------";
	}

	
	

}
