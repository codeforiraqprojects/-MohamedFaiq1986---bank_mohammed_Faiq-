package bank_con;

import java.util.Scanner;
class acc   {
		 int acc_no;  
		String name;  
		 float amount; 
		 String phone;
		String adress;
		Scanner input=new Scanner(System.in);
    //insert and info
					void insert()  {
					System.out.print("id :  ");
					acc_no=input.nextInt();
					System.out.print(" name :  ");
					name=input.next();
					System.out.print(" amount :  ");
					amount=input.nextFloat();
					System.out.print(" phone :  ");
					phone=input.next();
					System.out.print(" adress :  ");
					adress=input.next();
				}  
		
		//deposit method (add) 
		void deposit(){
			float amt;
			System.out.print("Enter the amount:  ");
			amt=input.nextFloat();
		amount=amount+amt;  
		System.out.println(amt+" deposited");  
		}  
		//withdraw method  
		void withdraw(){
			float amt;
			System.out.print("Enter the amount:  ");
			amt=input.nextFloat();
		if(amount<amt){  
		System.out.println("your credit is insufficient");  
		}else{  
		amount=amount-amt;  
		System.out.println("Amount withdrawn :  "+amt);  
		}  
		}  

	    //method to check the balance of the account  
		void checkBalance(){
			System.out.println("your balance is : "+amount);}  
		//method to display the values of an object  
		void display(){
			System.out.println("ID:  "+acc_no);
			System.out.println("Name:"+ name);
			System.out.println("Account opening balance: "+amount); 
			System.out.println("phone: "+ phone);
			System.out.println("home adress:" + adress);
			} 
		void list()  {
			System.out.println("hello Chose");
			System.out.println("1:Add a customer");
			System.out.println("2:addition to the balance");
			System.out.println("3:Cash withdrawal");
			System.out.println("4:Balance inquiry");
			System.out.println("5:Customer Information");
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		int a;
		a=input.nextInt();
		
			switch (a) {
			case 1:
				insert();
				list();
				break;
			case 2:
				
				deposit();
				list();
			
				break;
			case 3:
				withdraw();
				list();
				
				
				
				break;
			case 4:
				checkBalance();
				list();
				
								
				break;
			case 5:
				
				display();
				list();	
				
				break;				
								
				default:
				System.out.println("hello Chose");
				System.out.println("1:Add a customer");
				System.out.println("2:addition to the balance");
				System.out.println("3:Cash withdrawal");
				System.out.println("4:Balance inquiry");
				System.out.println("5:Customer Information");
				System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
				list();
				
				break;
			}
			
		
		}
} 

 
