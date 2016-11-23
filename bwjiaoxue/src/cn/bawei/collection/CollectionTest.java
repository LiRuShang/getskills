package cn.bawei.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("a");
		s1.getCourses().add(new Course("java"));
		s1.getCourses().add(new Course("c"));
		s1.getCourses().add(new Course(".net"));
		Student s2 = new Student("b");
		s2.getCourses().add(new Course("java"));
		s2.getCourses().add(new Course("php"));
		s2.getCourses().add(new Course(".net"));
		Student s3 = new Student("c");
		s3.getCourses().add(new Course(".net"));
		s3.getCourses().add(new Course("php"));
		
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		List<Course> listCourse = new ArrayList<Course>();
		listCourse.add(new Course("java"));		
		listCourse.add(new Course(".net"));
	
		List<Student> returnStudents = findStudent(list,listCourse);
		

	}

	private static List<Student> findStudent(List<Student> list, List<Course> listCourse) {
		return null;
	}

}
