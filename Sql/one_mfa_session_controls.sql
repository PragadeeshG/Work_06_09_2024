create table if not exists one_mfa_session_controls(
session_control_model Integer not null,
request_matchers_to_permit varchar(255) null,
request_matchers_to_authenticate varchar(255) null,
form_login char null,
login_processing_url varchar(255) null,
login_url_permit char null,
header varchar(255) null,
log_out_url Integer null,
invalidation_mfa_session_on_timeout varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint one_mfa_session_controls_pk primary key(session_control_model));