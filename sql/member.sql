create database study_todolist;

create table member (
member_no INTEGER primary key AUTO_INCREMENT,
member_name varchar(15) not null, 
member_id varchar(15) unique not null, 
member_pwd varchar(15) not null);


insert into member(member_name, member_id, member_pwd) values (#{member_name},#{member_id}, #{member_pwd});

update member set member_name= #{member_name} where member_no = #{member_no}

delete from member where member_no = #{member_no}

select * from member where member_no = #{member_no};
