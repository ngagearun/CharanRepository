
public class Addition {

	int sum;
	
	int addition(int num1,int num2){
		sum=num1+num2;
		return sum;
		//sSystem.out.println(sum);
	}
	
	int addition(int num1,int num2,int num3){
		sum=num1+num2+num3;
		return sum;
		//sSystem.out.println(sum);
	}
	
	int addition(int num1,int num2,int num3,int num4){
		sum=num1+num2+num3+num4;
		return sum;
		//sSystem.out.println(sum);
	}
	
	float addition(float num1,float num2){
		float sum=num1+num2;
		return sum;
	}

	
	public  void main(String[] args) {
		
		Addition add=new Addition();
		System.out.println(add.addition(300, 344, 44));
		System.out.println(add.addition(234.5f, 334.5f));


	}

}
