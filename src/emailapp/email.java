package emailapp;

import java.util.*;

public class email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String mailboxcapacity;
	private String alternateEmail;
	private String companyname ="omg.com";

	public email(String firstName, String lastName) {

		//set name 
		this.firstName = firstName;
		this.lastName = lastName;

		System.out.println(firstName + " " + lastName);

		
		//set department
		this.department = setDepartment();
		System.out.println("Deaprtment is :" +  department);

		//set ;pass
		int l=12;
		this.password = randomPassword(l);
		System.out.println("Password  is :" +  password);

		
		 String email= firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+companyname ;
		 System.out.println("Email  is :" +  email);
	}

	
	private String setDepartment() {

		System.out.println("Enter Department:1 .sales 2. bfsi");
		System.out.println("Enter Department CODE : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n == 1) {
			return "sales";

		}
		else if (n == 2) {
			return "BFSI";

		}else
		{
			return "";
		}

		
	}
	
	///set password
	private String randomPassword(int l) {
		String pass="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi"
		          +"jklmnopqrstuvwxyz!@#$%&";
		char[] arr= new char[l];
		
		for (int i = 0; i < arr.length; i++) {
		int a=	(int)( Math.random()* pass.length());
		arr[i]=pass.charAt(a);
			//System.out.println(arr);
		}
		
		
		return new String(arr);

		
		
		
	}

	
	
	

}
