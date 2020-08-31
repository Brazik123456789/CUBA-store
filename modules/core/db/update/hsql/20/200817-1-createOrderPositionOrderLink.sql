create table STORE_ORDER_POSITION_ORDER_LINK (
    ORDER_ID varchar(36) not null,
    ORDER_POSITION_ID varchar(36) not null,
    primary key (ORDER_ID, ORDER_POSITION_ID)
);
