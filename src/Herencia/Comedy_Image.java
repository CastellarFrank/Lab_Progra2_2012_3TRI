/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author NIGHTMARE
 */
public class Comedy_Image extends Image{
    public static final int BAD=0;
    public static final int GOOD=1;
    public static final int FUN=2;
    
    public Comedy_Image(String n,String d,String p){
        super(n,d,p,Image.COMEDY);
    }    
}
