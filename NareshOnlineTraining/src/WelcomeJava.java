
public class WelcomeJava {
	//static variable
	static String instituename="Naresh";
	//instance variables
    static  int a;
	
	String name;
	//non static method
	
	
	  void display(){
            System.out.println("I am in display method");
            System.out.println(instituename);
	  }
	  //static method
	  static void input(){
		  WelcomeJava	std1=new WelcomeJava();
		  System.out.println(std1.instituename);  
	  }
	
    	public static void main(String[] args){
    		//syntax for object creation
    		WelcomeJava	std1=new WelcomeJava();
    		
    		std1.name="arun";
    		System.out.println("Student "+std1.name+" is learining selenium from"+WelcomeJava.instituename);
    		
    		WelcomeJava std2=new WelcomeJava();
    		std2.name="kumar";
    		System.out.println("Student "+std2.name+" is learining selenium from"+instituename);
    		
    		
    		std1.a=200;
    		System.out.println(std1.a);
    		std2.a=400;    		
    		System.out.println(std1.a);
    		
    		
    		Addition objname=new Addition();
    		objname.addition(200, 300);
    		
    		
    		
    	}
    	
    	
    	

}
