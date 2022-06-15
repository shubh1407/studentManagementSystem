package com.studentManagement.main;

import java.util.List;
import java.util.Scanner;

import com.studentManagement.bean.StudentRecord;
import com.studentManagement.utils.Utility;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		Utility utility = new Utility();
		while(true) 
		{
			System.out.println("Please choose correct option below - "
					+ "\n 1. Add New Student "
					+ "\n 2. Get particular Student "
					+ "\n 3. Get All Students "
					+ "\n 4. Remove particular student "
					+ "\n 5. Edit particular student record."
					+ "\n 6. Exit the application");
			
			int option = scanner.nextInt();
			
			switch(option) {
				case 1:
					System.out.println("Please enter rollNo");
					int rollNo = scanner.nextInt();
					System.out.println("Please enter name");
					String name = scanner.next();
					System.out.println("Please enter batch");
					String batch = scanner.next();
					StudentRecord studentRecord = new StudentRecord(rollNo, name, batch);
					utility.add(studentRecord);
					System.out.println("Student record added successfully");
					break;
				case 2:
					System.out.println("Please enter rollNo");
					rollNo = scanner.nextInt();
					System.out.println(utility.get(rollNo));
					break;
				case 3:
					List<StudentRecord> studentRecords = utility.get();
					if(studentRecords.size()>0) {
						System.out.println(studentRecords);
					}
					else {
						System.out.println("Student Records doesn't exist");
					}
					
					break;
				case 4:
					System.out.println("Please enter rollNo");
					rollNo = scanner.nextInt();
					StudentRecord studentRecord2 = utility.delete(rollNo);
					if(studentRecord2!=null) {
						System.out.println(studentRecord2 +" is deleted successfully");
					}
					else {
						System.out.println("RollNo doesn't exist");
					}
					break;
				case 5:
					System.out.println("Please enter rollNo");
					rollNo = scanner.nextInt();
					System.out.println("Please enter new name");
					name = scanner.next();
					System.out.println("Please enter new batch");
					batch = scanner.next();
					studentRecord=utility.edit(new StudentRecord(rollNo, name, batch));
					if(studentRecord!=null) {
						System.out.println(studentRecord +" is updated successfully");
					}
					else {
						System.out.println("RollNo doesn't exist");
					}
					break;
				case 6:
					System.exit(1);
				default :
					System.out.println("Invalid option");
					
			}
			
		}
	}
}
