package cn.bawei.factory;

public class Driver {
	public static Car driverCar(String s){
		 if(s.equals("BenCi"))
			 
			 return new BenCi();
         if(s.equals("Bm"))
			 
			 return new Bm();
		
		return null;
		
		
	}

}
