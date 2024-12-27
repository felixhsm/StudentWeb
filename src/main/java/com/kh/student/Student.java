package com.kh.student;

public class Student {
	private String name;
	private int firstScore;
	private int secondScore;
	
	public Student() {}
	
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	public void setName(String nmae) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public int getFirstScore() {
		return firstScore;
	}

	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}

	public int getSecondScore() {
		return secondScore;
	}

	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}

	@Override
	public String toString() {
		return "Student [이름 = " + name + ", 첫번째 점수 = " + firstScore + ", 두번째 점수 = " + secondScore + "]";
	}
	
}
