package es.dam.entornos.ut4.ejemplosut4;

import lombok.Data;

@Data
public class Prestamo {
    private String codPrestamo;
    private double cantidadInicial;
    private double cantidadPendiente;   
}
