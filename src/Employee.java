package src;

public abstract class Employee
{
    // instance variables - replace the example below with your own
    private String name;
    private String address;
    protected int basicSalary;
    
    public Employee(String name, String address, int basicSalary){
        
        this.name = name;
        this.address = address;
        this.basicSalary = basicSalary;
     
    }
    
    public String getName()
    {
        // put your code here
        return name;
    }
    
    public String getAddress()
    {
        // put your code here
        return address;
    }
    
    public int getBasicSalary()
    {
        // put your code here
        return basicSalary;
    }
    
    public void setAddress(String add)
    {
        // put your code here
        address = add;
    }
    
    public void setName(String nm)
    {
        // put your code here
        name = nm;
    }
    
    public void setBasicSalary(int sal)
    {
        // put your code here
        basicSalary = sal;
    }
    
    public abstract void getMonthlySalary();
    {
        
    }   
}
