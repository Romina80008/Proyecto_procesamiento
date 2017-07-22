/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_procesamiento;


import javax.swing.ImageIcon;
import java.awt.Graphics;

/**
 *
 * @author romin
 */
public class Proyecto_procesamiento {
    
    ImageIcon dibujo = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/1.jpg")).getImage());
    
    
    public void cargarImagen(Graphics g){     
        g.drawImage(dibujo.getImage(), 50,50,400,200, null);
    }
    
    public void correlacion(){
    
    
    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    
    }
    
}
