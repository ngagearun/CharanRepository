
public class ConditionalStatements {
	
	int num1=100;
	static void checknumber(int num){
		
		if(num%2==0){
			System.out.println("it is an Even Number");
		}else{
			System.out.println("It is an Odd Number");
		}
	}
	
	
	String validatepinnumber(int pinnumber){
	
		String value=null;
		if(pinnumber==123445){
			value="Valid Pin number";
		}else{
			value="invalid pin number";
		}
		return value;
	}

	public static void main(String[] args) {
		
		checknumber(13);		
		ConditionalStatements con=new ConditionalStatements();		
		String text=con.validatepinnumber(23455);
		if(text.equalsIgnoreCase("invalid pin number")){
			System.out.println("Hey user,Try to check your password again");
		}

	}

}
