create table if not exists hc_profile_log(
    id serial primary key,
    maxHoursWorkdays INT NOT NULL,
    maxHoursWeekends INT NOT NULL
    );

create table if not exists score_booking_type(
    id serial primary key,
    name char(100)
    );

create table if not exists score_booking(
    id serial primary key,
    creation_time timestamp,
    amount int,
    remark text,
    score_booking_type int
    );

create table if not exists role(
    id serial primary key,
    name char(50)
);

create table if not exists role_user_assignment(
    user_id int,
    role_id int,
    creation_time timestamp,
    valid_from timestamp,
    valid_until timestamp
);

create table if not exists role_permission_assignment(
    role_id int,
    permission char(50),
    creation_time timestamp,
    valid_from timestamp,
    valid_until timestamp
);