package cn.bw.wang.corejava;

public class TestExtends {
	public static void main(String[] args) {
		Sub sup = new Sub();
		sup.test();
		
	}
	
	
}
class Supper{
	
	private String name = "1";

	public Supper() {
	}
	public void test(){
		System.out.println("this name=="+this.name);
	}
	
}

class Sub extends Supper{
	private String name = "3";
	public Sub() {
		
	}
	
}