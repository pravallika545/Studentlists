package studentlists;

public class Student {
	
	private String rollno;
	private int age;
	
	public Student(String rollno,int age) {
		this.rollno=rollno;
		this.age=age;
	}
	
	public  String getrollno() {
		return rollno;
	}
	public void setrollno(String rollno) {
		this.rollno=rollno;
	}
	
	public int getage() {
		return age;
	}
	
	public void setage(int agearg) {
		this.age=agearg;
		
	}

}