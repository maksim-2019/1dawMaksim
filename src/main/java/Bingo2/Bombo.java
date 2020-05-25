/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bingo2;

import java.util.ArrayList;

/**
 *
 * @author Maksim
 */
public abstract class Bombo {
    private ArrayList<Integer> listaBolas;

    public Bombo() {
    }
    
    public int sacarBola(){
        return 1;
    }
    
    public abstract void llenarBombo();
    
    public int bolaDentro(){
        return 1;
    }
    
    public boolean vacio(){
        return true;
    }
}
