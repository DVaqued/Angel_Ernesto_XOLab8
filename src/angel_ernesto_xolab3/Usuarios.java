/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package angel_ernesto_xolab3;

/**
 *
 * @author angel
 */
public class Usuarios {

    public static Usuarios[] usuarios = new Usuarios[50];
    String user, contraseña;
    int puntos;

    public Usuarios(String user, String password) {
        this.user = user;
        this.contraseña = password;
        puntos=0;
    }
    
    public Usuarios(){};
    
    public static Usuarios[] getUsuarios(){
        return usuarios;
    }

    public String getUser() {
        return user;
    }

    public int getPuntos() {
        return puntos;
    }
    
    public void asignarpuntos(String user){
        Usuarios u=buscar(user);
        u.puntos+=3;
    }

    private Usuarios buscar(String userName) {
        for (Usuarios user : usuarios) {
            if (user != null && user.user.equals(userName)) {
                return user;
            }
        }
        return null;
    }

    public boolean creacionCuenta(String usuario, String contraseña) {
        if (buscar(usuario) == null) {
            for (int contadorUsers = 0; contadorUsers < usuarios.length; contadorUsers++) {
                if (usuarios[contadorUsers] == null) {
                    usuarios[contadorUsers] = new Usuarios(usuario, contraseña);
                    return true;
                }
            }
        }
        return false;
    }
    
        public boolean verificacionCuenta(String usuario, String contraseña) {
        Usuarios u = buscar(usuario);
        if (u != null && u.contraseña.equals(contraseña)) {
            return true;
        }
        return false;
    }
    public boolean validarUsuario(String u){
        for (int i = 0; i < usuarios.length; i++) {
            if(usuarios[i]==buscar(u)){
                return true;
            }
        }
        return false;
    }


}
