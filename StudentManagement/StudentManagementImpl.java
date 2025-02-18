package StudentManagement;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementImpl implements StudentManagement{
	
	//Student[] stuList= new Student[100];
	//int index=-1;
	ArrayList<Student> stuList= new ArrayList <Student>();
	
	@Override
	public void addStudent(Student stu) {
		//stuList[++index]=stu;//0
		stuList.add(stu);
	}

	@Override
	public void deleteStudent(int rollNo) {Student eachStu = null;
	for(int i=0;i<stuList.size();i++) {
		eachStu = stuList.get(i);
		if(eachStu.getRollNo() == rollNo) {
			stuList.remove(i);
			System.out.println("Successfully deleted Student--->"+eachStu.getName());
			}
		
	}
	}

	@Override
	public Student searchStudent(int rollNo) {Student eachStu = null;
	for(int i=0;i<stuList.size();i++) {
		eachStu = stuList.get(i);
		if(eachStu.getRollNo() == rollNo) {
			System.out.println("Student got found---->"+eachStu.getName());
			System.out.println(eachStu);
	}
	}
	return eachStu;
	}

	@Override
	public void displayAll() {
		Student eachStu = null;
		for(int i=0;i<stuList.size();i++) {
			eachStu =stuList.get(i);
			System.out.println(eachStu);
		}
	}

}
