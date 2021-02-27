package com.simulador.compra.model.api;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Card {

    private long id;
    private String tipoTarjeta;
    private String tea;

}
