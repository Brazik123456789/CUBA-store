package com.company.store.web.screens.orderposition;

import com.haulmont.cuba.gui.screen.*;
import com.company.store.entity.OrderPosition;

@UiController("store_OrderPosition.browse")
@UiDescriptor("order-position-browse.xml")
@LookupComponent("orderPositionsTable")
@LoadDataBeforeShow
public class OrderPositionBrowse extends StandardLookup<OrderPosition> {
}