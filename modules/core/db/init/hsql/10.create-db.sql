-- begin STORE_CLIENT
create table STORE_CLIENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FULL_NAME varchar(255) not null,
    PHONE varchar(255) not null,
    EMAIL varchar(255) not null,
    SALE integer,
    --
    primary key (ID)
)^
-- end STORE_CLIENT
-- begin STORE_ORDER_POSITION
create table STORE_ORDER_POSITION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_ID varchar(36),
    COUNT_ bigint not null,
    ORDER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end STORE_ORDER_POSITION
-- begin STORE_PRODUCT
create table STORE_PRODUCT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    PRICE bigint not null,
    --
    primary key (ID)
)^
-- end STORE_PRODUCT
-- begin STORE_ORDER
create table STORE_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_NUMBER bigint not null,
    CLIENT_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end STORE_ORDER
