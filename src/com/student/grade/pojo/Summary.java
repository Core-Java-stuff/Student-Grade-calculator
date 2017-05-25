package com.student.grade.pojo;

public class Summary {

	private int lowestMark;
	private int highestMark;
	private double averageMark;
	private int totalPass;
	private int totatlFail;

	public Summary(int lowestMark, int highestMark, double averageMark,
			int totalPass, int totatlFail) {
		this.lowestMark = lowestMark;
		this.highestMark = highestMark;
		this.averageMark = averageMark;
		this.totalPass = totalPass;
		this.totatlFail = totatlFail;
	}

	public void setLowestMark(int lowestMark) {
		this.lowestMark = lowestMark;
	}

	public int getLowestMark() {
		return lowestMark;
	}

	public void setHighestMark(int highestMark) {
		this.highestMark = highestMark;
	}

	public int getHighestMark() {
		return highestMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setTotalPass(int totalPass) {
		this.totalPass = totalPass;
	}

	public int getTotalPass() {
		return totalPass;
	}

	public void setTotatlFail(int totatlFail) {
		this.totatlFail = totatlFail;
	}

	public int getTotatlFail() {
		return totatlFail;
	}
}
