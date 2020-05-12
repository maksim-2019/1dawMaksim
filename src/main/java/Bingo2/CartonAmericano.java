/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bingo2;

/**
 *
 * @author Maksim
 */
public final class CartonAmericano extends Carton{

    private final Patron premio;
    private static final int FILAS = 5;
    private static final int COLUMNAS = 5;
    
    public CartonAmericano(Patron premio) {
        super(FILAS, COLUMNAS);
        this.premio = premio;
    }
    @Override
    public void generarCarton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Patron getPremio() {
        return premio;
    }

    @Override
    public String toString() {
        return "CartonAmericano{" + "premio=" + premio + '}';
    }
    
   
}
