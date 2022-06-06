package projects;
import java.util.Scanner;


public class Commission {
	String Name;
	String Address;
	int phone;
	float sales_amt;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		Name=sc.nextLine();
		
		System.out.println("enter the Address");
		Address=sc.nextLine();
		
		System.out.println("enter the phone number");
		phone=sc.nextInt();
	}
	void compute()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the Sales amount");
		sales_amt=sc.nextFloat();
		if(sales_amt>=100000)
		{
			System.out.println("commission=10%");
		}
		else if(50000 =sales_amt<100000)
		{
			System.out.println("commission=5%");
		
		}
		else if(30000<=sales_amt<50000)
		{
			System.out.println("commission=3%");
		}
		else
		{
			System.out.println("no commission");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		commission com=new commission();
		com.input();
		com.compute();
	}
}

	}

}
