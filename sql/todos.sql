create table todos(
todo_no INTEGER primary key AUTO_INCREMENT,
todo_list char(100) not null,
todo_ok boolean not null,
todo_start_reg datetime,
todo_end_reg datetime,
f_todo_member INTEGER not null,
constraint f_todo_member foreign key (f_todo_member) 
references member(member_no) on update cascade on delete restrict )

insert into todos(todo_list, todo_ok, todo_start_reg, todo_end_reg, f_todo_member) 
	values (#{todo_list}, ${todo_ok} , ${todo_start_reg}, ${todo_end_reg}, ${member_no})
	
update todos set todo_ok = #{todo_ok} where todo_no = #{todo_no}

update todos set todo_start_reg = #{todo_start_reg} , todo_end_reg = #{todo_end_reg} where todo_no = #{todo_no}

delete from todos where todo_no = #{todo_no} 

