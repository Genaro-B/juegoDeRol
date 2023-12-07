/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Personaje {
    Scanner leer=new Scanner(System.in);
    private String nombre;
    private int nivel;
    private int vida;
    private int ataque;
   private int defensa;
   private int ataqueBase;
   private Inventario inventario;
   public Personaje(){
       
   }
   public Personaje(String nombre,int nivel,int vida,int ataque,int defensa,Inventario inven){
       this.nombre=nombre;
       this.nivel=nivel;
       this.vida=vida;
       this.ataque=ataque;
       this.defensa=defensa;
       this.inventario=inven;
       
   }
   public void setInventario(Inventario Inventario){
       this.inventario=Inventario;
   }
   public String getnombre(){
       return this.nombre;
   }
   public int getVida(){
       return this.vida;
   }
   public void atacar(Personaje objetivo){
       int vidaAquitar = 0;
       
       
       if(this.ataque==-1){
           
           vidaAquitar=(int) (Math.random()*(8-3+1))+3;
           vidaAquitar-=objetivo.defensa;
       }else{
           if(this.ataque==-2){
               vidaAquitar=(int)( Math.random()*(12-6+1))+6;
               vidaAquitar-=objetivo.defensa;
               
           }else{
               if(this.ataque==-3){
                   vidaAquitar=(int) Math.random()*(18-8+1)+8;
                   vidaAquitar-=objetivo.defensa;
               }else{
                     vidaAquitar=this.ataque-objetivo.defensa;
                   
               }
           }
       }
       if(vidaAquitar<0){
           vidaAquitar=0;
       }
       
       objetivo.vida-=vidaAquitar;
       String nombreE=objetivo.nombre;
       int vidaActual=objetivo.vida;
       if(objetivo.vida<=0){
           System.out.println(objetivo.nombre+" fue derribado");
       }else{
           if(this.ataque==-1||this.ataque==-2||this.ataque==-3){
               switch(this.ataque){
                   case -1:
                       System.out.println(this.nombre+" a atacado e impactado sobre el enemigo con su "+this.inventario.geta1().getnombre());
                       break;
                   case -2:
                       System.out.println(this.nombre+" a atacado e impactado sobre el enemigo con su "+this.inventario.geta2().getnombre());
                       break;
                   case -3:
                       System.out.println(this.nombre+" a atacado e imapactado sobre el enemigo con su "+this.inventario.geta3().getnombre());
               }
           }else{
           System.out.println(this.nombre+" a atacado e impactado sobre el enemigo causando "+vidaAquitar+" VIDA Actual de "+nombreE+" es:"+vidaActual);
           }
       }
   }
    public void equiparArmanueva(Arma aEquipar){
        if(this.inventario.geta1()==null){
            
            this.inventario.seta1(aEquipar);
            System.out.println("Arma equipada con exito!");
        }else{
            if(this.inventario.geta2()==null){
                this.inventario.seta2(aEquipar);
                System.out.println("Arma equipada con exito!");
            }else{
                if(this.inventario.geta3()==null){
                    this.inventario.seta3(aEquipar);
                    System.out.println("Arma equipada con exito!");
                }else{
                    System.out.println("El inventario esta lleno!");
                }
            }
          
        }
    }
    public void equiparArmadePelea(){
        int opcion;
        int espacios=0;
        String nombre;
        System.out.print("Armas disponibles:");
        if(this.inventario.geta1()!=null){
            nombre=this.inventario.geta1().getnombre();
           
            System.out.println("1)"+nombre+"   ");
        }else{
            System.out.print("1)Arma no existente    ");
            espacios+=1;
        }
        if(this.inventario.geta2()!=null){
            nombre=this.inventario.geta2().getnombre();
            System.out.print("2)"+nombre+"   ");
        }else{
            System.out.print("2)Arma no existente    ");
            espacios+=1;
        }
        if(this.inventario.geta3()!=null){
            nombre=this.inventario.geta3().getnombre();
            System.out.println("3)"+nombre+"   ");
        }else{
            System.out.println("3)Arma no existente    ");
            espacios+=1;
        }
        System.out.println("");
        if(espacios<3){
        do{
              System.out.println("Cual arma desea usar para la batalla! 1,2,3,4");
        opcion=leer.nextInt();
        }while(opcion!=1&&opcion!=2&&opcion!=3&&opcion!=4);
       
        if(opcion==1){
            this.ataque=-1;
        }else{
            if(opcion==2){
                this.ataque=-2;
            }else{
               if(opcion==3){
                   this.ataque=-3;
               }else{
                   this.ataque=this.ataqueBase;
            }
            }
        }
        }else{
            System.out.println("No hay armas en el inventario a equipar");
        }
        
        
    }
    public void CrearPersonaje(){
        System.out.println("Ingrese el nombre del personaje");
        this.nombre=leer.nextLine();
        System.out.println("Ingrese su nivel de experiencia en el juego");
        this.nivel=leer.nextInt();
        System.out.println("Ingrese la cantidad de vida con la que va a contar el personaje ");
        this.vida=leer.nextInt();
        System.out.println("Indique el poder de ataque o el daño que puede generar el personaje sobre un objetivo");
        this.ataque=leer.nextInt();
        this.ataqueBase=this.ataque;
        System.out.println("Indique el poder de defensa o disponibilidad de durabilidad para resistir ataques");
        this.defensa=leer.nextInt();
        
    }
    public void mostrarCarateristica(){
        System.out.println("Caracteriscas:");
        System.out.println("Nombre:"+this.nombre);
        System.out.println("Nivel:"+this.nivel);
        System.out.println("vida:"+this.vida);
        System.out.println("Ataque:"+this.ataque);
        System.out.println("Defensa:"+this.defensa);
        
    }
}
