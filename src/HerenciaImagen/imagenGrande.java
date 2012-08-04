/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaImagen;

/**
 *
 * @author NIGHTMARE
 */
public class imagenGrande extends Imagen{
    
    public imagenGrande(String p,String n){
        super(p,n);
        this.ancho=600;
        this.alto=600;
    }

    @Override
    public String getTamanio() {
        return "Imagen Grande";
    }
    
}
