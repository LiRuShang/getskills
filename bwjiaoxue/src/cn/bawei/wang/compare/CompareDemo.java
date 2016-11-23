package cn.bawei.wang.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CompareDemo {

	public static void main(String[] args) {
		UserInfo user1 = new UserInfo(1,100);
		UserInfo user2 = new UserInfo(2,200);
		UserInfo user3 = new UserInfo(3,300);
	
//		TreeSet set2 = new TreeSet();//ÓÐÐò¶þ²æËÑË÷Ê÷
//		set2.add(user1);
//		set2.add(user2);
//		set2.add(user3);
//		System.out.println("==set2=="+set2);
		
		
		
		
		TreeSet set3 = new TreeSet(new Comparator<UserInfo>(){
			@Override
			public int compare(UserInfo o1, UserInfo o2) {
				if(o1.age<o2.age){
					return -1;
				}
				if(o1.age==o2.age){
					return 0;
				}
				if(o1.age>o2.age){
					return 1;
				}
				return 0;
			}});
		set3.add(user1);
		set3.add(user3);
		set3.add(user2);
		
		for (Object userInfo : set3) {
			System.out.println("==set3=="+userInfo);
		}
		
//		UserInfo user1 = new UserInfo(1,100);
//		UserInfo user2 = new UserInfo(2,200);
//		UserInfo user3 = new UserInfo(3,300);
//		
//		List<UserInfo> list = new ArrayList<UserInfo>();
//		list.add(user2);
//		list.add(user3);
//		list.add(user1);
//		
//		for (UserInfo userInfo : list) {
//			System.out.println("===="+userInfo);
//		}
//		
//		Collections.sort(list,new Comparator<UserInfo>(){
//
//			@Override
//			public int compare(UserInfo o1, UserInfo o2) {
//				if(o1.id<o2.id){
//					return -1;
//				}
//				if(o1.id==o2.id){
//					return 0;
//				}
//				if(o1.id>o2.id){
//					return 1;
//				}
//				return 0;
//			}}
//		);
//		
//		
//		for (UserInfo userInfo : list) {
//			System.out.println("===="+userInfo);
//		}

	}

}
