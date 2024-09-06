create table if not exists one_mfa_session(
session_id Integer not null,
app_name varchar(255) null,
spring_one_mfa_session char null,
one_mfa_session_model varchar(255) null,
one_mfa_session_time_out bigint null,
one_mfa_session_validation varchar(255) null,
cors varchar(255) null,
csrf varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint one_mfa_session_pk primary key(session_id));