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
        int contador;
        do {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    switch (j) {
                        case 0:
                            if (i == 0) {
                                matriz[i][j] = alea.nextInt(8) + 1;
                            } else if (i == 1 && matriz[i - 1][j] < 9) {
                                matriz[i][j] = alea.nextInt(9 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                            } else if (i == 2 && matriz[i - 1][j] < 9) {
                                if (matriz[i - 1][j] == 0 && matriz[i - 2][j] <= 9) {
                                    matriz[i][j] = alea.nextInt(9 - matriz[i - 2][j] + 1) + matriz[i - 2][j];
                                } else {
                                    matriz[i][j] = alea.nextInt(9 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                                }
                            } else {
                                matriz[i][j] = 0;
                            }
                            break;
                        case 1:
                            if (i == 0) {
                                matriz[i][j] = alea.nextInt(19 - 10 + 1) + 10;
                            } else if (i == 1 && matriz[i - 1][j] < 19) {
                                matriz[i][j] = alea.nextInt(19 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                            } else if (i == 2 && matriz[i - 1][j] < 19) {
                                if (matriz[i - 1][j] == 0 && matriz[i - 2][j] <= 19) {
                                    matriz[i][j] = alea.nextInt(19 - matriz[i - 2][j] + 1) + matriz[i - 2][j];
                                } else {
                                    matriz[i][j] = alea.nextInt(19 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                                }
                            } else {
                                matriz[i][j] = 0;
                            }
                            //matriz[i][j] = alea.nextInt(19 - 10 + 1) + 10;
                            break;
                        case 2:
                            if (i == 0) {
                                matriz[i][j] = alea.nextInt(29 - 20 + 1) + 20;
                            } else if (i == 1 && matriz[i - 1][j] < 29) {
                                matriz[i][j] = alea.nextInt(29 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                            } else if (i == 2 && matriz[i - 1][j] < 29) {
                                if (matriz[i - 1][j] == 0 && matriz[i - 2][j] <= 29) {
                                    matriz[i][j] = alea.nextInt(29 - matriz[i - 2][j] + 1) + matriz[i - 2][j];
                                } else {
                                    matriz[i][j] = alea.nextInt(29 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                                }
                            } else {
                                matriz[i][j] = 0;
                            }
                            //matriz[i][j] = alea.nextInt(29 - 20 + 1) + 20;
                            break;
                        case 3:
                            if (i == 0) {
                                matriz[i][j] = alea.nextInt(39 - 30 + 1) + 30;
                            } else if (i == 1 && matriz[i - 1][j] < 39) {
                                matriz[i][j] = alea.nextInt(39 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                            } else if (i == 2 && matriz[i - 1][j] < 39) {
                                if (matriz[i - 1][j] == 0 && matriz[i - 2][j] <= 39) {
                                    matriz[i][j] = alea.nextInt(39 - matriz[i - 2][j] + 1) + matriz[i - 2][j];
                                } else {
                                    matriz[i][j] = alea.nextInt(39 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                                }
                            } else {
                                matriz[i][j] = 0;
                            }
                            //matriz[i][j] = alea.nextInt(39 - 30 + 1) + 30;
                            break;
                        case 4:
                            if (i == 0) {
                                matriz[i][j] = alea.nextInt(49 - 40 + 1) + 40;
                            } else if (i == 1 && matriz[i - 1][j] < 49) {
                                matriz[i][j] = alea.nextInt(49 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                            } else if (i == 2 && matriz[i - 1][j] < 49) {
                                if (matriz[i - 1][j] == 0 && matriz[i - 2][j] <= 49) {
                                    matriz[i][j] = alea.nextInt(49 - matriz[i - 2][j] + 1) + matriz[i - 2][j];
                                } else {
                                    matriz[i][j] = alea.nextInt(49 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                                }
                            } else {
                                matriz[i][j] = 0;
                            }
                            //matriz[i][j] = alea.nextInt(49 - 40 + 1) + 40;
                            break;
                        case 5:
                            if (i == 0) {
                                matriz[i][j] = alea.nextInt(59 - 50 + 1) + 50;
                            } else if (i == 1 && matriz[i - 1][j] < 59) {
                                matriz[i][j] = alea.nextInt(59 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                            } else if (i == 2 && matriz[i - 1][j] < 59) {
                                if (matriz[i - 1][j] == 0 && matriz[i - 2][j] <= 59) {
                                    matriz[i][j] = alea.nextInt(59 - matriz[i - 2][j] + 1) + matriz[i - 2][j];
                                } else {
                                    matriz[i][j] = alea.nextInt(59 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                                }
                            } else {
                                matriz[i][j] = 0;
                            }
                            //matriz[i][j] = alea.nextInt(59 - 50 + 1) + 50;
                            break;
                        case 6:
                            if (i == 0) {
                                matriz[i][j] = alea.nextInt(69 - 60 + 1) + 60;
                            } else if (i == 1 && matriz[i - 1][j] < 19) {
                                matriz[i][j] = alea.nextInt(69 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                            } else if (i == 2 && matriz[i - 1][j] < 69) {
                                if (matriz[i - 1][j] == 0 && matriz[i - 2][j] <= 69) {
                                    matriz[i][j] = alea.nextInt(69 - matriz[i - 2][j] + 1) + matriz[i - 2][j];
                                } else {
                                    matriz[i][j] = alea.nextInt(69 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                                }
                            } else {
                                matriz[i][j] = 0;
                            }
                            //matriz[i][j] = alea.nextInt(69 - 60 + 1) + 60;
                            break;
                        case 7:
                            if (i == 0) {
                                matriz[i][j] = alea.nextInt(79 - 70 + 1) + 70;
                            } else if (i == 1 && matriz[i - 1][j] < 79) {
                                matriz[i][j] = alea.nextInt(79 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                            } else if (i == 2 && matriz[i - 1][j] < 79) {
                                if (matriz[i - 1][j] == 0 && matriz[i - 2][j] <= 79) {
                                    matriz[i][j] = alea.nextInt(79 - matriz[i - 2][j] + 1) + matriz[i - 2][j];
                                } else {
                                    matriz[i][j] = alea.nextInt(79 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                                }
                            } else {
                                matriz[i][j] = 0;
                            }
                            //matriz[i][j] = alea.nextInt(79 - 70 + 1) + 70;
                            break;
                        case 8:
                            if (i == 0) {
                                matriz[i][j] = alea.nextInt(90 - 80 + 1) + 80;
                            } else if (i == 1 && matriz[i - 1][j] < 90) {
                                matriz[i][j] = alea.nextInt(90 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                            } else if (i == 2 && matriz[i - 1][j] < 90) {
                                if (matriz[i - 1][j] == 0 && matriz[i - 2][j] <= 90) {
                                    matriz[i][j] = alea.nextInt(90 - matriz[i - 2][j] + 1) + matriz[i - 2][j];
                                } else {
                                    matriz[i][j] = alea.nextInt(90 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                                }
                            } else {
                                matriz[i][j] = 0;
                            }
                            //matriz[i][j] = alea.nextInt(90 - 80 + 1) + 80;
                            break;
                    }
                }
            }

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i == 1) {
                        if (matriz[i][j] == matriz[i - 1][j]) {
                            matriz[i][j] = 0;
                        }
                    } else if (i == 2) {
                        if (matriz[i][j] == matriz[i - 1][j] || matriz[i][j] == matriz[i - 2][j]) {
                            matriz[i][j] = 0;
                        }
                    }

                }
            }
            for (int i = 0; i < 9; i++) {
                if (matriz[0][i] >= 1 && matriz[1][i] >= 1 && matriz[2][i] >= 1) {
                    int num = alea.nextInt(3);
                    matriz[num][i] = 0;
                }
            }
            contador = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] >= 1) {
                        contador++;
                    }
                }
            }
        } while (contador < 15);

        ponerCero(matriz);

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

    private static void ponerCero(int aux[][]) {
        int contador = 0;
        int fila1 = 0;
        int fila2 = 0;
        int fila3 = 0;
        Random alea = new Random();
        int num;

        //---------------------
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                if (i == 0 && aux[i][j] > 0) {
                    fila1++;
                } else if (i == 1 && aux[i][j] > 0) {
                    fila2++;
                } else if (i == 2 && aux[i][j] > 0) {
                    fila3++;
                }
            }
        }
        do {
            for (int i = 0; i < aux[0].length; i++) {
                if (fila1 > 5) {
                    if (aux[1][i] == 0) {
                        aux[1][i] = aux[0][i];
                        aux[0][i] = 0;
                        fila1--;
                    } else if (aux[2][i] == 0) {
                        aux[2][i] = aux[0][i];
                        aux[0][i] = 0;
                        fila1--;
                    }
                } else if (fila1 < 5) {
                    if (aux[0][i] == 0) {
                        int num2;
                        if (aux[1][i] >= 1) {
                            aux[0][i] = aux[1][i];
                            aux[1][i] = 0;
                            fila1++;
                            fila2--;
                        } else if (aux[2][i] >= 1) {
                            aux[0][i] = aux[2][i];
                            aux[2][i] = 0;
                            fila1++;
                            fila3--;
                        }
                    }
                }
            }
        } while (fila1 != 5);
        for (int i = 0; i < 9; i++) {
            if (aux[2][i] != 0 && aux[1][i] > aux[2][i]) {
                num = aux[2][i];
                aux[2][i] = aux[1][i];
                aux[1][i] = num;
            }
        }
        fila1 = 0;
        fila2 = 0;
        fila3 = 0;
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                if (i == 0 && aux[i][j] > 0) {
                    fila1++;
                } else if (i == 1 && aux[i][j] > 0) {
                    fila2++;
                } else if (i == 2 && aux[i][j] > 0) {
                    fila3++;
                }
            }
        }
        
        if (fila2 < 5) {
            for (int i = 0; i < 9; i++) {
                if (aux[1][i] == 0 && aux[2][i] >= 1 && fila2 < 5) {
                    int num2 = aux[2][i];
                    aux[1][i] = num2;
                    aux[2][i] = 0;
                    fila2++;
                    fila3--;
                }
            }
        } else if(fila3 < 5){
            for (int i = 0; i < 9; i++) {
                if (aux[2][i] == 0 && aux[1][i] >= 1 && fila3 < 5) {
                    int num2 = aux[1][i];
                    aux[2][i] = num2;
                    aux[1][i] = 0;
                    fila3++;
                    fila2--;
                }
            }
        }
        

        if(fila2 > 5){
        num = fila2-5;
        int num2;
            for (int i = 0; i < num; i++) {
                do{
                num2 = alea.nextInt(9);
                }while(aux[1][num2] != 0);
                    aux[1][num2] = 0;
                    fila2--;
                    
            }
        }
        
        if(fila3 > 5){
            num = fila3-5;
        int num2;
            for (int i = 0; i < num; i++) {
                do{
                num2 = alea.nextInt(9);
                }while(aux[2][num2] != 0);
                aux[2][num2] = 0;
                fila3--;
                
            }
        }
    }

    public static void main(String[] args) {
        Carton ale = new Carton();
        ale.generarCarton();
        System.out.println("Tabla 2");
        for (int i = 0; i < ale.getMatriz().length; i++) {
            for (int j = 0; j < ale.getMatriz()[i].length; j++) {
                System.out.print(ale.getMatriz()[i][j] + "\t|\t");
            }
            System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}
