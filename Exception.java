package Exceptionjava;
import java.util.Scanner;
public class Exception {



	public static void main(String[] args) {
		int num1,num2;
		Scanner sn=new Scanner(System.in);
		num1=sn.nextInt();
		num2=sn.nextInt();
		System.out.println("before div");
		int result=0;
		try //identifies exception and creates an object and throws it to the 
		//catch block
		{
			
		result=num1/num2;
		System.out.println("After div");
		
		}catch(Exception ex)//Exception ex=new ArthmaticException();
		{
			System.out.println("exception message"+ex.getMessage());
		}
		
		System.out.println("the result is = "+result);
		
	}

}
