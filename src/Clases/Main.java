/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        Personaje p1=new Personaje();
        Personaje p2=new Personaje();
        Inventario In1=new Inventario();
        Inventario In2=new Inventario();
        p1.setInventario(In1);
        p2.setInventario(In2);
        Arma a1=new Arma("Daga afilada",8,3);
        Arma a2=new Arma("Bastón encantado",12,6);
        Arma a3=new Arma("Espadón gigante",18,8);
        boolean log=true;
        int turno=0;
        int rondas=1;
        
        while(log){
            turno=1;
            System.out.println("Crear personajes -Comienza player:"+turno);
            if(turno==1){
                p1.CrearPersonaje();
                System.out.println("Continua player 2 ");
                p2.CrearPersonaje();
        }else{
                p2.CrearPersonaje();
                System.out.println("Continua player 1");
                p1.CrearPersonaje();
            }
            System.out.println("Comienza la partida!(Las rondas se llevaran a cabo segun el orden en que se crearon los personajes)");
            System.out.println(p1.getnombre()+" hp:"+p1.getVida()+" Vs "+p2.getnombre()+" hp:"+p2.getVida());
            //Bucle anidado(Proceso de rondas)
            while(log){
                System.out.println("Ronda:"+rondas+"    Turno:"+turno);
                 System.out.println("1)Atacar - 2)Equipar Arma - 3)Equipar Arma de Guerra - 4)Mostrar caracteriscas");
                if(turno==1){
                    turno=leer.nextInt();
                    switch(turno){
                        case 1:
                            p1.atacar(p2);
                            turno=2;
                            rondas+=1;
                            break;
                        case 2:
                            //Metodo que permita seleccionar un arma del menú;
                            turno=menuArmas();
                            if(turno==1){
                                p1.equiparArmanueva(a1);
                            }else{
                                if(turno==2){
                                    p1.equiparArmanueva(a2);
                                }else{
                                    p1.equiparArmanueva(a3);
                                }
                            }
                            turno=1;
                            break;
                            
                        case 3:
                            p1.equiparArmadePelea();
                            turno=1;
                            break;
                            
                        case 4:
                            p1.mostrarCarateristica();
                            turno=1;
                            break;
                        default:
                            System.out.println("Opcion Incorrecta!");
                            turno=1;
                            break;
                    }
                }else{
                     turno=leer.nextInt();
                    switch(turno){
                        case 1:
                            p2.atacar(p1);
                            turno=1;
                            rondas+=1;
                            break;
                        case 2:
                            //Metodo que permita seleccionar un arma del menú;
                            turno=menuArmas();
                            if(turno==1){
                                p2.equiparArmanueva(a1);
                            }else{
                                if(turno==2){
                                    p2.equiparArmanueva(a2);
                                }else{
                                    p2.equiparArmanueva(a3);
                                }
                            }
                            turno=2;
                            break;
                            
                        case 3:
                            p2.equiparArmadePelea();
                            turno=2;
                            break;
                        case 4:
                            p2.mostrarCarateristica();
                            turno=2;
                            break;
                        default:
                            System.out.println("Opcion Incorrecta!");
                            turno=2;
                            break;
                    }        
                }
                if(p1.getVida()<=0||p2.getVida()<=0){
                    log=false;
                }
            }
            System.out.println("Desea jugar otra partida? 1)si  2)no");
            turno=leer.nextInt();
            if(turno==1){
                log=true;
            }
        }
        
    }
    public static int menuArmas(){
        Scanner leer=new Scanner(System.in);
        int opcion;
        do{
         System.out.println("Selecciona 1 arma");
        System.out.println("Menu:\n");
        System.out.println("1)Daga afilada Daño:8-3");
        System.out.println("2)Baston encantado  Daño:12-6");
        System.out.println("3)Espadon Gigante Daño:18-8");
        opcion=leer.nextInt();
        }while(opcion!=1&&opcion!=2&&opcion!=3);
        
        
        return opcion;
        
        
    }
    
    
}
