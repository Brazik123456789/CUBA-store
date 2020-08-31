package com.company.store.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.store.entity.Client;

@UiController("store_Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
@LoadDataBeforeShow
public class ClientEdit extends StandardEditor<Client> {
}