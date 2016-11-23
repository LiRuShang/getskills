package cn.bawei.reflect.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Test {
	
	public static void main(String[] args) throws Exception{
		UserInfo user = new UserInfo();
		Field [] fields = user.getClass().getDeclaredFields();
		for (Field field : fields) {
			if(field.getName()!=null && field.getName().equals("commpany")){
				field.setAccessible(true);
				Class clazz = field.getType();
				Constructor constructor = clazz.getConstructor(String.class);
				Commpany commpany = (Commpany) constructor.newInstance("zhangsan");
				//Commpany commpany = (Commpany) clazz.newInstance();
				field.set(user, commpany);		
			}			
		}
		System.out.println(user.getCommpany());
	}

}
