package main;

import java.io.IOException;
import java.util.Arrays;

public class CourseListSplit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student[] students = FileService.getClassListFromFile();
		Integer compsciNumber = countClass("COMPSCI", students);
		Integer statNumber = countClass("STAT", students);
		Integer apmthNumber = countClass("APMTH", students);
		
		Student[] compsciStudents = new Student[compsciNumber];
		Student[] statStudents = new Student[statNumber];
		Student[] apmthStudents = new Student[apmthNumber];



		apmthStudents = courseFilter("APMTH", students, apmthNumber);
		Arrays.sort(apmthStudents);
		compsciStudents = courseFilter("COMPSCI", students, compsciNumber);
		Arrays.sort(compsciStudents);
		statStudents = courseFilter("STAT", students, statNumber);
		Arrays.sort(statStudents);
	
		FileService.readFile(compsciStudents, "course1.csv" );
		FileService.readFile(apmthStudents, "course2.csv" );
		FileService.readFile(statStudents, "course3.csv" );
	
	}
	
	public static Student[] courseFilter(String courseName, Student[] students, Integer courseNumber) {
		int i = 0;
		Student[] courseStudents = new Student[courseNumber];
		for(Student student:students) {
			if(student.getCourse().contains(courseName)) {
				courseStudents[i] = student;
				i++;
			}
		}
		return Arrays.copyOf(courseStudents, courseNumber);
	}


	public static Integer countClass(String courseName, Student[] students) {
		Integer count = 0;
		
		for(int i=1; i<students.length; i++) {
			if(students[i].getCourse().contains(courseName)) {
				count +=1;
			}
		}
		
		
		return count;
	}
	
}
