package pdf1.Task2;

public class Test
{
	public void m1(Object o)//parent class of all the classes
	{
		System.out.println("m1---Object");
	}
	public void m1(String s1)//child class of object class 
	{
		System.out.println("m1---String");
	}
	
	public void m1(A a)//child class of object class 
	{
		System.out.println("m1---A");
	}
	public static void main(String args[])
	{
		Test t=new Test();
		//t.m1(null);//this line gives the error(Ambiguty error) bcoz of compiler confused there are two child 
			  // where passed the null value 
		//this time we have to type cast child class also to call value 	
		t.m1((A)null);//m1---A
		t.m1((String)null);//m1---String
		t.m1((Object)null);//m1---Object
	}
}