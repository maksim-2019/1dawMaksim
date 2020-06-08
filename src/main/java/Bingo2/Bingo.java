/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bingo2;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author Maksim
 */
public abstract class Bingo {
    
    private String nombre;
    private LocalDate fecha;
    private String idJugador;
    
    public Bingo(String nombre) {
        Random alea = new Random();
        this.nombre = nombre;
        this.fecha = LocalDate.now();
        this.idJugador = Integer.toString(alea.nextInt(99999));
    }

    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Bingo{" + "id=" + nombre + ", fecha=" + fecha + ", idJugador=" + idJugador + '}';
    }
    
    
}
