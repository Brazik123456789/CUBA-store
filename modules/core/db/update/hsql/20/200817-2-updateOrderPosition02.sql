alter table STORE_ORDER_POSITION alter column ORDER_ID rename to ORDER_ID__U14679 ^
alter table STORE_ORDER_POSITION drop constraint FK_STORE_ORDER_POSITION_ON_ORDER ;
drop index IDX_STORE_ORDER_POSITION_ON_ORDER ;
alter table STORE_ORDER_POSITION alter column PRODUCT_ID set null ;
