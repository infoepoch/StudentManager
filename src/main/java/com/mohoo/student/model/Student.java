/*
 * Student.java
 */
package com.mohoo.student.model;

/**
 * student类
 * <p>
 * 创建日期：2017年5月3日<br>
 * 修改历史：<br>
 * 修改日期：<br>
 * 修改作者：<br>
 * 修改内容：<br>
 * 
 * @author caonn
 * @version 1.0
 */
public class Student extends BaseEntity {

	private String name;
	private String stu_no;
	private int age;
	private String birthday;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the stu_no
	 */
	public String getStu_no() {
		return stu_no;
	}

	/**
	 * @param stu_no
	 *            the stu_no to set
	 */
	public void setStu_no(String stu_no) {
		this.stu_no = stu_no;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday
	 *            the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
