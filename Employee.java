package JavaExercises;

import java.util.Scanner;

public class Employee {
	
	//company details
	
	String companyName = " Tech Mahindra Ltd " ;
	String address = " Hitech City Layout, Madhapur, Hyderabad - 500081 ";
	
	//employee details
	
	String payPeriod = "November 2024";
	int workedDays = 22;
	String EmployeeName;
	int EmployeeID;
	String DesignationName;
	String Department;
	
	//salary details
	double basic;
	double hra; // house rent allowance
	double da; // dearness allowance
	double ma;
	double deductions;
	double pf;
	double tax;
	double loan;
	
	
	public double calculateGrossSalary() {
		return basic + hra + da + ma ;
	}
	
	public double calculateDeductionSalary() {
		return pf + tax + loan;
	}
	
	public double netSalary() {
		return calculateGrossSalary() - calculateDeductionSalary() ; 
	}
	
	public void generateSlip() {
		
		//print company name and address
		System.out.println("=================================================================");
		System.out.println("                             Payslip                             ");
		System.out.println("-----------------------------------------------------------------");
        System.out.printf("%s%n", companyName);
        System.out.printf("%s%n%n", address);
        System.out.println();
		
        System.out.printf("%-20s : %-15s %-20s : %-15s%n", "Pay Period", payPeriod, "No.of Worked Days", workedDays);
        System.out.printf("%-20s : %-15s %-20s : %-15s%n", "Employee Name", EmployeeName, "Designation", DesignationName);
        System.out.printf("%-20s : %-15s %-20s : %-15s%n", "Employee ID", EmployeeID, "Department", Department);
      
       
        System.out.println("--------------------------------------------------------------------------");
        
        System.out.println("\nEarnings                    Amount           Deductions               Amount");
        System.out.printf("%-25s %10.2f    %-25s %10.2f%n", "Basic Salary", basic, "    Provident Fund (PF)", pf);
        System.out.printf("%-20s %10.2f    %-25s %10.2f%n", "HouseRent Allowance(HRA)", hra, "     Professional Tax", tax);
        System.out.printf("%-24s %10.2f    %-26s %10.2f%n", "Dearness Allowance(DA)", da, "     Loan", loan);
        System.out.printf("%-24s %10.2f%n", "Meal Allowance", ma);
        
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-25s %10.2f    %-25s %10.2f%n", "Total Earnings", calculateGrossSalary(), "    Total Deductions", calculateDeductionSalary());
        System.out.printf("%-25s %10.2f%n", "Net Pay", netSalary());
        
        System.out.println("Total Net Salary : " + (int) netSalary());
        
        
        System.out.println("=============================");
    }

	

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		//object creation
		Employee employee = new Employee();
		
		//collect details
		System.out.println("Enter employee name : ");
		employee.EmployeeName = scanner.nextLine();
		
		System.out.println("Enter Employee ID : ");
		employee.EmployeeID = scanner.nextInt();
		
		System.out.println("Enter Designation : ");
		employee.DesignationName = scanner.next();
		
		System.out.println("Enter Department : ");
		employee.Department = scanner.next();
		
		
		System.out.println("Enter Basic Salary : ");
		employee.basic = scanner.nextInt();
		
		System.out.println("Enter HouseRent Allowance (HRA) : ");
		employee.hra = scanner.nextInt();
		
		System.out.println("Enter Dearness Allowance (DA) : ");
		employee.da = scanner.nextInt();
		
		System.out.println("Enter Meal Allowance (MA) : ");
		employee.ma = scanner.nextInt();
		
		System.out.println("Enter Provident Fund (PF) : ");
		employee.pf = scanner.nextInt();
		
		System.out.println("Enter Professional Tax : ");
		employee.tax = scanner.nextInt();
		
		System.out.println("Enter Loan : ");
		employee.loan = scanner.nextInt();
	
		employee.generateSlip();
		scanner.close();
	}

}
