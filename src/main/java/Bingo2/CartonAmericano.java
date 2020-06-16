/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bingo2;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Maksim
 */
public final class CartonAmericano extends Carton {

    private final Patron premio;
    private static final int FILAS = 5;
    private static final int COLUMNAS = 5;

    public CartonAmericano() {
        super(FILAS, COLUMNAS);
        this.premio = genPatron();
        generarCarton();
    }

    @Override
    public void generarCarton() {
        Random alea = new Random();
        int num1 = 1;
        int num2 = 15;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int num3 = 0;
                do {
                    num3 = alea.nextInt(num2 - num1 + 1) + num1;
                } while (numRepetido(num3, i, matriz));
                super.getMatriz()[j][i] = num3;
            }
            num1 += 15;
            num2 += 15;
        }
        ArrayList<Point> casillas = premio.getCasillas();
        for (int i = 0; i < casillas.size(); i++) {
            super.getMatriz()[(int) casillas.get(i).getX()][(int) casillas.get(i).getY()] = 0;
        }
    }

    private static Patron genPatron() {
        Random alea = new Random();

        switch (alea.nextInt(4)) {
            case 0:
                return Patron.CARTON_4PUNTOS;

            case 1:
                return Patron.CARTON_BARRASDIAGONAL;

            case 2:
                return Patron.CARTON_FORMACRUP;

            case 3:
                return Patron.CARTON_FORMAL;

            default:
                return Patron.CARTON_LLENO;
        }
    }

    private static boolean numRepetido(int aux, int numColum, int[][] matriz) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][numColum] == aux) {
                contador++;
            }

        }
        return contador != 0;

    }

    public Patron getPremio() {
        return premio;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean esLinea(int numeroFila) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean esBingo() {
        for (int i = 0; i < super.getMatriz().length; i++) {
            for (int j = 0; j < super.getMatriz()[i].length; j++) {
                if (super.getMatriz()[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CartonAmericano carton = new CartonAmericano();
        carton.generarCarton();
        System.out.println(carton.toString());
    }
}
