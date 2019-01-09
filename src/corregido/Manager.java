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
    
    public Manager(float salary, float bonusPercentage, EmployeeType employeeType) {
        super(salary, bonusPercentage, employeeType);
    }
    
    
    public float cs()
    {
        //-------------------metodos inline-----------------
        int month = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getMonthValue();
        
        switch (employeeType)         
        {
            case Worker:
                //Si el mes es impar entonces le entrega el decimo junto con su salario
                return month%2==0?salary:salary + rmu/12*2;
            case Supervisor:
                float valueS = salary + (bonusPercentage * 0.5F);
                //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
                return month%2==0?valueS:valueS + rmu/12*2;
            case Manager:
                float valueM = salary + (bonusPercentage * 0.7F);
                //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
                return month%2==0?valueM:valueM + rmu/12*2;
        }
        return 0.0F;
    }
    //calcula el bonus anual
    public float CalculateYearBonus() 
    {
        switch (employeeType)
        {
            case Worker:
                return 0;
            case Supervisor:
                return salary + salary * 0.7F;
            case Manager:
                return salary + salary * 1.0F;
        }
        return 0.0F;
    }
    
}
