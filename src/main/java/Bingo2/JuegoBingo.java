/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bingo2;

import bingoBD.BingoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Maksim
 */
public class JuegoBingo {

    public static void main(String[] args) throws SQLException {
        Scanner teclado = new Scanner(System.in);
        BingoDAO datos = new BingoDAO();
        int resp, codigo, bola;
        String nombre, guardar;
        BingoAmericano bingo;

        do {
            System.out.println("1. Nueva Partida");
            System.out.println("2. Cargar partida");
            resp = teclado.nextInt();
        } while (resp < 0 || resp > 2);

        if (resp == 2) {
            List<BingoAmericano> lista = new ArrayList<>();
            lista = datos.getAll();
            for (int i = 0; i < lista.size(); i++) {
                System.out.println("Codigo --> "+lista.get(i).getIdJugador());
                System.out.println(lista.get(i).getCarton());
                System.out.println("-----------------------------------------------");
            }
            System.out.println("Introduzca el codigo de la partida: ");
            codigo = teclado.nextInt();
            bingo = datos.findByPk(codigo);
        } else {
            System.out.println("Ponga un nombre de jugador: ");
            teclado.nextLine();
            nombre = teclado.nextLine();
            bingo = new BingoAmericano(nombre, new CartonAmericano(), new BomboAmericano());
        }

        do {
            System.out.println("Puelse enter para sacar una bola y S para guardar");
            guardar = teclado.nextLine();
            if (!bingo.getCarton().esBingo()) {
                if (guardar.equalsIgnoreCase("s")) {
                    datos.delete(bingo);
                    datos.insert(bingo);
                } else {
                    bola = bingo.getBombo().sacarBola();
                    System.out.println("Has sacado la bola: " + bola);
                    bingo.getCarton().tacharNumero(bola);
                    System.out.println(bingo.getCarton().toString());
                }
            } else {
                System.out.println("\n    __________________"
                        + "\n   |                  |"
                        + "\n   |    -----------   |"
                        + "\n   |       BINGO      |"
                        + "\n   |    FELICIDADES   |"
                        + "\n   |    -----------   |"
                        + "\n   |__________________|");
                guardar = "s";
            }

        } while (!guardar.equalsIgnoreCase("s"));

    }
}
