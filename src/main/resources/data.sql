-- By default, Spring Boot will run the SQL files in the order they are found:
--
-- 1.schema.sql: For database schema initialization (creating tables, etc.).
--
-- 2.data.sql: For inserting data into the tables.

insert into USER_ENTITY(id,birthday,name) values (1001, current_date, 'Paria');
insert into USER_ENTITY(id,birthday,name) values (1002, current_date, 'Paria2');
insert into USER_ENTITY(id,birthday,name) values (1003, current_date, 'Paria3');
insert into USER_ENTITY(id,birthday,name) values (1004, current_date, 'Paria4');