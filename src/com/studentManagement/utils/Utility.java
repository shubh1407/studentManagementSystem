package com.studentManagement.utils;

import java.util.List;

import com.studentManagement.bean.StudentRecord;
import com.studentManagement.storage.StudentManagementStorage;

public class Utility {

	//addNewStudent
	public void add(StudentRecord studentRecord) {
		StudentManagementStorage.studentRecords.add(studentRecord);
	}
	
	// fetching particular student 
	public StudentRecord get(int rollNo) {
		for(StudentRecord studentRecord:StudentManagementStorage.studentRecords) {
			if(studentRecord.getRollNo()==rollNo) {
				return studentRecord;
			}
		}
		return null;
	}
	
	//Return all students
	
	public List<StudentRecord> get() {
		return StudentManagementStorage.studentRecords;
	}
	
	
	//delete particular records
	
	public StudentRecord delete(int rollNo) {
		StudentRecord studentRecord = get(rollNo);
		if(studentRecord!=null) {
			StudentManagementStorage.studentRecords.remove(studentRecord);
		}
		return studentRecord;
	}
	
	//edit the records
	
	public StudentRecord edit(StudentRecord studentRecord) {
		StudentRecord studentRecord2 = get(studentRecord.getRollNo());
		if(studentRecord2!=null) {
			studentRecord2.setName(studentRecord.getName());
			studentRecord2.setBatch(studentRecord.getBatch());
		}
		return studentRecord2;
	}
}
