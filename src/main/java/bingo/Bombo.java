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
public class Bombo {

    private ArrayList<Integer> bombo;

    public Bombo() {
        this.bombo = new ArrayList<Integer>();//El bombo sera una array list de la que iremos sacando los numeros.
        for (int i = 1; i < 91; i++) {
            this.bombo.add(i);
        }
    }

    private void LlenarBombo() { // Este metodo elimina los elementos serstantes de la arrayList y los rellena de nuevo.
        this.bombo.clear();
        for (int i = 1; i < 91; i++) {
            this.bombo.add(i);
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

}
