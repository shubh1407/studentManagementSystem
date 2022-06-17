package com.studentManagement.storage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.studentManagement.bean.StudentRecord;

public class StudentManagementStorage {

	public static ArrayList<StudentRecord> studentRecords = new ArrayList<StudentRecord>();
	
	public static LinkedHashSet<StudentRecord> studentRecordSet = new LinkedHashSet<StudentRecord>();
	
	public static TreeSet<StudentRecord> studentRecordTreeSet = new TreeSet<StudentRecord>(new Comparator<StudentRecord>() {
		@Override
		public int compare(StudentRecord o1, StudentRecord o2) {
			return o1.getRollNo()-o2.getRollNo();
		};
	});
	
	public static HashMap<Integer, StudentRecord> studentRecordMap = new HashMap<Integer, StudentRecord>();
}
