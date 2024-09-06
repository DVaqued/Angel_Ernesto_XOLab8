/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package angel_ernesto_xolab3;

/**
 *
 * @author angel
 */
public class Jugadores {
    public static String nombreJugador1=null;
    public static String nombreJugador2=null;

    public Jugadores() {
    }
    
    public static void AsignarJugador1(String jugador1) {
        nombreJugador1 = jugador1;
    }

    public static void AsignarJugador2(String jugador2) {
        nombreJugador2 = jugador2;
    }
    
    public static String devolverJugador1(){
        return nombreJugador1;
    }
    public static String devolverJugador2(){
        return nombreJugador2;
    }
    
   public static void resetJugador1(){
       nombreJugador1=null;
   }
    
}
