package cn.bawei.wang.compare;

public class UserInfo {
	int id = 0;
	int age = 10;
	public int getId() {
		return id;
	}
	public UserInfo(int id, int age) {
		super();
		this.id = id;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", age=" + age + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		UserInfo other = (UserInfo) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
			

}
