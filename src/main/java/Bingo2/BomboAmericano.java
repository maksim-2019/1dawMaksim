/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bingo2;

import java.util.Collections;

/**
 *
 * @author Maksim
 */
public final class BomboAmericano extends Bombo{
    private static final int cantidadBolas = 75;

    public BomboAmericano() {
        super();
        llenarBombo();
    }

    @Override
    public void llenarBombo() {
        for (int i = 0; i < cantidadBolas; i++) {
            super.getListaBolas().add(i + 1);
        }
        Collections.shuffle(super.getListaBolas());
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
