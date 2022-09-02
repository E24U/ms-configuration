CREATE TABLE application
(
    id    uuid PRIMARY KEY,
    title VARCHAR(250) NOT NULL,
    type  VARCHAR(25)  NOT NULL
);

CREATE TABLE page
(
    id             uuid PRIMARY KEY,
    title          VARCHAR(100) NOT NULL,
    application_id uuid REFERENCES application (id)
);

CREATE TABLE component
(
    id    uuid PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE page_component
(
    page_id      uuid REFERENCES page (id),
    component_id uuid REFERENCES component (id)
);

insert into application (id, title, type) values (gen_random_uuid(), 'Application for education', 'ADMIN');
insert into application (id, title, type) values (gen_random_uuid(), 'Application for education', 'USER');

insert into page (id, title, application_id)
values (gen_random_uuid(), 'Page', (select id from application where type = 'ADMIN'));

insert into component (id, name) values (gen_random_uuid(), 'PageConfigurator');

insert into page_component (page_id, component_id)
values ((select id from page where application_id = (select id from application where type = 'ADMIN')),
        (select id from component where name = 'PageConfigurator'));