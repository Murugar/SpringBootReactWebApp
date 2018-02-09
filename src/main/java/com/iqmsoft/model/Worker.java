package com.iqmsoft.model;

public class Worker {
    private String name;
    private int age;
    private int year;
    private String role;
    private String gender;

    public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Worker(String name, int age, int year) {
        this.name = name;
        this.age = age;
        this.year = year;
    }
	
	public Worker(String name, int age, int year, String role) {
        this.name = name;
        this.age = age;
        this.year = year;
        this.role = role;
    }
	
	public Worker(String name, int age, int year, String role, String gender) {
        this.name = name;
        this.age = age;
        this.year = year;
        this.role = role;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
