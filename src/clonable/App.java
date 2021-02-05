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
public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Punto p = new Punto(2, 2);
        Punto p2 = (Punto) p.clone();
        
        System.out.println("----Punti clonati-----");
        System.out.println("p:" + p);
        System.out.println("p2:" + p2);
        
        Rectangle r1 = new Rectangle(10, 20, p);
        Rectangle r2= (Rectangle) r1.clone();
        
        System.out.println("----Rettangoli clonati-----");
        System.out.println("r1:" + r1);
        System.out.println("r2:" + r2);
        p2.move(7, 6);
        r1.setOrigine(p2);
        System.out.println("----Rettangoli clonati profonda-----");
        System.out.println("r1:" + r1);
        System.out.println("r2:" + r2);
        
    }
}
