package main;

public class Student implements Comparable<Student>{
	String studentID = "";
	String studentName = "";
	String course = "";
	String grade = "";
	

	

	  
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public Student(String studentID, String studentName, String course, String grade) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.course = course;
		this.grade = grade;
	}
	
			
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", course=" + course + ", grade="
				+ grade + "]";
	}
	@Override
	public int compareTo(Student that) {
		// TODO Auto-generated method stub
		return that.grade.compareTo(this.grade);
	}

}
