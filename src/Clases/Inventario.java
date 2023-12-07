/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author User
 */
public class Inventario {
    private Arma a1;
    private Arma a2;
    private Arma a3;
    public Inventario(){
        
    }
    public Inventario(Arma a1,Arma a2,Arma a3){
        this.a1=a1;
        this.a2=a2;
        this.a3=a3;
        
    }
    public Arma geta1(){
        return this.a1;
    }
    public Arma geta2(){
        return this.a2;
    }
    public Arma geta3(){
        return this.a3;
    }
   public void seta1(Arma a1){
      this.a1=a1;
   }
   public void seta2(Arma a2){
       this.a2=a2;
   }
   public void seta3(Arma a3){
       this.a3=a3;
   }

    
}
