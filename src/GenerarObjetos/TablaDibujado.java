/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GenerarObjetos;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author FRANK
 */
public class TablaDibujado extends JPanel{
    
    public  TablaDibujado(){
        this.setSize(760, 579);
    }
    
    @Override
    public void paint(Graphics g){
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("../HerenciaImagen/06pastranadivehnm3_5.jpg"));
        ImageIcon image=new ImageIcon(imagenFondo.getImage().getScaledInstance(500,450,Image.SCALE_DEFAULT));
        g.drawImage(image.getImage(),0,0,500,450, null);        
        g.drawImage(image.getImage(),200,200,500,450, null); 
        g.drawString("Esto solo es una prueba",300, 250);
        g.drawString("Prueba #2",340 , 300);
        super.paintChildren(g);
    }    
}
