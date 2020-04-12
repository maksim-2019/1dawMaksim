/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.util.Random;

/**
 *
 * @author Maksim
 */
public class Carton {

    private int matriz[][] = new int[3][9];

    public Carton() {
    }

    public void generarCarton() {
        Random alea = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0) {
                    if (i > 0) {
                        matriz[0][0] = 0;
//                        if (matriz[i - 1][j] == 9 || matriz[i - 1][j] == 0) {
//                            matriz[i][j] = 0;
//                        } else 
                        if (i == 1 && matriz[i - 1][0] == 0) {
                            matriz[i][j] = alea.nextInt(8) + 1;
                        } else if (i == 2 && matriz[i - 1][0] > 1) {
                            matriz[i][j] = 0;
                        } else {
                            int num = matriz[i - 1][j] + 1;
                            matriz[i][j] = alea.nextInt(9 - num + 1) + num;
                        }
                    } else {
                        matriz[i][j] = alea.nextInt(8);
                        System.out.println("------------");
                    }

                }
                //matriz[i][j] = alea.nextInt(90) + 10;
            }
        }

    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    @Override
    public String toString() {
        return "Carton{" + "matriz=" + matriz + '}';

    }

    public static void main(String[] args) {
        Carton ale = new Carton();
        ale.generarCarton();
        for (int i = 0; i < ale.getMatriz().length; i++) {
            for (int j = 0; j < ale.getMatriz()[i].length; j++) {
                System.out.print(ale.getMatriz()[i][j]);
            }
            System.out.println("\n--------------");
        }
    }
}
