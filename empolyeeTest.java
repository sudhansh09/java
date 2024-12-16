package practical;
import java.util.*;
class Employee{
	String empName;
	int empId;
	String Address;
	String MailId;
	String MobileNo;
	double basicPay;
	public Employee(String empName,int empId,String Address,String MailId,String MobileNo,double basicPay) {
		this.empName=empName;
		this.empId=empId;
		this.Address=Address;
		this.MailId=MailId;
		this.MobileNo=MobileNo;
		this.basicPay=basicPay;
	}
	
	public double GrossSalary() {
		double DA=0.97*basicPay;
		double HRA=0.10*basicPay;
		return basicPay+DA+HRA;
	}
	
	public double NetSalary() {
		double PF=0.12*basicPay;
		double StaffClubFund=0.001*basicPay;
		return GrossSalary()-(PF+StaffClubFund);
	}
	
	void PaySlip() {
		System.out.println("Employee name: " +empName);
		System.out.println("Employee ID: " +empId);
		System.out.println("Address: "+Address);
		System.out.println("Mail ID : "+MailId);
		System.out.println("Mobile number: "+MobileNo);
		System.out.println("Basic Pay: "+basicPay);
		System.out.println("Gross Salary: "+GrossSalary());
		System.out.println("Net Salary: "+NetSalary());
	}
}
class Programmer extends Employee{
	public Programmer(String empName, int empId,String Address,String MailId,String MobileNo,double basicPay) {
		super(empName,empId,Address,MailId,MobileNo,basicPay);
	}
}
class TeamLead extends Employee{
	public TeamLead(String empName, int empId,String Address,String MailId,String MobileNo,double basicPay) {
		super(empName,empId,Address,MailId,MobileNo,basicPay);
	}
}
class AssistantProjectManager extends Employee{
	public AssistantProjectManager(String empName, int empId,String Address,String MailId,String MobileNo,double basicPay) {
		super(empName,empId,Address,MailId,MobileNo,basicPay);
	}
}
class ProjectManager extends Employee{
	public ProjectManager(String empName, int empId,String Address,String MailId,String MobileNo,double basicPay) {
		super(empName,empId,Address,MailId,MobileNo,basicPay);
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Programmer programmer=new Programmer("sudhansh",1001,"alandi devachi","sudhansh@gmail.com","9545216052",50000);
		TeamLead teamlead=new TeamLead("Nikhil",1002,"Hinjawadi","nikhil@gmail.com","9955624753",60000);
		AssistantProjectManager assistantPM=new AssistantProjectManager("yash",1003,"Hinjawadi","yash@gmail.com","5685426314",70000);
		ProjectManager PM=new ProjectManager("abu",1004,"Hinjawadi","abu@gmail.com","9654215630",80000);
		
		System.out.println("Programmer Pay Slip:");
		programmer.PaySlip();
		System.out.println();
		
		System.out.println("Team Lead Pay Slip:");
		teamlead.PaySlip();
		System.out.println();
		
		System.out.println("Assistant Project Manager Pay Slip: ");
		assistantPM.PaySlip();
		System.out.println();
		
		System.out.println("Project Manager Pay Slip:");
		PM.PaySlip();
	}

}
