package cn.bawei.reflect.test;

public class Commpany {
	
	public Commpany(String name) {
		super();
		this.name = name;
	}

	private String name;

	@Override
	public String toString() {
		return "Commpany [name=" + name + "]";
	}
	

}
