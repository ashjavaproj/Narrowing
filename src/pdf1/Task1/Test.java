package pdf1.Task1;

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
	public static void main(String args[])
	{
		Test t=new Test();
		t.m1(null);//m1---String 
		//accouring to narrowing rule always call child value
		// we have to call the value of object class then we have to type cast 
		t.m1((Object)null);//m1---Object
	}
}