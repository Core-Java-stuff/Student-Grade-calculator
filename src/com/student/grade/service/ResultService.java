package com.student.grade.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.student.grade.pojo.Student;
import com.student.grade.pojo.Summary;

public class ResultService {

	private final int STUDENT_NOS = 5;
	static List<Student> students = null;
	static {
		students = new ArrayList<>();
		Collections.sort(students);
	}

	@SuppressWarnings("resource")
	public void getResults() {
		// List<Student> students = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		Student student = null;
		for (int i = 1; i <= STUDENT_NOS; i++) {
			System.out.println("Enter Student Score :");
			int score = scanner.nextInt();
			student = new Student(score, findGrade(score));
			students.add(student);
		}
	}

	private String findGrade(int score) {
		String grade = "";
		if (score >= 85) {
			grade = "HD";
		} else if (score > 75 && score <= 84) {
			grade = "D";
		} else if (score > 65 && score <= 74) {
			grade = "C";
		} else if (score > 55 && score <= 64) {
			grade = "P";
		} else {
			grade = "F";
		}
		return grade;
	}

	public void findResults() {
		int count = 0;
		for (Student student : students) {
			count++;
			System.out.println("Mark for student " + count + "-"
					+ student.getScore());
			System.out.println("Grade for student " + count + "-"
					+ student.getGrade());
			System.out.println();
		}
	}

	public void getSummary() {
		int passedStudents = 0;
		int failedStudents = 0;
		for (Student student : students) {
			if (student.getScore() > 49) {
				passedStudents++;
			} else {
				failedStudents++;
			}
		}
		Summary summary = new Summary(students.get(0).getScore(), students.get(
				students.size() - 1).getScore(), findAverage(students),
				passedStudents, failedStudents);
		System.out
				.println("*********************SUMMARY*****************************");
		System.out.println("Lowest Mark :" + summary.getLowestMark());
		System.out.println("HighestMark :" + summary.getHighestMark());
		System.out.println("Average Mark :" + summary.getAverageMark());
		System.out.println("Total Pass count :" + summary.getTotalPass());
		System.out.println("Total Fail count :" + summary.getTotatlFail());
		System.out
				.println("********************************************************");
	}

	private double findAverage(List<Student> students) {
		int sum = 0;
		for (int i = 0; i < students.size() - 1; i++)
			sum = sum + students.get(i).getScore();
		// calculate average value
		return sum / students.size() - 1;
	}

	public static void main(String[] args) {
		ResultService service = new ResultService();
		service.getResults();
		service.findResults();
		service.getSummary();
	}

}
