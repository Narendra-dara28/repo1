//abstract class we cannot create object in abstrct class ,abstarct method diesnot have mathod
//abstact class have both regular and abstarct methods
//when declare abstract to method and automatically declare to class also
abstract class abstract1
{
	  public void print()
	{
		System.out.println("Narendra");
	}
}
class abstract2 extends abstract1
{
	public void data()
	{
		System.out.println("this abstract class");
	}
}
class AbstarctClassMethod
{
	public static void main(String[]args)
	{
		abstract2 obj=new abstract2();
		obj.data();
		obj.print();
	}
}
		
		



	