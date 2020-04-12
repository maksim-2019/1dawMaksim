/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

/**
 *
 * @author Maksim
 */
public class Carton {

    private int fila1[] = new int[9];
    private int fila2[] = new int[9];
    private int fila3[] = new int[9];

    public Carton() {
    }

    public int[] getFila1() {
        return fila1;
    }

    public void setFila1(int[] fila1) {
        this.fila1 = fila1;
    }

    public int[] getFila2() {
        return fila2;
    }

    public void setFila2(int[] fila2) {
        this.fila2 = fila2;
    }

    public int[] getFila3() {
        return fila3;
    }

    public void setFila3(int[] fila3) {
        this.fila3 = fila3;
    }

    @Override
    public String toString() {
        return "Carton{" + "fila1=" + fila1 + ", fila2=" + fila2 + ", fila3=" + fila3 + '}';
    }
    
    
}
