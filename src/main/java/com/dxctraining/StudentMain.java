package studentlists;

import java.util.*;
 
public class StudentMain {
	
	Set<Student> set =new HashSet<Student>();
	
	public static void main(String []args) {
		StudentMain demo= new StudentMain();
		demo.runapp();
		
	}
	public void runapp() {
		
		
		Student student1=new Student ("sai",22);
		set.add(student1);
		Student student2=new Student ("divya",21);
		set.add(student2);
		Student student3=new Student ("navya",23);
		set.add(student3);
		Student student4=new Student ("soumya",20);
		set.add(student4);
		
		Iterator<Student> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Student student=iterator.next();
			System.out.println(" Age =" + student.getage() + " rollno is " +student.getrollno());
			
		}
		List<Student> list =
		
	}
}
