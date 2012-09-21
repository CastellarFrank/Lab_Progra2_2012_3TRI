/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DibujadoHerencia;

/**
 *
 * @author FRANK
 */
public class Figura {
    public int posx,posy,fwidth,fhegith;
    public char type;
    public Figura(int x,int y,int w,int h,char t){
        this.posx=x;
        this.posy=y;
        this.fhegith=h;
        this.fwidth=w;        
        this.type=t;
    }
    
}
