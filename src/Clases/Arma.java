/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author User
 */
public class Arma {
    private String nombre;
    private int dañoMa;
    private int dañomi;
    public Arma(){
        
    }
    public Arma(String nombre,int dañoMax,int dañoMin){
        this.nombre=nombre;
        this.dañoMa=dañoMax;
        this.dañomi=dañoMin;
    }
   public String getnombre(){
       return this.nombre;
   }
   public int getdañoMa(){
       return this.dañoMa;
   }
   public int getdañomi(){
       return this.dañomi;
   }
   public void setnombre(String nombre){
       this.nombre=nombre;
   }
   public void setdañoMa(int dañoMax){
       this.dañoMa=dañoMax;
   }
   public void setdañomi(int dañoMin){
       this.dañomi=dañoMin;
   }
}
