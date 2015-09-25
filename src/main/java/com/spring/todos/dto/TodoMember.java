package com.spring.todos.dto;

public class TodoMember {
	
	int member_no;
	String member_name;
	String member_id;
	String member_pwd;
	
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pwd() {
		return member_pwd;
	}
	public void setMember_pwd(String member_pwd) {
		this.member_pwd = member_pwd;
	} 
	
	@Override
	public String toString() {
		return "TodoMember [member_no=" + member_no + ", member_name="
				+ member_name + ", member_id=" + member_id + ", member_pwd="
				+ member_pwd + ", getMember_no()=" + getMember_no()
				+ ", getMember_name()=" + getMember_name()
				+ ", getMember_id()=" + getMember_id() + ", getMember_pwd()="
				+ getMember_pwd() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
