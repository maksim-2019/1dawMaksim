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
public class Bombo {

    private ArrayList<Integer> bombo;

    public Bombo() {
        this.bombo = new ArrayList<Integer>();//El bombo sera una array list de la que iremos sacando los numeros.
        for (int i = 1; i < 91; i++) {
            this.bombo.add(i);
        }
    }

    public void llenarBombo() { // Este metodo elimina los elementos restantes de la arrayList y los rellena de nuevo.
        this.bombo.clear();
        for (int i = 1; i < 91; i++) {
            this.bombo.add(i);
        }
    }

    public Integer sacarBola() {
        //Este metodo nos permite sacar bolas del bombo asta que se quede vacio
        if (this.bombo.size() > 0) {  //Con este if controlamos si la arrayList no esta vacia se ejecuta el metodo.
            Random alea = new Random();
            int aux = this.bombo.size();
            int aux2 = alea.nextInt(aux);
            return this.bombo.remove(aux2);
        } else { // Si esta vacia devuelve un 0 lo que me indica que el bombo esta vacio.
            return 0;
        }

    }
    
    public String comprobarBombo(){ //Este metodo nos devuelve el numero de volas que queda en el bombo.
        //Y si no hay bolas nos dice que no quedan bolas.
        if(this.bombo.size() > 0){
            return "No quedan volas en el bombo";
        }else {
            return "Quedan "+this.bombo.size()+" bolas en el bombo";
        }
        
    }

    public ArrayList<Integer> getBombo() {
        return bombo;
    }

    public void setBombo(ArrayList<Integer> bombo) {
        this.bombo = bombo;
    }

    @Override
    public String toString() {
        return "Bombo{" + "bombo=" + bombo + '}';
    }
 //PRUEBAS
//    public static void main(String[] args) {
//        Bombo bom = new Bombo();
//        do {
//            System.out.println(bom.sacarBola());
//            System.out.println(bom.toString());
//            System.out.println("--------------------------------------");
//        } while (bom.getBombo().size() != 0);
//
//    }
}
