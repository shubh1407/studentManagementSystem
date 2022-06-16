package com.studentManagement.main;
//1,100,3,50
//1,50,3,100
import java.util.List;
import java.util.Scanner;

import com.studentManagement.bean.StudentRecord;
import com.studentManagement.utils.UtlityClass;

public class MainClass {

	
	public static void main(String[] args) {
		UtlityClass utlityClass = new UtlityClass();
		while(true) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Please select correct choice "
					+ "\n 1. Add new Students"
					+ "\n 2. Get Student record"
					+ "\n 3. Get List of student records"
					+ "\n 4. Delete the particular student record"
					+ "\n 5. Edit the student record"
					+ "\n 6. Exit application");
			
			int option = scanner.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Please enter rollNo");
				int rollNo = scanner.nextInt();
				System.out.println("Please enter name");
				String name = scanner.next();
				System.out.println("Please enter batch");
				String batch = scanner.next();
				
				utlityClass.add(new StudentRecord(rollNo, name, batch));
				System.out.println("student record added successfully");
				break;
			case 2:
				System.out.println("Please enter rollNo");
				rollNo = scanner.nextInt();
				StudentRecord studentRecord= utlityClass.getStudentRecord(rollNo);
				if(studentRecord!=null) {
					System.out.println("Student record "+studentRecord);
				}
				else {
					System.out.println("RollNo doesn't exist");
				}
				break;
			case 3:
				List<StudentRecord> list = utlityClass.getStudentRecords();
				if(list.isEmpty()) {
					System.out.println("No Student Records exists");
				}
				else {
					System.out.println(list);
				}
				break;
			case 4:
				System.out.println("Please enter rollNo");
				rollNo = scanner.nextInt();
				studentRecord = utlityClass.deleteStudentRecord(rollNo);
				if(studentRecord!=null) {
					System.out.println(studentRecord+" is deleted successfully");
				}else {
					System.out.println("RollNo "+rollNo+" doesn't exist");
				}
				break;
			case 5:
				System.out.println("Please enter rollNo");
				rollNo = scanner.nextInt();
				System.out.println("Please enter new name");
				name = scanner.next();
				System.out.println("Please enter new batch");
				batch = scanner.next();
				studentRecord = utlityClass.updateStudentRecord(new StudentRecord(rollNo, name, batch));
				if(studentRecord!=null) {
					System.out.println("update student record successfully");
				}else {
					System.out.println("RollNo doesn't exist");
				}
				break;
			case 6:
				System.exit(1);
			default:
				System.out.println(option+" is invalid choice.");
			}
		}
	}
}
