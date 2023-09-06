package week3day2assignment;

public class Students {

	public void getStudentInfo(long id) {
		 System.out.println("Student ID: " +id);
		
	}
	public void getStudentInfo(long id,String name) {
		System.out.println("Student ID: "+id+ " Student Name: "+name);
	}
	public void getStudentInfo(String email,long phonenumber) {
		System.out.println("Student email: "+email+ " Student Phnumner: "+phonenumber);
	}
	public static void main(String[] args) {
		Students stu=new Students();
		System.out.println("The Student Info registering:");
		stu.getStudentInfo(112);
		stu.getStudentInfo(5118, "Sai");
		stu.getStudentInfo("abcd@gmail.com", 01234567);
		
	}
}
