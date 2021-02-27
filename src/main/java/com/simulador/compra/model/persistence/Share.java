package com.simulador.compra.model.persistence;

import javax.persistence.*;

@Entity
@Table(name = "CUOTA")
public class Share {

    private long id;
    private String numcuota;

    public Share() {
    }

    public Share(String numcuota) {
        this.numcuota = numcuota;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {

        return id;
    }
    public void setId(long id) {

        this.id = id;
    }

    @Column(name = "numcuota", nullable = false)
    public String getNumCuota() {

        return numcuota;
    }
    public void setNumCuota(String numcuota) {

        this.numcuota = numcuota;
    }

}
