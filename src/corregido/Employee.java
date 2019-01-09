/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corregido;

import java.time.ZoneId;
import java.util.Date;



abstract class Employee
{   
    
  
    
    protected final float rmu = (float) 386.0;
    //salario del employee
    protected float salary;
    //porcentaje de bonus
    protected float bonusPercentage;    
    //variable de tipo employeeType
   

    public Employee(float salary, float bonusPercentage)    
    {        
        this.salary = salary;        
        this.bonusPercentage = bonusPercentage;        
          
    }    
    
    
    
    //--------------mal olor-------
    //calcula el salario dependiendo del tipo de trabajador y entrega el décimo correspondiente cada 2 meses
    abstract float calcularsalario();
    
    //calcula el bonus anual
    abstract float CalculateYearBonus();
   
}


