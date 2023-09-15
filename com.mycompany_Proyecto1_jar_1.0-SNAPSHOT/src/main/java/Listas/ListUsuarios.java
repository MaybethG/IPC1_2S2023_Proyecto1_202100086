/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;
import java.util.ArrayList;

/**
 *
 * @author Fati
 */
public class ListUsuarios {
    private ArrayList<Usuarios>listUsuarios;
    
    public ListUsuarios(){
        listUsuarios = new ArrayList <>();
    }
    
    public int agregarUsuario(String codigo, String nombre, String apellido, String correo, String contraseña){
        
        if(!existeUsuario(codigo)){
            listUsuarios.add(new Usuarios(codigo,nombre,apellido,correo,contraseña));
                    return 1;
        }
        else return 2;
    }
                    
      public boolean loginOk(String codigo){
        if(!existeUsuario(codigo)) return true;

        mensaje("No existe un usuario con el codigo " + codigo);
        return false;          
        }
        public boolean existeUsuario(String codigo){
            int tam = listUsuarios.size();
            
        for (int i=0; i< tam; i++){
            if(listUsuarios.get(i).getCodigo()==codigo) return true;
        }
        return false;
        
        }
        
        public void mostrarUsuarios(){
            int tam= listUsuarios.size();
            for (int i=0;i<tam; i++){
                listUsuarios.get(i).mostrarDatos();
            }
        }
        private void mensaje(String msj){
            System.out.println(msj);
        }
        
    }
    

