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
public class Manager extends Employee{
    
    public Manager(float salary, float bonusPercentage) {
        super(salary, bonusPercentage);
    }
    
    
    
    //calcula el bonus anual
    public float CalculateYearBonus() 
    {
        
        return salary + salary * 1.0F;
        
    }

    
    
    @Override
    float calcularsalario() {
        int month = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getMonthValue();
        float valueM = salary + (bonusPercentage * 0.7F);
        
        return month%2==0?valueM:valueM + rmu/12*2;
    }
    
}
