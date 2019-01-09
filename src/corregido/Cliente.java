/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corregido;


public class Cliente {
    //----------se hizo privados los atributos publicos
    private String Nombre;
    private String Apellido;
    private String Cedula;
    //------------
    
    
    
    private String provincia;
    private String pais;
    private String ciudad;
    private String direccion;
    
    //-------mal olor dead code se corrigio------
    //private String telefono;
    
    
    public Cliente(String Nombre, String Apellido, String Cedula) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String mostrarLocation(){
        //-----------corregir inline temp-----------------
        return  pais + " - " + provincia + " - " + ciudad + "\n" + direccion;
    }
    
    
    //----------resolvimos malos olores en este metodo----------
    public void setLocation(Location location){
        pais = location.nuevoPais;
        ciudad = location.ciudadnueva;
        provincia = location.provinciaNueva;
        direccion = location.direccionNueva;
    }

    
}
