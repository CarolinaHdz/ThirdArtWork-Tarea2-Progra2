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
public class Cuadrado extends Figura {
     private int lado;
     private Color color;

    public Cuadrado() {
        super();
        this.lado = 0;
        this.setNombre("Cuadrado");
    }

    public Cuadrado(int x, int y,int lado) {
        super(x,y);
        this.lado = lado;
        this.setNombre("Cuadrado");
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public void Draw(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(this.getX(), this.getY(), this.lado,this. lado);
  
        }

}
