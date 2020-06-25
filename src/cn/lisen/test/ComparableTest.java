package cn.lisen.test;

import cn.lisen.entity.Student;

public class ComparableTest {
		public static void main(String[] args) {
			Student stu1 = new Student();
			stu1.setName("张珊");
			stu1.setAge(23);
			Student stu2 = new Student();
			stu2.setName("李世");
			stu2.setAge(25);
			int num = stu1.compareTo(stu2);
			if(num>0) {
				System.out.println("张珊比李世大");
			}else {
				System.out.println("李世比张珊大");
			}
		}
}
