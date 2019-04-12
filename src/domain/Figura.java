/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Caro
 */
public class Figura {
    private int x;
    private int y;
    private String nombre;
    private Graphics g;
    
   

    public Figura() {
        this.x = 0;
        this.y = 0;
        this.nombre =" ";
    }

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
        this.nombre ="";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int size() {
        return this.nombre.length() * 2 + 4;
    }

    public void Draw(Graphics g) {

    }
    
}
