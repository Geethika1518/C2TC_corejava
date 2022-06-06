package abstraction;
abstract class Day
{
	abstract void withdraw();
}

public class Atm extends Day {
	void withdraw()
	{
		System.out.println("withdrawn successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm ob1=new Atm();
		ob1.withdraw();

	}

}

