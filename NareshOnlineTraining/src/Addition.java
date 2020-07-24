
public class Addition {

	int sum;
	
	int addition(int num1,int num2){
		sum=num1+num2;
		return sum;
		//sSystem.out.println(sum);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Addition add=new Addition();
		add.addition(100,500);
		add.addition(200,400);


	}

}
