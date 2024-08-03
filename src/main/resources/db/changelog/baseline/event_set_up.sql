CREATE SCHEMA iF NOT EXISTS RentCars;
create table RentCars.сarsPul3 (
    id bigserial primary key,
    name varchar,
    hp int8,
    category varchar
);

comment on table RentCars.сarsPul3 is 'Автопарк';
comment on column RentCars.сarsPul3.hp is 'Лошадиные силы';
comment on column RentCars.сarsPul3.category is 'Категория ТС';

insert into RentCars.сarsPul3 VALUES (1,'Opel',140,'Sport');