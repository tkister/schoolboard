insert into user_profile (school_id, username, password, first_name, last_name, gender, year_of_birth, year_of_entrance) values
( 'CJD-06722','Pytagoras',12345678,'Pytagoras', 'Pytagoras','male', 1678, 2019);
insert into user_profile (school_id,username, password, first_name, last_name, gender, year_of_birth, year_of_entrance) values
( 'CJD-06722','ikarus',12345678,'Ikarus', 'Ikarus','male', 1990, 2000);
insert into user_profile (school_id,username, password, first_name, last_name, gender, year_of_birth, year_of_entrance) values
( 'CJD-06722','car.eckardt',12345678,'Carl', 'Eckert','male', 2002, 2012);
insert into user_profile (school_id,username, password, first_name, last_name, gender, year_of_birth, year_of_entrance) values
( 'CJD-06722','emm.brehme',12345678,'Emma', 'Brehme','female', 2002, 2012);
insert into user_profile (school_id, username, password, first_name, last_name, gender, year_of_birth, year_of_entrance) values
( 'CJD-06722','kla.scholz',12345678,'Klara', 'Scholz','female', 2002, 2012);
insert into user_profile (school_id, username, "password", first_name, last_name, gender, year_of_birth, year_of_entrance) values
('CJD-06722','tob.kister','12345678','Tobias','Kister','male', 2002, 2012);

insert into message (msg_id, transmitter_username, receiver_username, msg_content, send_time) values
( 1, 'TEST123', '@a', 'Ich hoffe ihr hattet alle gute Ferien', 1561375194);
insert into message (msg_id, transmitter_username, receiver_username, msg_content, send_time) values
( 2, 'admin', 'admin', 'Rebooting ..... ..... .....', 1561395194);
insert into message (msg_id, transmitter_username, receiver_username, msg_content, send_time) values
( 3, 'tob.kister', '@a', 'Wie schaut es aus?', 1561395194);
insert into message (msg_id, transmitter_username, receiver_username, msg_content, send_time) values
( 4, 'tob.kister', '@a', 'Verteidigung Schoolboard', 1561395194);

insert into vertretung (v_id, stunde, klasse, fach, lehrer) values
(1, 1,'5a','Informatik','Frau Lazarus');
insert into vertretung (v_id, stunde, klasse, fach, lehrer) values
(2, 5,'7g','Latein','Frau Ikarus');
insert into vertretung (v_id, stunde, klasse, fach, lehrer) values
(3, 9,'12a','Mathematik','Herrr Thales');
insert into vertretung (v_id, stunde, klasse, fach, lehrer) values
(4, 7,'11d','Deutsch','Frau Lazarus');
insert into vertretung (v_id, stunde, klasse, fach, lehrer) values
(5, 5,'4c','Latein','Frau Ikarus');
insert into vertretung (v_id, stunde, klasse, fach, lehrer) values
(6, 2,'13z','Physik','Herrr Thales');
insert into vertretung (v_id, stunde, klasse, fach, lehrer) values
(7, 3,'9a','Russisch','Frau Lazarus');
insert into vertretung (v_id, stunde, klasse, fach, lehrer) values
(8, 4,'7g','Geschichte','Frau Ikarus');
insert into vertretung (v_id, stunde, klasse, fach, lehrer) values
(9, 4,'12a','Romanische Literatur','Herrr Thales');

