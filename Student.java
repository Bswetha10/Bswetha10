package week3Assig;

public class Student extends Department {
	public void studentName() {
		System.out.println("Aswini");
	}

	public void studentDept() {
		System.out.println("MCA");
	}

	public void studentId() {
		System.out.println("2301390");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******College*******");
		College C = new College();
		C.collegeCode();
		C.collegeName();
		C.collegeRank();
		System.out.println("*******Department*****");
		Department D = new Department();
		D.deptName();
		D.collegeCode();
		D.collegeName();
		D.collegeRank();
		System.out.println("*******Student*******");
		Student S = new Student();
		S.studentDept();
		S.studentId();
		S.studentName();
		S.collegeCode();
		S.collegeName();
		S.collegeRank();
	}

}
