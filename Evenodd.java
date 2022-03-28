package sumevenodd;
public class Evenodd {

	public static void main(String[] args) 
	{
		int i, evenSum = 0, oddSum = 0;
		
		
		for(i = 1; i <= 200; i++)
		{
			if(i % 2 == 0)
			{
				evenSum = evenSum + i; 
			}
			else
			{
				oddSum = oddSum + i;
			}
		}
		System.out.println("\n The Sum of Even Numbers upto " + 200 + "  =  " + evenSum);
		System.out.println("\n The Sum of Odd Numbers upto " + 200 + "  =  " + oddSum);
	}
}