package com.simulador.compra.model.api;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.*;
import java.util.Date;

@Getter
@Builder
public class ShoppingSimulateRequest {

    @NotBlank(message = "DNI cannot not be empty")
    @Size(min = 8, max = 8, message = "number of characters 8")
    @Pattern(regexp = "^[0-9,$]*$")
    private String dni;

    @NotBlank(message = "TARJETA cannot not be empty")
    private String tarjeta;

    @NotBlank(message = "MONEDA cannot not be empty")
    @Size(min = 2, max = 2, message = "number of characters 2")
    private String moneda;

    @NotNull(message = "MONTO cannot not be empty")
    @Min(value = 1, message = "minimum amount 1")
    @Max(value = 10000, message = "Maximum amount 10000")
    private Double monto;

    @NotNull(message = "CUOTA cannot not be empty")
    private Integer cuota;

    @NotBlank(message = "TEA cannot not be empty")
    private String tea;

    @NotBlank(message = "DIAPAGO cannot not be empty")
    private String diaPago;

    @NotBlank(message = "FECHACOMPRA cannot not be empty")
    private Date FechaCompra;

}
