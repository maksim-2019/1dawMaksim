/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.util.ArrayList;

/**
 *
 * @author Maksim
 */
public class JuegoBingo {

    public static void main(String[] args) {
        Carton carton = new Carton();
        Bombo bombo = new Bombo();
        int bola;
        ArrayList<Integer> lista = new ArrayList<Integer>();
        boolean tachar;
        boolean bingo = false;
        
        //Creamos el carton
        carton.generarCarton();
        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < carton.getMatriz().length; i++) {
            for (int j = 0; j < carton.getMatriz()[i].length; j++) {
                System.out.print(carton.getMatriz()[i][j] + "\t|\t");
            }
            System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------");
        }
        
        do{
        System.out.println(" ");
        bola = bombo.sacarBola();
        //Sacamos bola y la mostramos.
        System.out.println("Has sacado la bola: " + bola);
        //Comprobamos si podemos tachar un numero
        tachar = carton.tacharCasilla(lista, bola);
        //Mostramos el numero tachado.
        if(tachar == true){
            System.out.println("Has tachado el numero.");
        }
        //Comprobamos si tenemos linea.
        carton.combrobarLinea(lista);
        //Comprobamos si tenemos bingo
        bingo = carton.comprobarBingo(lista);
        //Salta un mensaje si tenemos bingo
        if (bingo == true) {
            System.out.println("\n    __________________"
                             + "\n   |                  |"
                             + "\n   |    -----------   |"
                             + "\n   |       BINGO      |"
                             + "\n   |    FELICIDADES   |"
                             + "\n   |    -----------   |"
                             + "\n   |__________________|");
        }
        //Termina el bucle una vez que tengamos bingo.
        }while(bingo == false);
    }
}
