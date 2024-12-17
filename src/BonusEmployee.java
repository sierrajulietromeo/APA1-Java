package src;

public class BonusEmployee extends Employee
{
    
    
    
    public BonusEmployee(String name, String address, int basicSalary) {
      
       super(name,address,basicSalary);
        
    }
   

    
    public void getMonthlySalary()
    {        
        System.out.println(getName());
        System.out.println((basicSalary/12)+2000);
        
        
    }
}