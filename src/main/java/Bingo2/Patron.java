/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bingo2;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maksim
 */
public enum Patron {
    // Lista de puntos son las casillas que hay que rellenar con números
    CARTON_LLENO(cartonLleno(), "Cartón lleno"),
    CARTON_4PUNTOS(carton4Puntos(), "Cartón cuatro puntos"),
    CARTON_FORMAL(cartonFormaL(), "Cartón forma de L"),
    CARTON_FORMACRUP(cartonCruzP(), "Cartón con forma de cruz pequeña"),
    CARTON_BARRASDIAGONAL(cartonBarraDiagonal(), "Cartón con barras dobles");

    private ArrayList<Point> casillas;
    private String descripcion;

    private Patron(ArrayList<Point> casillas, String descripcion) {
        this.casillas = casillas;
        this.descripcion = descripcion;
    }

    public ArrayList<Point> getCasillas() {
        return casillas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Patron{" + "casillas=" + casillas + ", descripcion=" + descripcion + '}';
    }

    // Cartón lleno quiere decir que todas las posiciones
    // son asignadas para poder meter elementos
    private static ArrayList<Point> cartonLleno() {
        ArrayList<Point> aux = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                aux.add(new Point(i, j));
            }

        }

        return aux;

    }

    private static ArrayList<Point> carton4Puntos() {
        ArrayList<Point> aux = new ArrayList<>();

        aux.add(new Point(0, 0));
        aux.add(new Point(0, 4));
        aux.add(new Point(4, 0));
        aux.add(new Point(4, 4));
        return aux;
    }

    private static ArrayList<Point> cartonFormaL() {
        ArrayList<Point> aux = new ArrayList<>();

        for (int j = 0; j < 5; j++) {
            aux.add(new Point(j, 0));
        }

        for (int j = 0; j < 5; j++) {
            aux.add(new Point(5, j));
        }

        return aux;
    }

    private static ArrayList<Point> cartonCruzP() {
        ArrayList<Point> aux = new ArrayList<>();

        aux.add(new Point(1, 2));
        aux.add(new Point(2, 1));
        aux.add(new Point(2, 3));
        aux.add(new Point(3, 2));

        return aux;
    }

    // Carton con barras dobles
    private static ArrayList<Point> cartonBarraDiagonal() {
        ArrayList<Point> aux = new ArrayList<>();

        aux.add(new Point(0, 0));
        aux.add(new Point(1, 1));
        aux.add(new Point(2, 2));
        aux.add(new Point(3, 3));
        aux.add(new Point(4, 4));
        return aux;
    }

}
