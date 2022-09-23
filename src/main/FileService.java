package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;



public class FileService {

public static Student[] getClassListFromFile () {
	BufferedReader fileReader = null;
	
	try {
		int i=0;
		String line = null;
		Student[] students = new Student[101];
		fileReader = new BufferedReader(new FileReader("student-master-list.csv"));
		
		while ((line = fileReader.readLine()) != null) {
			String[] lineData = line.split(",");
			Student student = new Student(lineData[0],lineData[1],lineData[2],lineData[3]);
			students[i] = student;
			i++;
		}
		return students;
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			if (fileReader != null) {
				fileReader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	return null;
}

public static void readFile(Student[] students, String fileName) throws IOException {
	BufferedWriter writer = null;
	
	try {
		writer = new BufferedWriter(new FileWriter(fileName));
		writer.write("Student ID,Student Name,Course,Grade\n");
		for(Student student:students) {
			writer.write(student.getStudentID() + "," + student.getStudentName() + "," + student.getCourse() + "," + student.getGrade() + "\n" );
		}
	} finally {
		if(writer != null) writer.close(); 
	}
	
	
	
	
	
	writer.close();
	
	
	
	
	
	
}
/*
	
	public Pig[] getPigsFromFile () {
		
		BufferedReader fileReader = null;
		
		try {	
			int i = 0;
			String line = null;
			Pig[] pigs = new Pig[4];
			fileReader = new BufferedReader(new FileReader("pigs.txt"));
			
			while ((line = fileReader.readLine()) != null) {
				String[] lineData = line.split(",");
				Pig pig = new Pig(lineData[0], lineData[1]);
				pigs[i] = pig;
				i++;
			}
			return pigs;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;

*/
	
}