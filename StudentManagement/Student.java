package StudentManagement;

public class Student {
	private int rollNo;
	private String name;
	private char grade;
	private String course;
	private String college = "St. Peters Engineering College";
	private int fee;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, char grade, String course, int fee) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
		this.course = course;
		this.fee = fee;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", grade=" + grade + ","
				+ "college="+ college +", course=" + course +", fee="+ fee +"]";
	}
}
