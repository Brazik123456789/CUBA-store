package com.company.store.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.store.entity.Order;

@UiController("store_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
}