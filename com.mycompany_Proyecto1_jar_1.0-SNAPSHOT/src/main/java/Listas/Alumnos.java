/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author Fati
 */
public class Alumnos {
    private String codigoa;
    private String nombrea;
    private String apellidoa;
    private String correoa;
    private String contraseñaa;
    
  public Alumnos(String codigoa,String nombrea, String apellidoa, String correoa, String contraseñaa){
      this.codigoa=codigoa;
      this.nombrea=nombrea;
      this.apellidoa=apellidoa;
  }
  public String getCodigoa(){
      return codigoa;
  }
    public void setCodigoa(String codigoa){
      this.codigoa= codigoa;
  }
      public String getNombrea(){
      return nombrea;
  }
      public void setNombrea(String nombrea){
      this.nombrea= nombrea;
  }
      public String getApellidoa(){
      return apellidoa;
  }
      public void setApellidoa(String apellidoa){
      this.apellidoa= apellidoa;
  }

      public String getCorreoa(){
      return correoa;
  }
      public void setCorreoa(String correoa){
      this.correoa= correoa;
  }
      public String getContraseñaa(){
      return contraseñaa;
  }
      public void setContraseñaa(String contraseñaa){
      this.contraseñaa= contraseñaa;
  }
    
}
