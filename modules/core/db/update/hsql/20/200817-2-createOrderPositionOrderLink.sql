alter table STORE_ORDER_POSITION_ORDER_LINK add constraint FK_ORDPOSORD_ON_ORDER foreign key (ORDER_ID) references STORE_ORDER(ID);
alter table STORE_ORDER_POSITION_ORDER_LINK add constraint FK_ORDPOSORD_ON_ORDER_POSITION foreign key (ORDER_POSITION_ID) references STORE_ORDER_POSITION(ID);