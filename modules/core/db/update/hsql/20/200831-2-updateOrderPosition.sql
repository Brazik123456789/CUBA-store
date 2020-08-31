-- alter table STORE_ORDER_POSITION add column ORDER_ID varchar(36) ^
-- update STORE_ORDER_POSITION set ORDER_ID = <default_value> ;
-- alter table STORE_ORDER_POSITION alter column ORDER_ID set not null ;
alter table STORE_ORDER_POSITION add column ORDER_ID varchar(36) not null ;
