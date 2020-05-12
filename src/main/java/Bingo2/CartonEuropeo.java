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
public final class CartonEuropeo extends Carton{
    
    private static final int FILAS = 3;
    private static final int COLUMNAS = 9;

    public CartonEuropeo() {
        super(FILAS, COLUMNAS);
    }

    @Override
    public void generarCarton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "CartonEuropeo{" + '}';
    }
    
    
}
