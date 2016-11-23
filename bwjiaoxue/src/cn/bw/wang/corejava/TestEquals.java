package cn.bw.wang.corejava;

import java.util.HashSet;
import java.util.Set;

public class TestEquals {
	
	public static void main(String[] args) {
		User user1 = new User();
		user1.setName("aa");
		
		User user2 = new User();
		user2.setName("aa");
		
		Set<User> users = new HashSet<User>();
		users.add(user1);
		users.add(user2);
		
		System.out.println("users size=="+users.size());
		
		for(User u : users){
			System.out.println("user hashCode=="+u.hashCode());
		}
		System.out.println("user1.equals(user2)==="+user1.equals(user2));
		
	}
}
class User{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
