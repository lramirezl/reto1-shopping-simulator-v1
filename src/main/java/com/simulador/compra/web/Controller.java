package com.simulador.compra.web;

import com.simulador.compra.model.api.*;
import com.simulador.compra.repository.CardRepository;
import com.simulador.compra.repository.PayDaysRepository;
import com.simulador.compra.repository.ShareRepository;
import com.simulador.compra.service.ShoppingSimulateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/shopping-simulator/v1")
public class Controller {

    @Autowired
    private ShoppingSimulateService shoppingSimulateService;

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private PayDaysRepository payDaysRepository;

    @Autowired
    private ShareRepository shareRepository;

    @GetMapping(path = "/datalist")
    public ListInformationResponse getDataList(){

        List<Card> cardResponse = new ArrayList<>();
        cardRepository.findAll()
                .forEach(cardEntityResponse ->{
                    Card carResp = Card.builder()
                            .id(cardEntityResponse.getId())
                            .tipoTarjeta(cardEntityResponse.getTipoTarjeta())
                            .tea(cardEntityResponse.getTea())
                            .build();
                    cardResponse.add(carResp);
                });

        List<PayDays> payDaysResponse = new ArrayList<>();
        payDaysRepository.findAll()
                .forEach(payDaysEntityResponse ->{
                    PayDays payDayResp = PayDays.builder()
                            .id(payDaysEntityResponse.getId())
                            .numdia(payDaysEntityResponse.getNumDia())
                            .build();
                    payDaysResponse.add(payDayResp);
                });

        List<Share> shareResponse = new ArrayList<>();
        shareRepository.findAll()
                .forEach(shareEntityResponse ->{
                    Share shareResp = Share.builder()
                            .id(shareEntityResponse.getId())
                            .numcuota(shareEntityResponse.getNumCuota())
                            .build();
                    shareResponse.add(shareResp);
                });

        return ListInformationResponse.builder()
                .tarjeta(cardResponse)
                .cuotas(shareResponse)
                .diaspago(payDaysResponse)
                .build();

    }

    @PostMapping(path = "/analyze", consumes = "application/json", produces = "application/json")
    public ShoppingSimulateResponse postAnalyze(@Valid @RequestBody ShoppingSimulateRequest shoppingSimulateRequest) {

        return shoppingSimulateService.validate(shoppingSimulateRequest);

    }

}
