/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author NIGHTMARE
 */
public class Reflexion_Image extends Image{
    public static final int BORING=0;
    public static final int CURIOUS=1;
    public static final int INTERESTING=2;
    public static final int AWESOME=3;
    
    public Reflexion_Image(String n,String d,String p){
        super(n,d,p,Image.REFLEXION);
    }
    
    
}
