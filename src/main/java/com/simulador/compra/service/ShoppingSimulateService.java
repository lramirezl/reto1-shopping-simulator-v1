package com.simulador.compra.service;

import com.simulador.compra.model.api.ListInformationResponse;
import com.simulador.compra.model.api.ShoppingSimulateRequest;
import com.simulador.compra.model.api.ShoppingSimulateResponse;

public interface ShoppingSimulateService {

    ShoppingSimulateResponse validate(ShoppingSimulateRequest shoppingSimulateRequest);
}
