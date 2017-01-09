create table faculty(
		id int not null auto_increment,
		name varchar(20) not null,
		description varchar(100),
		primary key(id)
	);

	create table student(
		id int not null auto_increment,
		name varchar(50) not null,
		age int not null,
		email varchar(15) not null,
		takeInDate timestamp default CURRENT_TIMESTAMP,
		faculty_id int not null,
		foreign key(faculty_id) references faculty(id),
		primary key(id)
	);