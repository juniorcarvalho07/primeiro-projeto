
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Júnior Carvalho
 */
public class Desenho {
    
     Frame canvas= new Frame();
     public Desenho(){
     canvas.setSize(400,400);
     canvas.setLocation(100,100);
     canvas.setTitle("Estrela");
     canvas.setResizable(true);
     canvas.setVisible(true);
     
     canvas.add(new MyCanvas());
     
     canvas.addWindowListener(new WindowListener() {

         @Override
         public void windowOpened(WindowEvent e) {
         }

         @Override
         public void windowClosing(WindowEvent e) {
         System.exit(0);
         }

         @Override
         public void windowClosed(WindowEvent e) {
            
         }
         @Override
         public void windowIconified(WindowEvent e) {
          
         }

         @Override
         public void windowDeiconified(WindowEvent e) {
         
         }

         @Override
         public void windowActivated(WindowEvent e) {
         }

         @Override
         public void windowDeactivated(WindowEvent e) {
         
         }
     });
     
     } 
public static void main(String[] args){
        Desenho desenho = new Desenho();
}        
        class MyCanvas extends Canvas{
          public MyCanvas(){
          setBackground(Color.BLUE);
          setSize(300,300);
          }
        
          public void paint (Graphics g){
              Graphics2D g2;
              g2 =(Graphics2D) g;
              g2.drawLine(150, 0, 0, 300);
              g2.drawLine(0,100, 300, 100);
              g2.drawLine(0, 100, 300, 300);
              g2.drawLine(300,300,150,0);
              g2.drawLine(300, 100, 0, 300);
          
          }
        }
}
