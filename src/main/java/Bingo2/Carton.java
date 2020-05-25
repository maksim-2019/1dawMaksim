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
    
    public Point tacharNumero(int numero){
        return new Point();
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
        return "Carton{" + "matriz=" + matriz + ", filas=" + filas + ", columnas=" + columnas + '}';
    }
    
}
