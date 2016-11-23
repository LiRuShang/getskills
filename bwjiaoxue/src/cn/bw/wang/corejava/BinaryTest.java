package cn.bw.wang.corejava;

public class BinaryTest {

	public static void main(String[] args) {
		//http://blog.chinaunix.net/uid-10018502-id-2972048.html
		//System.out.println("+=============="+0xf);
		//System.out.println("+=============="+013);
		
		System.out.println("+=========8 >> 1====="+(8 >> 1));
		
		System.out.println("+===========8==="+Integer.toBinaryString(8));
		System.out.println("+===========4==="+Integer.toBinaryString(4));
		
		System.out.println("+=========8 << 1====="+(8 << 1));
		
		System.out.println("+==========8===="+Integer.toBinaryString(8));
		System.out.println("+==========16===="+Integer.toBinaryString(16));
		
		System.out.println("+=======8 | 9======="+(8 | 9));
		System.out.println("+==========8===="+Integer.toBinaryString(8));
		System.out.println("+==========9===="+Integer.toBinaryString(9));
		
		System.out.println("+=======8 & 10======="+(8 & 10));
		System.out.println("+==========8===="+Integer.toBinaryString(8));
		System.out.println("+==========10===="+Integer.toBinaryString(10));
		
		System.out.println("+==========01===="+Long.valueOf("01",2).toString());
		System.out.println("+==========10===="+Long.valueOf("10",2).toString());
		System.out.println("+===========11==="+Long.valueOf("11",2).toString());
		System.out.println("+==========100===="+Long.valueOf("100",2).toString());
		System.out.println("+==========101===="+Long.valueOf("101",2).toString());
		System.out.println("+==========110===="+Long.valueOf("110",2).toString());
		System.out.println("+==========111===="+Long.valueOf("110",2).toString());
		System.out.println("+===========1000==="+Long.valueOf("1000",2).toString());
		System.out.println("+==========1001===="+Long.valueOf("1001",2).toString());
		System.out.println("+==========1010===="+Long.valueOf("1010",2).toString());
		System.out.println("+==========1011===="+Long.valueOf("1011",2).toString());
		System.out.println("+===========1100==="+Long.valueOf("1100",2).toString());
		System.out.println("+========1101======"+Long.valueOf("1101",2).toString());
		System.out.println("+=========1110====="+Long.valueOf("1110",2).toString());
		System.out.println("+=========1111====="+Long.valueOf("1111",2).toString());
		System.out.println("+==========10000===="+Long.valueOf("10000",2).toString());
		
//		System.out.println("+=============="+(8 << 1));
//		System.out.println("+=============="+(8 & 9));
//		System.out.println("+=============="+Integer.toBinaryString(-8));
		//System.out.println("+=============="+(9 << 1));
		//System.out.println("+=============="+Integer.toBinaryString(9));
		//System.out.println("+=============="+Integer.toBinaryString(18));
		//System.out.println("+=============="+Integer.toBinaryString(-8));
		//System.out.println("+=============="+Long.valueOf("11111111111111111111111111111000",2).toString());
		
	}

}
