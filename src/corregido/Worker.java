/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corregido;

import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author CltControl
 */
public class Worker extends Employee{
    
    public Worker(float salary, float bonusPercentage) {
        super(salary, bonusPercentage);
    }
    
    
    @Override
    public float calcularsalario()
    {
        
        //-------------------metodos inline-----------------
        int month = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getMonthValue();
        
        return month%2==0?salary:salary + rmu/12*2;
        
    }
    
    
    //calcula el bonus anual
    public float CalculateYearBonus() 
    {
        return 0;
    }

    
    
}
