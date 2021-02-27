package com.simulador.compra.model.api;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
public class ShoppingSimulateResponse {

    private String cuota;

    private String moneda;

    private String primeraCuota;

    private String estado;

}