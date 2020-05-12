/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bingo2;

import java.time.LocalDate;

/**
 *
 * @author Maksim
 */
public class BingoEuropeo extends Bingo{
    
    private CartonEuropeo carton;
    private BomboEuropeo bombo;
    
    public BingoEuropeo(String id, LocalDate fecha, String idJugador,CartonEuropeo carton, BomboEuropeo bombo) {
        super(id, fecha, idJugador);
        this.carton = carton;
        this.bombo = bombo;
    }

    public CartonEuropeo getCarton() {
        return carton;
    }

    public BomboEuropeo getBombo() {
        return bombo;
    }

    @Override
    public String toString() {
        return super.toString() + "BingoEuropeo{" + "carton=" + carton + ", bombo=" + bombo + '}';
    }
    
}
