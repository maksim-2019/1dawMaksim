/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bingo2;

/**
 *
 * @author Maksim
 */
public abstract class Bombo {
    private int[] listaBolas;

    public Bombo() {
    }
    
    public int sacarBola(){
        return 1;
    }
    
    public void llenarBombo(){
    
    }
    
    public int bolaDentro(){
        return 1;
    }
    
    public boolean vacio(){
        return true;
    }
}
