package com.cg.evm.pl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.cg.evm.dto.PurchaseDetails;

public class Main {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	while(true)
	{
	System.out.println("\n1.Insert purchase details: ");
	System.out.println("2.View details: ");
	System.out.println("3.Delete mobile details:");
	System.out.println("4.search mobiles: ");
	System.out.println("5.Exit");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
	     System.out.println("Enter purchase details : ");
	     System.out.println(" cname mailid phoneno purchasedate mobileid ");
	     String cname=sc.next();
	     String mailId=sc.next();
	     String phoneNo=sc.next();
	     String pDate=sc.next();
	     int mobileId=sc.nextInt();
	     DateTimeFormatter frmt=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	     LocalDate date=LocalDate.parse(pDate,frmt);
	     
	     PurchaseDetails pDetails=new PurchaseDetails();
	     pDetails.setCname(cname);
	     pDetails.setMailId(mailId);
	     pDetails.setMobileId(mobileId);
	     pDetails.setPhoneNo(phoneNo);
	     pDetails.setpDate(date);
     
	     
	}
}
}
}