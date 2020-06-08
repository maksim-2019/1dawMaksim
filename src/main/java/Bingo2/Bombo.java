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
        listaBolas = new ArrayList<>();
    }
    
    public int sacarBola(){
        return listaBolas.remove(0);
    }
    
    public abstract void llenarBombo();
    
    public int bolaDentro(){
        return listaBolas.size();
    }

    public ArrayList<Integer> getListaBolas() {
        return listaBolas;
    }
    
    public boolean vacio(){
        return listaBolas.isEmpty();
    }
    
    @Override
    public String toString() {
        String b = "";
        for (int i = 0; i < listaBolas.size(); i++) {
            b += listaBolas.get(i) + ",";
        }
        return b;
    }
}
