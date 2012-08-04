/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaImagen;

/**
 *
 * @author NIGHTMARE
 */
public class imagenMediana extends Imagen{
    
    public imagenMediana(String p,String n){
        super(p,n);
        this.ancho=400;
        this.alto=400;
    }

    @Override
    public String getTamanio() {
        return "Imagen Mediana";
    }
    
}
