/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bingo2;

import java.awt.Point;

/**
 *
 * @author Maksim
 */
public abstract class Carton {
    int [][] matriz;
    int filas;
    int columnas;

    public Carton(int filas, int columnas) {
        this.matriz = new int[filas][columnas];
        this.filas = filas;
        this.columnas = columnas;
    }
    
    public void tacharNumero(int numero){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == numero){
                    matriz[i][j] = 0;
                }
            }
        }
    }
    
    public abstract void generarCarton();
    
    public abstract boolean esLinea(int numeroFila);
    
    public abstract boolean esBingo();

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    @Override
    public String toString() {
        String tmp = "";
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[i].length; j++) {
                tmp += this.matriz[i][j] + "\t";
            }
            tmp += "\n";
        }
        return tmp;
    }
    
}
