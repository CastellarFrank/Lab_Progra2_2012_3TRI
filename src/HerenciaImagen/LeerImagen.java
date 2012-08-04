/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LeerImagen.java
 *
 * Created on 02-10-2012, 07:03:37 AM
 */
package HerenciaImagen;

import javax.swing.JFileChooser;

/**
 *
 * @author NIGHTMARE
 */
public class LeerImagen extends javax.swing.JFrame {
    Imagen image;
    loadImage ventana;
    public LeerImagen() {
        initComponents();
        inicarComponentes();
    }
    
    public void buscarImagen(){
        JFileChooser elegir=new JFileChooser();
        elegir.setDialogTitle("Seleccione  una imagen");
        elegir.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int valor=elegir.showOpenDialog(this);
        String val,nombre;        
        if(valor==0){
            val=elegir.getSelectedFile().getAbsolutePath();
            nombre=elegir.getSelectedFile().getName();
            this.crearImagen(val,nombre);
        }
    }
    public void crearImagen(String p,String n){
        int val=getTamanio();
        if(val==0)
            this.image=new imagenPequenia(p,n);
        else if(val==1)
            this.image=new imagenMediana(p,n);
        else
            this.image=new imagenGrande(p,n);
        
        this.enviarImagen(image,n);
    }
    public void enviarImagen(Imagen i,String n){
        int posX=((Integer)(this.spinX.getValue()));
        int posY=((Integer)(this.spinY.getValue()));
        this.ventana=new loadImage(posX,posY,i,n);
    }
    
    public int getTamanio(){
        if(this.radPequenia.isSelected())
            return 0;
        else if(this.radMediana.isSelected())
            return 1;
        else
            return 2;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        spinX = new javax.swing.JSpinner();
        spinY = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAbrir = new javax.swing.JButton();
        radPequenia = new javax.swing.JRadioButton();
        radMediana = new javax.swing.JRadioButton();
        radGrande = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Abrir Imágenes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 30, 210, 30);
        getContentPane().add(spinX);
        spinX.setBounds(160, 100, 60, 30);
        getContentPane().add(spinY);
        spinY.setBounds(160, 150, 60, 30);

        jLabel2.setText("Posición X:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 110, 70, 14);

        jLabel3.setText("Posición Y:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 160, 70, 14);

        btnAbrir.setText("Abrir Imagen");
        btnAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbrirMouseClicked(evt);
            }
        });
        getContentPane().add(btnAbrir);
        btnAbrir.setBounds(100, 340, 120, 50);

        radPequenia.setText("Pequeña");
        radPequenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radPequeniaMouseClicked(evt);
            }
        });
        getContentPane().add(radPequenia);
        radPequenia.setBounds(120, 220, 110, 23);

        radMediana.setText("Mediana");
        radMediana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radMedianaMouseClicked(evt);
            }
        });
        getContentPane().add(radMediana);
        radMediana.setBounds(120, 250, 100, 23);

        radGrande.setText("Grande");
        radGrande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radGrandeMouseClicked(evt);
            }
        });
        getContentPane().add(radGrande);
        radGrande.setBounds(120, 280, 100, 23);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-316)/2, (screenSize.height-469)/2, 316, 469);
    }// </editor-fold>//GEN-END:initComponents

private void radPequeniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radPequeniaMouseClicked
    this.radMediana.setSelected(false);
    this.radGrande.setSelected(false);
}//GEN-LAST:event_radPequeniaMouseClicked

private void radMedianaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radMedianaMouseClicked
    this.radPequenia.setSelected(false);
    this.radGrande.setSelected(false);
}//GEN-LAST:event_radMedianaMouseClicked

private void radGrandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radGrandeMouseClicked
    this.radMediana.setSelected(false);
    this.radPequenia.setSelected(false);
}//GEN-LAST:event_radGrandeMouseClicked

private void btnAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirMouseClicked
    this.buscarImagen();
}//GEN-LAST:event_btnAbrirMouseClicked

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LeerImagen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton radGrande;
    private javax.swing.JRadioButton radMediana;
    private javax.swing.JRadioButton radPequenia;
    private javax.swing.JSpinner spinX;
    private javax.swing.JSpinner spinY;
    // End of variables declaration//GEN-END:variables

    private void inicarComponentes() {
        this.radPequenia.setSelected(true);
        this.spinX.setValue(0);
        this.spinY.setValue(0);
    }
}
