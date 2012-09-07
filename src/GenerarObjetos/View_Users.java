/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * View_Users.java
 *
 * Created on 10-ago-2012, 7:37:36
 */
package GenerarObjetos;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class View_Users extends javax.swing.JFrame {
    Container contenedorPrincipal;
    Container contenedores[][];
    Object objetos[][];
    Users usuarios[];
    int cant;
    public View_Users(Users us[],int cant) {
        initComponents();
        this.usuarios=us;
        this.cant=cant;
        iniciar();
        crearObjetos();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-351)/2, (screenSize.height-542)/2, 351, 542);
    }// </editor-fold>//GEN-END:initComponents

    private void iniciar() {
        this.contenedorPrincipal=new Container();
        this.contenedores=new Container[this.cant][2];
        this.objetos=new Object[this.cant][4];
    }

    private void crearObjetos() {
        this.contenedorPrincipal.setBounds(0, 0, 450, 500);
        this.contenedorPrincipal.setLayout(new FlowLayout(FlowLayout.LEADING));
        for(int i=0;i<this.cant;i++){
            this.contenedores[i][0]=new Container();
            this.contenedores[i][0].setLayout(new BoxLayout(this.contenedores[i][0],BoxLayout.LINE_AXIS));
            this.contenedores[i][0].setSize(200, 100);
            this.contenedores[i][1]=new Container();
            this.contenedores[i][1].setLayout(new BoxLayout(this.contenedores[i][1],BoxLayout.Y_AXIS));
            this.contenedores[i][1].setSize(120,100);
            this.objetos[i][0] = new JLabel();
            colocarImagen(i);
            this.objetos[i][1]=new JLabel(this.usuarios[i].nombre);
            this.objetos[i][2]=new JLabel(this.usuarios[i].direccion);
            this.objetos[i][3]=new JLabel((this.usuarios[i].Sexo=='M'?"Masculino":"Femenino"));
            administrarContenedores(i);
        }
        
        this.setContentPane(this.contenedorPrincipal);
    }

    private void colocarImagen(int i) {
        ImageIcon image=new ImageIcon(this.usuarios[i].path);
        ImageIcon imagen=new ImageIcon(image.getImage().getScaledInstance(80,100,Image.SCALE_DEFAULT));
        ((JLabel)this.objetos[i][0]).setIcon(imagen);
        ((JLabel)this.objetos[i][0]).setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    private void administrarContenedores(int i) {
        this.contenedorPrincipal.add(this.contenedores[i][0]);
        this.contenedorPrincipal.add(Box.createRigidArea(new Dimension(0,20)));
        this.contenedores[i][0].add(((JLabel)this.objetos[i][0]));
        this.contenedores[i][0].add(Box.createRigidArea(new Dimension(20,0)));
        this.contenedores[i][0].add(this.contenedores[i][1]);
        this.contenedores[i][1].add(((JLabel)this.objetos[i][1]));
        this.contenedores[i][1].add(((JLabel)this.objetos[i][2]));
        this.contenedores[i][1].add(((JLabel)this.objetos[i][3]));
    }

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
