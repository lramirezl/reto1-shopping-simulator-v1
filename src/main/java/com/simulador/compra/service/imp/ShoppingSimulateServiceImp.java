package com.simulador.compra.service.imp;

import com.simulador.compra.model.api.ShoppingSimulateRequest;
import com.simulador.compra.model.api.ShoppingSimulateResponse;
import com.simulador.compra.service.ShoppingSimulateService;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class ShoppingSimulateServiceImp implements ShoppingSimulateService {

    @Override
    public ShoppingSimulateResponse validate(ShoppingSimulateRequest shoppingSimulateRequest) {

        int n=1;
        double TEM = Math.pow(1+Double.parseDouble(shoppingSimulateRequest.getTea()), 0.084) -1;
        double FRC = (TEM*(Math.pow(1+TEM,n)))/(Math.pow(1+TEM,n)-1);
        double cuota = FRC*shoppingSimulateRequest.getCuota();

        return ShoppingSimulateResponse.builder()
                .cuota(String.valueOf(cuota))
                .moneda(shoppingSimulateRequest.getMoneda())
                .primeraCuota(String.valueOf(addDaysToDate(shoppingSimulateRequest.getFechaCompra(),
                        shoppingSimulateRequest.getDiaPago())))
                .estado("exitoso")
                .build();
    }

    public Date addDaysToDate(Date fecha, String dias){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.DAY_OF_YEAR, Integer.parseInt(dias));
        return calendar.getTime();
    }


}