package com.jungsub.studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentApp {
	public static void main(String[] args) {
		// 배열 만들기 및 데이터 추가.
		List<Student> al = new ArrayList<Student>();
		al.add(new Student("Kim", 20));
		al.add(new Student("Choi", 21));
		al.add(new Student("Sub", 23));
		al.add(new Student("Ryoo", 24));
		al.add(new Student("Lee", 26));
		al.add(new Student("Jeong", 22));
		al.add(new Student("Yun", 23));
		al.add(new Student("Jang", 28));
		al.add(new Student("Yae", 24));
		al.add(new Student("Park", 24));
		
		// 데이터 정렬 1
		Collections.sort(al);
		
		// 데이터 출력 1
		System.out.println("Student List (ordered by name)");
		for (Student s : al)
			System.out.println(s.toString());
		
		// 데이터 정렬 2
		Collections.sort(al, Collections.reverseOrder());
		
		// 데이터 출력 2
		System.out.println("Student List (reversed ordered by name)");
		for (Student s : al)
			System.out.println(s.toString());
	}
}
