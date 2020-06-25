package cn.lisen.entity;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
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
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getAge()-o.getAge();
	}
	
}