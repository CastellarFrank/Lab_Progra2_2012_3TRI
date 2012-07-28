/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author NIGHTMARE
 */
public class Image {
    private String name;
    private String description;
    private String path;
    private int type;
    private int ranks[];
    private int cant;
    public static final int COMEDY=0;
    public static final int REFLEXION=1;
    public static final int OTHER=2;
    
    public Image(String n,String d, String p,int t){
        this.name=n;
        this.description=d;
        this.path=p;
        this.type=t;
        this.startRanks(type);        
    }
    private void startRanks(int t){
        if(t==COMEDY){
            cant=3;
            this.ranks=new int[cant];
        }else if(t==REFLEXION){
            cant=4;
            this.ranks=new int[cant];
        }else if(t==OTHER){
            cant=2;
            this.ranks=new int[cant];
        }
    }
    public String getNombre(){
        return this.name;
    }
    public void setNombre(String n){
        this.name=n;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String n){
        this.description=n;
        
    }
    public int getType(){
        return this.type;
    }
    public void setType(int t){
        this.type=t;
    }
    public String getPath(){
        return this.path;
    }
    public void setPath(String p){
        this.path=p;
    }
    public int getRank(int pos){
        return this.ranks[pos];
    }
    public void aumentarRank(int pos){
        if(pos<cant)
            this.ranks[pos]++;
    }
    public int getCant(){
        return cant;
    }
}
