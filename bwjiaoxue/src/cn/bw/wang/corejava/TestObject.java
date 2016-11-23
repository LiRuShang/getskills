package cn.bw.wang.corejava;

public class TestObject {
	int $,e,a,b=10;
	private void name(){}
	
	public static void main(String[] args) {
		float aa = 0.0f;
		double bb = 0.0d;
		double cc = 0.0f;
		char a = 'w';
		System.out.println(a>10);
		TestObject [] dd = {};
//		A a = new A();
//		a.setName("张三");
//		
//		TestObject t = new TestObject();
//		t.test1(a);
//		
//		System.out.println("--name1-"+a.getName());
////		
//		t.test2(a);
//		System.out.println("--name2-"+a.getName());
		
	}
	private void test1(A a){
		a.setName("李四");
		
	}
    private void test2(A a){
    	a = new A();
    	a.setName("王五");		
	}

}
class A {
	private String name = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
