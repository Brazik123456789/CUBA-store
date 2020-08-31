package com.company.store.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.store.entity.Order;

@UiController("store_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}