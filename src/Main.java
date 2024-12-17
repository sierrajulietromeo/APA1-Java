package src;
public class Main
{ 
	public static void main(String [] args)
	{
		System.out.println("Hello World!");

		Employee Steve = new BonusEmployee("Steve","123 Acacia Av",40000);    
    	Employee Bob = new NormalEmployee("Bob","456 Acacia Av",50000);    
        
    	Steve.getMonthlySalary();
    	Bob.getMonthlySalary();

	}

}