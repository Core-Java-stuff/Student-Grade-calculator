package com.student.grade.pojo;

public class Student implements Comparable<Student> {
	private int score;
	private String grade;

	public Student(int score, String grade) {
		this.score = score;
		this.grade = grade;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return " [" + score + ", " + grade + "]";
	}

	/* Sort in Ascending Order compare with Score/mark */
	@Override
	public int compareTo(Student student) {
		return this.score - student.score;
	}

}
