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
public final class BingoAmericano extends Bingo{
    
    private CartonAmericano carton;
    private BomboAmericano bombo;

    public BingoAmericano(String nombre, CartonAmericano carton, BomboAmericano bombo) {
        super(nombre);
        this.carton = carton;
        this.bombo = bombo;
    }

    public CartonAmericano getCarton() {
        return carton;
    }

    public BomboAmericano getBombo() {
        return bombo;
    }

    @Override
    public String toString() {
        return super.toString() + "BingoAmericano{" + "carton=" + carton + ", bombo=" + bombo + '}';
    }
    
    
}
