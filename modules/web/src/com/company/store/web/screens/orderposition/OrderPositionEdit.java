package com.company.store.web.screens.orderposition;

import com.haulmont.cuba.gui.screen.*;
import com.company.store.entity.OrderPosition;

@UiController("store_OrderPosition.edit")
@UiDescriptor("order-position-edit.xml")
@EditedEntityContainer("orderPositionDc")
@LoadDataBeforeShow
public class OrderPositionEdit extends StandardEditor<OrderPosition> {
}