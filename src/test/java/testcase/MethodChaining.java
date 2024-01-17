package testcase;

public class MethodChaining 
{

	public static void main(String[] args) 
	{
		
		MethodChaining ob = new MethodChaining();
		
		String age = ob.setCity("Delhi").setAge(19).getCity();
		System.out.println(age);
	}

	
	String city;
	int age;
	String name;
	
	public MethodChaining setCity(String city)
	{
		this.city=city;
		return this;
	}
	
	public String getCity()
	{
		
		return this.city;
	}
	
	public MethodChaining setAge(int age)
	{
		this.age = age;
		return this;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void setName()
	{
		
	}
	
	
}
