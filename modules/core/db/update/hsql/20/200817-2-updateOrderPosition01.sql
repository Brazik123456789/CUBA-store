alter table STORE_ORDER_POSITION add constraint FK_STORE_ORDER_POSITION_ON_ORDER foreign key (ORDER_ID) references STORE_ORDER(ID);
create index IDX_STORE_ORDER_POSITION_ON_ORDER on STORE_ORDER_POSITION (ORDER_ID);
