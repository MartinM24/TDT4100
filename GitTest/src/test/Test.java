package test;

public class Test {
	private String name;
	private int age;
	
	public Test(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Test(){
		this("Default",-1);
	}
	
	public Test(int age){
		this("Default",age);
	}
	
	public Test(String name){
		this(name,-1);
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public static void main(String[] args) {
		Test test = new Test("Adam");
		Test test2 = new Test(35);
		Test[] testArray = new Test[]{test,test2};
		for (int i = 0; i < testArray.length;i++){
			System.out.println("test"+i);
			System.out.println(testArray[i].getAge());
			System.out.println(testArray[i].getName());
		}
		
		
	}
}


