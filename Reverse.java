
public class Reverseno {

	public static void main(String[] args) 
	{
       int number=231, reminder, rev=0;
       while(number !=0)
       {
    	   reminder=number%10;
    	   rev=rev*10+reminder;
    	   number=number/10;
       }
         System.out.println(rev);
	}

}
