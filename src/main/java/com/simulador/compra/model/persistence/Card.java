package com.simulador.compra.model.persistence;

import javax.persistence.*;

@Entity
@Table(name = "TARJETA")
public class Card {

    private long id;
    private String tipoTarjeta;
    private String tea;

    public Card() {
    }

    public Card(String tipoTarjeta, String tea) {
        this.tipoTarjeta = tipoTarjeta;
        this.tea = tea;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {

        return id;
    }
    public void setId(long id) {

        this.id = id;
    }

    @Column(name = "tipoTarjeta", nullable = false)
    public String getTipoTarjeta() {

        return tipoTarjeta;
    }
    public void setTipoTarjeta(String tipoTarjeta) {

        this.tipoTarjeta = tipoTarjeta;
    }

    @Column(name = "tea", nullable = false)
    public String getTea() {

        return tea;
    }
    public void setTea(String tea) {

        this.tea = tea;
    }



}
