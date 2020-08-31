package com.company.store.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.store.entity.Product;

@UiController("store_Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
@LoadDataBeforeShow
public class ProductEdit extends StandardEditor<Product> {
}