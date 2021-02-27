package com.simulador.compra.model.api;


import lombok.Builder;

import java.util.List;

@Builder
public class ListInformationResponse {

    private List<Card> tarjeta;

    private List<Share> cuotas;

    private List<PayDays> diaspago;

}
