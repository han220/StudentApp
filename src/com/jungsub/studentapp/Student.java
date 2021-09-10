package com.jungsub.studentapp;

public class Student implements Comparable<Student>{
	private static int totalNo = 0;
	private int no, age;
	private String name;
	
	public Student(String name, int age) {
		this.no = ++totalNo;
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("Student [no=%d, name=%s, age=%d]", no, name, age);
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
}
