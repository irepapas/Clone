/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clonable;

/**
 *
 * @author Irene
 */
public class Rectangle implements Cloneable{
    
    private final int altezza;
    private final int largehzza;
    private Punto origine;

    public Rectangle(int altezza, int largehzza, Punto origine) {
        this.altezza = altezza;
        this.largehzza = largehzza;
        this.origine = origine;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getLargehzza() {
        return largehzza;
    }

    public Punto getOrigine() throws CloneNotSupportedException {
        return (Punto) origine.clone();
    }

    public void move(int x, int y) {
        origine.move(x, y);
    }
    
   


    @Override
    public String toString() {
        return "Rectangle{" + "altezza=" + altezza + ", largehzza=" + largehzza + ", origine=" + origine + '}';
    }
    
    

    /**
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Rectangle clone() throws CloneNotSupportedException  {
        try{
            Rectangle r = (Rectangle)super.clone();
            r.origine = origine.clone();
            return r;
            } catch(CloneNotSupportedException e){
                return null;
            }
    }
    
    
    
    
}
