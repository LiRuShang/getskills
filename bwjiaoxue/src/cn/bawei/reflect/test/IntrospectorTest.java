package cn.bawei.reflect.test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class IntrospectorTest {
	
	public static void main(String[] args) throws IntrospectionException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//ÓÐset·½·¨
		UserInfo2 user2 = new UserInfo2();
		
		BeanInfo beanInfo = Introspector.getBeanInfo(user2.getClass());
		
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		
		for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
			//System.out.println(propertyDescriptor.getName());
			if(propertyDescriptor.getName()!=null && propertyDescriptor.getName().equals("commpany")){
				Class<?> propertyType = propertyDescriptor.getPropertyType();
				Constructor constructor = propertyType.getConstructor(String.class);
				Commpany commpany = (Commpany) constructor.newInstance("lisi");				
				Method writeMethod = propertyDescriptor.getWriteMethod();
				writeMethod.invoke(user2, commpany);
			}			
		}
		System.out.println(user2.getCommpany());
		
	}

}
