package com.spring.todos.dto;

public class Todos {
	int todo_no;
	char todo_list;
	byte todo_ok;
	String todo_start_reg;
	String todo_end_reg;
	int f_todo_member;

	public int getTodo_no() {
		return todo_no;
	}

	public void setTodo_no(int todo_no) {
		this.todo_no = todo_no;
	}

	public char getTodo_list() {
		return todo_list;
	}

	public void setTodo_list(char todo_list) {
		this.todo_list = todo_list;
	}

	public byte getTodo_ok() {
		return todo_ok;
	}

	public void setTodo_ok(byte todo_ok) {
		this.todo_ok = todo_ok;
	}

	public String getTodo_start_reg() {
		return todo_start_reg;
	}

	public void setTodo_start_reg(String todo_start_reg) {
		this.todo_start_reg = todo_start_reg;
	}

	public String getTodo_end_reg() {
		return todo_end_reg;
	}

	public void setTodo_end_reg(String todo_end_reg) {
		this.todo_end_reg = todo_end_reg;
	}

	public int getF_todo_member() {
		return f_todo_member;
	}

	public void setF_todo_member(int f_todo_member) {
		this.f_todo_member = f_todo_member;
	}

	@Override
	public String toString() {
		return "TodoRecord [todo_no=" + todo_no + ", todo_list=" + todo_list
				+ ", todo_ok=" + todo_ok + ", todo_start_reg=" + todo_start_reg
				+ ", todo_end_reg=" + todo_end_reg + ", f_todo_member="
				+ f_todo_member + "]";
	}

}
