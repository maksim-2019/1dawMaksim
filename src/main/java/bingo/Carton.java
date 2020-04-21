/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.util.ArrayList;
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
        Random alea = new Random();//Este random se usa para generar numeros aleatorios que se usan en el algoritmo.
        int contador; // se usa para controlar la cantidad de numeros que se genera
        do {//Un "0" es igual a que el espacio esta vacio.
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {//el for de arriba y este son los for que recoren la matriz
                    switch (j) { //puse un switch para que rellenara el numero corespondiente a cada columna
                        case 0://El algoritmo para rellenar los es el mismo para todas las columnas, solo cambian los numeros a rellenar.
                            if (i == 0) {//el primer espacio de la matriz se rellenar con un numero del 1 - 9 en este caso.
                                matriz[i][j] = alea.nextInt(8) + 1;
                            } else if (i == 1 && matriz[i - 1][j] < 9) {//en este else if se cumple si esta en la fila 2 y el numero anterior es menor que 9
                                matriz[i][j] = alea.nextInt(9 - matriz[i - 1][j] + 1) + matriz[i - 1][j];//lo que hace este codigo es rellenar el segundo espacio con un numero entre "x" y 9.
                                //corespondiendo x al numero de la fila anterior
                            } else if (i == 2 && matriz[i - 1][j] < 9) { //en este else if se cumple si esta en la fila 3 y el numero anterior es menor que 9
                                if (matriz[i - 1][j] == 0 && matriz[i - 2][j] <= 9) {//dentro de este else if encontramos otro if que controla si la primera posicion es 0 y la segunda es menor o igual que 9 
                                    //ejecuta el siguiente codigo
                                    //Lo que hace es poner un numero aleatorio entre un rango determinado entre el numero de la posicion anterior y 9.
                                    matriz[i][j] = alea.nextInt(9 - matriz[i - 2][j] + 1) + matriz[i - 2][j];
                                }
                            } else {//En caso de que ninguno de los if anteriores se ejecute rellenamos esa posicion con un cero.
                                matriz[i][j] = 0;
                            }
                            break;//Y aqui se corta este switch y para a la siguiente iteracion del bucle.
                            //El resto del codigo del switch es identico solo cambia el rango de los numeros.
                        case 1:
                            if (i == 0) {
                                matriz[i][j] = alea.nextInt(19 - 10 + 1) + 10;
                            } else if (i == 1 && matriz[i - 1][j] < 19) {
                                matriz[i][j] = alea.nextInt(19 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                            } else if (i == 2 && matriz[i - 1][j] < 19) {
                                if (matriz[i - 1][j] == 0 && matriz[i - 2][j] <= 19) {
                                    matriz[i][j] = alea.nextInt(19 - matriz[i - 2][j] + 1) + matriz[i - 2][j];
                                }
                            } else {
                                matriz[i][j] = 0;
                            }
                            
                            break;
                        case 2:
                            if (i == 0) {
                                matriz[i][j] = alea.nextInt(29 - 20 + 1) + 20;
                            } else if (i == 1 && matriz[i - 1][j] < 29) {
                                matriz[i][j] = alea.nextInt(29 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                            } else if (i == 2 && matriz[i - 1][j] < 29) {
                                if (matriz[i - 1][j] == 0 && matriz[i - 2][j] <= 29) {
                                    matriz[i][j] = alea.nextInt(29 - matriz[i - 2][j] + 1) + matriz[i - 2][j];
                                }
                            } else {
                                matriz[i][j] = 0;
                            }
                            
                            break;
                        case 3:
                            if (i == 0) {
                                matriz[i][j] = alea.nextInt(39 - 30 + 1) + 30;
                            } else if (i == 1 && matriz[i - 1][j] < 39) {
                                matriz[i][j] = alea.nextInt(39 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                            } else if (i == 2 && matriz[i - 1][j] < 39) {
                                if (matriz[i - 1][j] == 0 && matriz[i - 2][j] <= 39) {
                                    matriz[i][j] = alea.nextInt(39 - matriz[i - 2][j] + 1) + matriz[i - 2][j];
                                }
                            } else {
                                matriz[i][j] = 0;
                            }
                            
                            break;
                        case 4:
                            if (i == 0) {
                                matriz[i][j] = alea.nextInt(49 - 40 + 1) + 40;
                            } else if (i == 1 && matriz[i - 1][j] < 49) {
                                matriz[i][j] = alea.nextInt(49 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                            } else if (i == 2 && matriz[i - 1][j] < 49) {
                                if (matriz[i - 1][j] == 0 && matriz[i - 2][j] <= 49) {
                                    matriz[i][j] = alea.nextInt(49 - matriz[i - 2][j] + 1) + matriz[i - 2][j];
                                }
                            } else {
                                matriz[i][j] = 0;
                            }
                            
                            break;
                        case 5:
                            if (i == 0) {
                                matriz[i][j] = alea.nextInt(59 - 50 + 1) + 50;
                            } else if (i == 1 && matriz[i - 1][j] < 59) {
                                matriz[i][j] = alea.nextInt(59 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                            } else if (i == 2 && matriz[i - 1][j] < 59) {
                                if (matriz[i - 1][j] == 0 && matriz[i - 2][j] <= 59) {
                                    matriz[i][j] = alea.nextInt(59 - matriz[i - 2][j] + 1) + matriz[i - 2][j];
                                }
                            } else {
                                matriz[i][j] = 0;
                            }
                            
                            break;
                        case 6:
                            if (i == 0) {
                                matriz[i][j] = alea.nextInt(69 - 60 + 1) + 60;
                            } else if (i == 1 && matriz[i - 1][j] < 19) {
                                matriz[i][j] = alea.nextInt(69 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                            } else if (i == 2 && matriz[i - 1][j] < 69) {
                                if (matriz[i - 1][j] == 0 && matriz[i - 2][j] <= 69) {
                                    matriz[i][j] = alea.nextInt(69 - matriz[i - 2][j] + 1) + matriz[i - 2][j];
                                }
                            } else {
                                matriz[i][j] = 0;
                            }
                            
                            break;
                        case 7:
                            if (i == 0) {
                                matriz[i][j] = alea.nextInt(79 - 70 + 1) + 70;
                            } else if (i == 1 && matriz[i - 1][j] < 79) {
                                matriz[i][j] = alea.nextInt(79 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                            } else if (i == 2 && matriz[i - 1][j] < 79) {
                                if (matriz[i - 1][j] == 0 && matriz[i - 2][j] <= 79) {
                                    matriz[i][j] = alea.nextInt(79 - matriz[i - 2][j] + 1) + matriz[i - 2][j];
                                }
                            } else {
                                matriz[i][j] = 0;
                            }
                            
                            break;
                        case 8:
                            if (i == 0) {
                                matriz[i][j] = alea.nextInt(90 - 80 + 1) + 80;
                            } else if (i == 1 && matriz[i - 1][j] < 90) {
                                matriz[i][j] = alea.nextInt(90 - matriz[i - 1][j] + 1) + matriz[i - 1][j];
                            } else if (i == 2 && matriz[i - 1][j] < 90) {
                                if (matriz[i - 1][j] == 0 && matriz[i - 2][j] <= 90) {
                                    matriz[i][j] = alea.nextInt(90 - matriz[i - 2][j] + 1) + matriz[i - 2][j];
                                }
                            } else {
                                matriz[i][j] = 0;
                            }
                            
                            break;
                    }
                }
            }
            //Un "0" es igual a que el espacio esta vacio.
            //Este doble for lo que hace es recorrer la matriz y si hay numeros repetidos pone uno de ellos a "0".
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i == 1) {//tiene dos if, el primero se ejecuta cuando se recore la fila 1
                        if (matriz[i][j] == matriz[i - 1][j]) {//este segundo segundo se ejecuta cuando el numero de arriba es igual al que se encuntra.
                            matriz[i][j] = 0; // pone ese numero a 0.
                        }
                    } else if (i == 2) {//este se ejecuta si esta recoriendo la ultima fila del bucle.
                        if (matriz[i][j] == matriz[i - 1][j] || matriz[i][j] == matriz[i - 2][j]) { //Comprueba si el numero de la tercera fila es igual al de la segunda o el de la primera
                            matriz[i][j] = 0;// pone ese numero a 0.
                        }
                    }

                }
            }
            for (int i = 0; i < 9; i++) { //este pequeño for comprueba si en alguna columna ahy 3 numeros seguidos
                //si los ahy pone en "0" uno de ellos de manera aleatoria
                if (matriz[0][i] >= 1 && matriz[1][i] >= 1 && matriz[2][i] >= 1) {
                    int num = alea.nextInt(3);
                    matriz[num][i] = 0;
                }
            }
            // Este for cuenta la cantidad de numeros que hay en la matriz
            contador = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] >= 1) {
                        contador++;
                    }
                }
            }
            //Y aqui tenemos un do while que engloba todo lo anterior y repetira este algoritlo siempre que la cantidad de numeros en la matriz sea menor a 15
            //ya que esta es la cantidad minima de numeros que necesitamos.
        } while (contador < 15);

        //Por ultimo se ejecuta este metodo que hace que la matriz tenga 5 numeros por fila y 4 en blanco.
        //Este metodo se explicara mas abajo.
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
        //Estas son las 3 variables que crearemos en este metodo para controlar cuantos numeros tenemos en cada fila.
        int fila1 = 0;
        int fila2 = 0;
        int fila3 = 0;
        //Tambien hemos creado una bariable random
        Random alea = new Random();
        int num;

        //---------------------
        //Este doble for cuenta la cantidad de numeros que tenemos en cada fila.
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
        //Este bucle de lo que se encarga es que en la primera colunda haya 5 numeros y 4 en blanco
        do {
            for (int i = 0; i < aux[0].length; i++) {
                if (fila1 > 5) {//Este if se ejecura si la fila 1 tiene mas de 5 numeros
                    if (aux[1][i] == 0) {//y dentro de este if ahy dos mas.
                        //Lo que hace este primer if es si en la misma columna
                        //el segundo numero es cero entonces los intercambia
                        aux[1][i] = aux[0][i];
                        aux[0][i] = 0;
                        fila1--;
                        fila2++;
                    } else if (aux[2][i] == 0) {// o si el tercer numero de la columna es 0 lo intercambia
                        //como en la columna nunca va a ver las de dos numeros una de estas condiciones se ejecutara siempre.
                        aux[2][i] = aux[0][i];
                        aux[0][i] = 0;
                        fila1--;
                        fila3++;
                    }
                } else if (fila1 < 5) { //en caso de que la fila1 tenga menos de 5 numeros se ejecutara el codigo de abajo.
                    if (aux[0][i] == 0) {//Este vucle funciona de manera similar al que esta justo arriba
                        //La unica direfencia es que en vez de intercambiar un numero por un 0 hace lo contrario, intercambia un 0 por un numero
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
        } while (fila1 != 5);//repite lo anterior hasta que fila1 tenga 5 numeros
        
        //este pequeño for ordena los numeros de menor a mallor por columnas.
        for (int i = 0; i < 9; i++) {
            if (aux[2][i] != 0 && aux[1][i] > aux[2][i]) {
                num = aux[2][i];
                aux[2][i] = aux[1][i];
                aux[1][i] = num;
            }
        }
        fila1 = 0;
        fila2 = 0;
        fila3 = 0;//Vuelvo a contar los numeros que hay en cada fila.
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
        //Este if , else if controla que fila tiene menos de 5 numeros.
        //Dara la condicion de que nuestra matriz tiene que tener 15 numeros minimo 
        //Solo se ejecutara uno de estos por ello es un if, else if.
        //De otra manera se podria haver puesto como un doble if
        if (fila2 < 5) {//es funcionamiento es vastante similar al algorinto de arriba
            //Lo que hace es comprobar que fila tiene menos de 5 numeros y intercambia los numeros con la fila que tenga mas
            //En este if seria intercambiados los 0 de la fila 2 por por los numeros de la fila 3 hasta que en la fila 2 hubiera 5 numeros.
            for (int i = 0; i < 9; i++) {
                if (aux[1][i] == 0 && aux[2][i] >= 1 && fila2 < 5) {
                    int num2 = aux[2][i];
                    aux[1][i] = num2;
                    aux[2][i] = 0;
                    fila2++;
                    fila3--;
                }
            }
        } else if (fila3 < 5) {//Y este intercambiaria los 0 de la fila 3 por los
            //numeros de la fila 2 hasta que tubiera 5 numeros en la fila 3.
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

        //Los siquientes dos if tienen el mismo funcionamiento pero en distintas filas.
        if (fila2 > 5) {//este primer if hacecta a la fila 2 y convierte los numeros restantes en 0
            //para que de esta manera haya 5 numeros en la fila 2.
            //para esto lo primero es saber los numeros que tenemos de sobra 
            //para ello restamos los numeros de la fila - 5 y nos da la cantida de numeros que tenemos que quitar de la fila 
            int num3 = fila2 - 5;
            for (int i = 0; i < num3; i++) {//este for se ejecutara segun que cantidad de numeros tenemos que quitar.
                int num2;
                do {
                    num2 = alea.nextInt(9);// este aleatorio genera una posicion alearia para quitar de la fila
                } while (aux[1][num2] == 0);// este do while lo que hara es que controlar que la posicion no sea un 0
                aux[1][num2] = 0;// y a continuacion se establece la posicion elegida a 0.
                fila2--;
                System.out.println("hola1");
            }

        }
        //Este if hace exactamente lo mismo que el de arriba.
        if (fila3 > 5) {
            int num3 = fila3 - 5;
            for (int i = 0; i < num3; i++) {
                int num2;
                do {
                    num2 = alea.nextInt(9);
                } while (aux[2][num2] == 0);
                aux[2][num2] = 0;
                fila3--;
                System.out.println("hola1");
            }
        }
    }
    
    public void tacharCasilla(ArrayList lista, int num){
        // un metodo sencillo que añade a una array list el numero que le pasamos si se encuentra en la matriz.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(num == matriz[i][j]){
                    lista.add(num);
                }
            }
        }
    }

    public static void main(String[] args) {
        Carton ale = new Carton();
        ale.generarCarton();
        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------");
        
        for (int i = 0; i < ale.getMatriz().length; i++) {
            for (int j = 0; j < ale.getMatriz()[i].length; j++) {
                System.out.print(ale.getMatriz()[i][j] + "\t|\t");
            }
            System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}
