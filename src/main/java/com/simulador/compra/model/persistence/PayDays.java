package com.simulador.compra.model.persistence;

import javax.persistence.*;

@Entity
@Table(name = "DIAPAGO")
public class PayDays {

    private long id;
    private String numdia;

    public PayDays() {
    }

    public PayDays(String numdia) {
        this.numdia = numdia;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {

        return id;
    }
    public void setId(long id) {

        this.id = id;
    }

    @Column(name = "numdia", nullable = false)
    public String getNumDia() {

        return numdia;
    }
    public void setNumDia(String numdia) {

        this.numdia = numdia;
    }

}
