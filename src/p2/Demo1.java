package p2;
import p1.*;
import java.util.Scanner;
public class Demo1 {

	public static void main(String[] args)
	{
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the value-1:");
	    int v1 = s.nextInt();
	    System.out.println("Enter the value-2:");
	    int v2 = s.nextInt();
	    System.out.println("***** choice ******");
	    System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.ModDivision");
	    int choice = s.nextInt();
	    switch(choice)
	    {
	    case 1:
	    	Addition ad = new Addition();
	    	System.out.println("Sum :" +ad.calculate(v1, v2));
	    	break;
	    case 2:
	    	Subtraction sb = new Subtraction();
	    	System.out.println("Sub :" +sb.calculate(v1, v2));
	    	break;
	    case 3:
	    	Multiplication mul = new Multiplication();
	    	System.out.println("mul :" +mul.calculate(v1, v2));
	    	break;
	    case 4:
	    	Division div = new Division();
	    	System.out.println("Div :" +div.calculate(v1, v2));
	    	break;
	    case 5:
	    	ModDivision Mod= new ModDivision();
	    	System.out.println("Mod Division :" +Mod.calculate(v1, v2));
	    	break;
	    	default:
	    		System.out.println("Invalid choice....");
	    }//end of switch
	    s.close();
	}

}
