public class NormalEmployee extends Employee
{
    
    
    
    public NormalEmployee(String name, String address, int basicSalary) {
        super(name,address,basicSalary);
        
    }
   

    
    public void getMonthlySalary()
    {        
        System.out.println(getName());
        System.out.println((basicSalary/12));
    }
}