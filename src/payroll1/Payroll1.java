package payroll1;

import java.util.Scanner;

public class Payroll1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		int employeeno;
		int daysworked;
		int payrate;
		String employeename;
		String designate;
		String gendate;
		System.out.print("Enter employee name: ");
		employeename=inp.nextLine();
		System.out.print("Enter designation: ");
		designate=inp.nextLine();
		System.out.print("Enter generation date: ");
		gendate=inp.nextLine();
		System.out.print("Enter employee number: ");
		employeeno=inp.nextInt();
		System.out.print("Enter days worked: ");
		daysworked=inp.nextInt();
		System.out.print("Enter pay rate: ");
		payrate=inp.nextInt();
		System.out.print("\n");
		int basicpay=(payrate*daysworked);
		int pf=(basicpay/10);
		final int profitax=(int)(0.02*basicpay);
		int deduct = (pf+profitax);
		int net_pay= (basicpay-deduct);
		//output
		System.out.println("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP : "+employeeno);
		System.out.print("\n");
		System.out.println("                           SHREE KRISHNA CHEMISTS AND DRUGGIST");
		System.out.println("                                   SALARY MONTH 9 2013");
		System.out.print("\n");
		System.out.println("EMP.NO.: "+employeeno+"                        EMP.NAME: "+employeename+"               DESIGNATION: "+designate);
		System.out.println("DAYS WORKED: "+daysworked+"                   PAY RATE: "+payrate+"                  GEN.DATE:"+gendate);
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("EARNINGS                 AMOUNT(RS.)                  DEDUCTIONS              AMOUNT(RS.)");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("BASIC PAY                "+basicpay+"                        P.F.                    "+pf);
		System.out.println("                                                      PROF.TAX                "+profitax);
		System.out.print("\n");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("GROSS EARN.              "+basicpay+"                        TOTAL DEDUCT.           "+(pf+profitax));
		System.out.println("                                                      NET PAY                 "+net_pay);
		System.out.println("-----------------------------------------------------------------------------------------------");


	}

}
