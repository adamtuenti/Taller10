/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corregido;

import java.util.List;




public class Example {
    
    public List<Cliente> clientes;
    public List<Employee> empleados;
    
    public void MostrarInformacion(Cliente cliente){
        if(validarInformacion(cliente.getNombre(), cliente.getApellido(), cliente.getCedula())){
            System.out.println("Nombre: " + cliente.getNombre()+ ", Apellido: " + cliente.getApellido() + ", con numero de cedula: " + cliente.getCedula() );
       
        }else{
            System.out.println("Datos incorrectos");
        };        
    }
    
    public void GuardarCliente(String Nombre, String Apellido, String Cedula){
        if(validarInformacion(Nombre, Apellido,Cedula )){
            Cliente cliente = new Cliente(Nombre, Apellido, Cedula);
            this.clientes.add(cliente);
            System.out.println(Nombre +" " + Apellido + "ha sido agregado como nuevo cliente");                   
        }else{
            System.out.println("Datos incorrectos");
        };        
    }
    
    public boolean validarInformacion(String Nombre, String Apellido, String Cedula ){
        boolean validarNombre= Nombre.equals("")|| Nombre.length()> 16;
        boolean validarApellido= Apellido.equals("") || Apellido.length()> 16;
        boolean validarCedula= Cedula.equals("") || Cedula.length()!= 10;
         
        if(validarNombre){
            printIncorreto("nombre");
            return false;
        }else{
            printCorrecto("nombre");            
        }
        if(validarApellido){
            printIncorreto("apellido");
            return false;
        }else{
            printCorrecto("apellido");            
        }
        if(validarCedula){
             printIncorreto("cedula");
             return false;
        }else{
            printCorrecto("cedula");            
        }
        return true;
    }
    
    public void printCorrecto(String a){
        System.out.println("ingreso de "+a+" correcto");
    }
    
    public void printIncorreto(String a){
        System.out.println("ingreso de "+a+" incorrecto");
    }   
    
}
