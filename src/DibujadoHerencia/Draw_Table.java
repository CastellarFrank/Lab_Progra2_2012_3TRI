/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DibujadoHerencia;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author FRANK
 */
public class Draw_Table extends JPanel{
    ArrayList<Figura> arreglo=new ArrayList<Figura>();
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for(int i=0;i<this.arreglo.size();i++){
            float c1=((float)(Math.random()));
            float c2=((float)(Math.random()));
            float c3=((float)(Math.random()));
            float c4=((float)(Math.random()));
            g.setColor(new Color(c1, c2, c3, c4));
            if(arreglo.get(i).type=='c'){
                g.fillOval(arreglo.get(i).posx,arreglo.get(i).posy,
                        arreglo.get(i).fwidth,arreglo.get(i).fhegith);
            }else{
                g.fillRect(arreglo.get(i).posx,arreglo.get(i).posy,
                        arreglo.get(i).fwidth,arreglo.get(i).fhegith);
            }
        }
    }
    public void generarRandoms(int cant){
        for(int i=0;i<cant;i++){
            int tipoFigura=((int)((Math.random())*2));
            int posix=((int)((Math.random())*this.getWidth()));
            int posiy=((int)((Math.random())*this.getHeight()));
            int figWidth=((int)((Math.random())*100));
            int figHeight=((int)((Math.random())*100));
            Figura temp;
            if(tipoFigura==0){
                temp=new Circulo(posix,posiy,figWidth,figHeight);
            }else{
                temp=new Cuadrado(posix,posiy,figWidth,figHeight);
            }
            this.arreglo.add(temp);
        }
        
    }
}
