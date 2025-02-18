package StudentManagement;

public interface StudentManagement {
	void addStudent(Student stu);
	void deleteStudent(int rollNo);
	Student searchStudent(int rollNo);

	void displayAll();

}
