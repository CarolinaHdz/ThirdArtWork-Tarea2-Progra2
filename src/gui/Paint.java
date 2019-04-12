/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domain.Circulo;
import domain.Cuadrado;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Caro
 */
public class Paint extends JPanel{
    
    Graphics2D graphics2D;
    BufferedImage bufferImage1;
    BufferedImage bufferImage2;
    BufferedImage bufferImage3;

    public Paint() throws IOException {
        this.setPreferredSize(new Dimension(700,500));
         bufferImage1 = ImageIO.read(getClass().getResourceAsStream("/assets/fondo2.jpg"));
         bufferImage2=ImageIO.read(getClass().getResourceAsStream("/assets/casa.png"));
         bufferImage3=ImageIO.read(getClass().getResourceAsStream("/assets/personas_1.jpg"));
    }
   
    private void draw(Graphics g){
        Circulo circulo= new Circulo(600,50,70);
        Cuadrado cuadradoCasa= new Cuadrado(370,370,20);
       
        circulo.Draw(g);
        cuadradoCasa.Draw(g);
       
        
    }
    
    
       private void init(Graphics2D graphics2D){       
        //diferente con respecto a graphics
        AffineTransform toCenterAt = new AffineTransform();
        graphics2D.setTransform(toCenterAt);
        
        //para rotar
        AffineTransform rotation = graphics2D.getTransform();
        
        //manejo de imagenes
        rotation.rotate(Math.toRadians(-40));
        graphics2D.drawImage(bufferImage1, 0, 0, null);
        graphics2D.drawImage(bufferImage2,0,300, null);
        graphics2D.drawImage(bufferImage3,340,360, null);      
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        graphics2D = (Graphics2D)g;
        this.init(graphics2D);
        draw(g); // se llama al metodo draw
    } // paintComponent
    
    public static void main(String[] args) throws IOException {
        JFrame window = new JFrame("ARTWORK: THE LANDSCAPE");
        window.setContentPane(new Paint());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        window.pack();
        window.setResizable(false);
        window.setLocation(300,50);
        window.setVisible(true);    
    
    }//main
    
}
