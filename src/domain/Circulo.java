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
public class Circulo extends Figura {
    
    private int radio;

    public Circulo() {
        super();
        this.radio = 0;
        this.setNombre("Circulo");
    }

    public Circulo(int x, int y , int radio) {
        super(x,y);
        this.radio = radio;
        this.setNombre("Circulo");
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void Draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(this.getX(), this.getY(), this.getRadio(), this.getRadio());
        

    }

}//fin circulo

