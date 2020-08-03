import java.util.Scanner;


public class ArrayDemo {

	public static void main(String[] args) {
		
		String countrynames[]=new String[5];
		countrynames[0]="India";
		countrynames[1]="UK";
		countrynames[2]="NZ";
		countrynames[3]="US";
		countrynames[4]="Austalia";
	
		
		/*int i=0;
		while(i<5){
			System.out.println(countrynames[i]);
			i++;
		}*/
		
//		for(int i=0;i<countrynames.length;i++){
//		System.out.println(countrynames[i]);
//		}
		
		
		//int rollos[]={1001,1002,1003,1004,1005};
		
		int accno[][]={
					  	{1001,1002,1003,1004},
					  	{2001,2002,2003,2004},
					  	{3001,3002,3003,3004}
		};
		
		for(int row=0;row<accno.length;row++){
			
			for(int col=0;col<accno[row].length;col++){
				
				System.out.println(accno[row][col]);
			}
			
		}
		
		
	}

}
