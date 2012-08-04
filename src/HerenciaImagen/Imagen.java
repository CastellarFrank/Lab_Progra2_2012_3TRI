/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaImagen;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author NIGHTMARE
 */
public abstract class Imagen {
    public int ancho,alto;
    public String path,nombre;
    
    
    public Imagen(String p,String n){
        ancho=0;
        alto=0;
        this.path=p;
        this.nombre=n;
    }
    
    public ImageIcon cargarImagen(){
        ImageIcon val=new ImageIcon(this.path);
        ImageIcon imagen=new ImageIcon(val.getImage().getScaledInstance(this.ancho, this.alto, Image.SCALE_DEFAULT));
        return imagen;
    }
    
    public abstract String getTamanio();
    
    
    
    
    
}
