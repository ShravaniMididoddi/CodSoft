package StudentManagement;

import java.util.Scanner;

public class StudentResults {

	public static void main(String[] args) {
		StudentManagementImpl stuMang = new StudentManagementImpl();
		/*Student ramu = new Student(99,"Ramu",'A',"CSE",67000);
		Student abdul = new Student(85,"Abdul",'B',"CSE",27000);
		Student jhon = new Student(75,"Jhon",'C',"CSE",17000);
		stuMang.addStudent(ramu);
		stuMang.addStudent(abdul);
		stuMang.addStudent(jhon);
		stuMang.displayAll();*/
		Scanner sc = new Scanner(System.in);
		String res;
		do {
			System.out.println("Menu");
			System.out.println("-----------");
			System.out.println("1.Add Student");
			System.out.println("2. Display All Students");
			System.out.println("3. Remove Student");
			System.out.println("4. Search Student");
			System.out.println("5. Enter choice :");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1: createStudent(sc,stuMang);
			break;
			case 2:   stuMang.displayAll();break;
			case 3:   
				
				System.out.println("enter roll to delete");
				int rollNo = sc.nextInt();
				stuMang.deleteStudent(rollNo);break;
			case 4:   
				System.out.println("enter roll to search");
				rollNo = sc.nextInt();
				stuMang.searchStudent(rollNo);break;
			}
			System.out.println("Do you want to repeat?");
			res=sc.next();
			res= res.toLowerCase();
		}while(res.contentEquals("yes"));
		System.out.println("Program Ends");
	}

	private static void createStudent(Scanner sc, StudentManagementImpl stuMang) {
		// Student ramu = new Student(99,"Ramu",'A',"CSE",67000);
		System.out.println("Enter roll number :");
		int rollNo = sc.nextInt();
		System.out.println("Enter name :");
		String name = sc.next();
		System.out.println("Enter grade");
		char grade = sc.next().charAt(0);
		System.out.println("Enter Course");
		String course = sc.next();
		System.out.println("Enter fee :");
		int fee = sc.nextInt();
		Student stu = new Student(rollNo, name, grade, course, fee);
		stuMang.addStudent(stu);
	}

}
