package com.company.store.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.store.entity.Client;

@UiController("store_Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
@LoadDataBeforeShow
public class ClientBrowse extends StandardLookup<Client> {
}