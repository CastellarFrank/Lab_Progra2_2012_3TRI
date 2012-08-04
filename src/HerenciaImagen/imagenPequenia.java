/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaImagen;

/**
 *
 * @author NIGHTMARE
 */
public class imagenPequenia extends Imagen{
    
    public imagenPequenia(String p,String n){
        super(p,n);
        this.ancho=200;
        this.alto=200;
    }

    @Override
    public String getTamanio() {
        return "Imagen Pequenia";
    }
    
}
