package com.company.store.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.store.entity.Product;

@UiController("store_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}