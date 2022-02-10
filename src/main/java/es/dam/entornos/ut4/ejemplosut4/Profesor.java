package es.dam.entornos.ut4.ejemplosut4;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    String str;
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono) {
        super(numeroDeTelefono);
        this.numeroDeTelefono = numeroDeTelefono;
        this.prestamos = new ArrayList<Prestamo>();
        Prestamo p = new Prestamo();
        p.setCantidadInicial(20000);
        p.setCantidadPendiente(5000);
        p.setCodPrestamo("1100");
        this.prestamos.add(p);
    }

    public void printInformacionPersonal() {
        System.out.println("Nombre:" + str);
        System.out.println("Edad:" + edad);
        System.out.println("Teléfono:" + numeroDeTelefono);
    }
    
    public void printTodaLaInformacion() {
        System.out.println("Nombre:" + str);
        System.out.println("Edad:" + edad);
        System.out.println("Teléfono:" + numeroDeTelefono);

        for (Prestamo p: prestamos) {
            System.out.println(p.toString());
        }
    }
}