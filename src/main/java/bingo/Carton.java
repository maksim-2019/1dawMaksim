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
//Utilizare una matriz de 3x9 para simular un carton.

    public Carton() {
    }

    public void generarCarton() {
        //Aqui pasare a explicar el funcionamiento del algoritmo.
        Random alea = new Random();//Este random se usa para generar numeros aleatorios que se usan el el algoritmo.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {//Esto es un doble for que recore la matriz.
                if (j == 0) {//El algoritmo estara dividido en columnas con los if controlare que se rellene cada columna con sus numeros corespondientes.
                    if (i >= 0) {//Inicio columna 1:
                        if (i == 0 && j == 0) {//En la primera posicion de la primera colunna.
                            int num2 = alea.nextInt(3);//se decide con una con una provavilidad entre 2 de que salga un numero o este vacio
                            if (num2 == 0) { //Que la casilla este vacia se representa con un cero.
                                matriz[i][j] = 0;
                            } else {//Con este if , else se pone un 0 o un numero aleatorio entre 1-9 
                                matriz[i][j] = alea.nextInt(8) + 1;
                            }
                        } else if (i == 1 && matriz[i - 1][0] == 0) {//Este else if comprueba si la posicion anterior no tiene un numero asigrado
                            int num2 = alea.nextInt(3);//Si se cumple la condicion se vuelve a generar un numero aleatorio y con 
                            //este se decide si este numero esta vacio o contienen un numero entre el 1-9
                            if (num2 == 0) {
                                matriz[i][j] = 0;
                            } else {
                                matriz[i][j] = alea.nextInt(8) + 1;
                            }
                        } else if (i == 2 && matriz[i - 1][0] > 1 && matriz[i - 2][0] > 1) {
                            //Este else if comprueba si las anteriores posiciones tienen un numero,
                            //si lo tienen pondra un cero para que no haya tres numeros seguidos. 
                            matriz[i][j] = 0;
                        } else {//Este else se ejecuta si ninguna de las anteriores opciones se cumple.
                            int num;
                            if (matriz[0][0] == 9) {
                                matriz[1][0] = 0;
                                matriz[2][0] = 0;
                            } else if (matriz[1][0] == 9) {
                                matriz[2][0] = 0;
                            } else {
                                if (matriz[0][0] > 1 && matriz[1][0] == 0) {
                                    num = matriz[0][0] + 1;
                                } else {
                                    num = matriz[i - 1][j] + 1;
                                }
                                matriz[i][j] = alea.nextInt(9 - num + 1) + num;
                            }

                        }
                    }
                    //Fin columna 1
                } else if (j == 1) {//Principio columna 2:
                    if (i >= 0) {
                        if (i == 0 && j == 1) {
                            int num2 = alea.nextInt(2);
                            if (num2 == 0) {
                                matriz[i][j] = 0;
                            } else {
                                matriz[i][j] = alea.nextInt(19 - 10 + 1) + 10;
                            }
                        } else if (i == 1 && matriz[i - 1][1] == 0) {
                            int num2 = alea.nextInt(2);
                            if (num2 == 0) {
                                matriz[i][j] = 0;
                            } else {
                                matriz[i][j] = alea.nextInt(19 - 10 + 1) + 10;
                            }
                        } else if (i == 2 && matriz[i - 1][1] > 1 && matriz[i - 2][1] > 1) {
                            matriz[i][j] = 0;
                        } else {
                            int num;
                            if (matriz[0][1] == 19) {
                                matriz[1][1] = 0;
                                matriz[2][1] = 0;
                            } else if (matriz[1][1] == 19) {
                                matriz[2][1] = 0;
                            } else {
                                if (matriz[0][1] > 1 && matriz[1][1] == 0) {
                                    num = matriz[0][1] + 1;
                                } else {
                                    num = matriz[i - 1][j] + 1;
                                }
                                matriz[i][j] = alea.nextInt(19 - num + 1) + num;
                            }

                        }
                    }
                    //Fin columna 2
                } else if (j == 2) {//Principio columna 3
                    if (i >= 0) {
                        if (i == 0 && j == 2) {
                            int num2 = alea.nextInt(2);
                            if (num2 == 0) {
                                matriz[i][j] = 0;
                            } else {
                                matriz[i][j] = alea.nextInt(29 - 20 + 1) + 20;
                            }
                        } else if (i == 1 && matriz[i - 1][2] == 0) {
                            int num2 = alea.nextInt(2);
                            if (num2 == 0) {
                                matriz[i][j] = 0;
                            } else {
                                matriz[i][j] = alea.nextInt(29 - 20 + 1) + 20;
                            }
                        } else if (i == 2 && matriz[i - 1][2] > 1 && matriz[i - 2][2] > 1) {
                            matriz[i][j] = 0;
                        } else {
                            int num;
                            if (matriz[0][2] == 19) {
                                matriz[1][2] = 0;
                                matriz[2][2] = 0;
                            } else if (matriz[1][2] == 19) {
                                matriz[2][2] = 0;
                            } else {
                                if (matriz[0][2] > 1 && matriz[1][2] == 0) {
                                    num = matriz[0][2] + 1;
                                } else {
                                    num = matriz[i - 1][j] + 1;
                                }
                                matriz[i][j] = alea.nextInt(29 - num + 1) + num;
                            }
                        }
                    }
                    //Fin columna 3    
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
                System.out.print(ale.getMatriz()[i][j] + " | ");
            }
            System.out.println("\n-----------------------------------------------");
        }
    }
}
