CREATE DATABASE chat_app_db;
use chat_app_db; 
create table chat_private_users(
    usr_id int auto_increment   key,
    user_name varchar(100),
    meassage varchar(500)
);

insert into chat_private_users(user_name,meassage)values("sapnadip","hi i am sapnadip"),("gourav","hi i am gourav chacha");

select * from chat_private_users;

update chat_private_users as cpu  set cpu.meassage = "demo " where cpu.user_name = "sapnadip";
SET SQL_SAFE_UPDATES = 0 ;


