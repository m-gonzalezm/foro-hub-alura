create table courses(

    id bigint not null auto_increment,
    name varchar(150) not null unique,
    category varchar(100) not null,

    primary key(id)

);

create table users(

    id bigint not null auto_increment,
    name varchar(100) not null,
    email varchar(150) not null unique,
    username varchar(100) not null unique,
    password varchar(500) not null,

    primary key(id)

);

create table topics(

    id bigint not null auto_increment,
    title varchar(200) not null unique,
    message varchar(750) not null unique,
    creation_date datetime not null,
    status varchar(100) not null,
    author_id bigint not null,
    course_id bigint not null,

    primary key(id),

    constraint fk_topics_author_id foreign key(author_id) references users(id),
    constraint fk_topics_course_id foreign key(course_id) references courses(id)

);

create table answers(

    id bigint not null auto_increment,
    message varchar(750) not null,
    topic_id bigint not null,
    creation_date datetime not null,
    author_id bigint not null,
    solution tinyint not null,

    primary key(id),

    constraint fk_answers_topic_id foreign key(topic_id) references topics(id),
    constraint fk_answers_author_id foreign key(author_id) references users(id)

);

create table profiles(
    id bigint not null auto_increment,
    name varchar(100) not null,
    user_id bigint not null,

    primary key(id),

    constraint fk_profiles_user_id foreign key(user_id) references users(id)

);