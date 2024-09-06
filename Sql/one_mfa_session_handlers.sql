create table if not exists one_mfa_session_handlers(
primary_id varchar(255) not null,
one_mfa_session_id varchar(255) null,
handler_name varchar(255) null,
multi_factor_handler varchar(255) null,
multi_factor_failure_handler varchar(255) null,
one_mfa_session_invalidation_strategy Integer null,
custom_authenticator varchar(255) null,
auth_manager Integer null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint one_mfa_session_handlers_pk primary key(primary_id));