package com.cg.daythree;

public class ConstructorMethod {
	String name;
	int id;
	//Default constructor
	ConstructorMethod(){
		name = "shivu";
		id = 20;
	}
	ConstructorMethod(String name, int id){
		this.name = name;
		this.id = id;
	}
	void display() {
		System.out.println("Student Name "+name);
		System.out.println("student Id: "+id);
	}

}
