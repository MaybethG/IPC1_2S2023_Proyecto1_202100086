/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author Fati
 */
public class Usuarios {
    private String codigo;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    
  public Usuarios(String codigo,String nombre, String apellido, String correo, String contraseña){
      this.codigo=codigo;
      this.nombre=nombre;
      this.apellido=apellido;
  }
  public String getCodigo(){
      return codigo;
  }
    public void setCodigo(String codigo){
      this.codigo= codigo;
  }
      public String getNombre(){
      return nombre;
  }
      public void setNombre(String nombre){
      this.nombre= nombre;
  }
      public String getApellido(){
      return apellido;
  }
      public void setApellido(String apellido){
      this.apellido= apellido;
  }

      public String getCorreo(){
      return correo;
  }
      public void setCorreo(String correo){
      this.correo= correo;
  }
      public String getContraseña(){
      return contraseña;
  }
      public void setContraseña(String contraseña){
      this.contraseña= contraseña;
  }
      
    void mostrarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
