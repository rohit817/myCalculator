import java.util.*;
public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter Second number:");
		int b = sc.nextInt();
	    
		Calculator cSum=new Calculator();

		Calculator cSub=new Calculator();

		Calculator cMul=new Calculator();

		Calculator cDiv=new Calculator();

		int resultSum = cSum.Sum(a,b);
		int resultSub = cSub.Substraction(a,b);
		int resultMulti = cMul.Multiplication(a,b);
		float resultDiv = cDiv.Division(a,b);
		System.out.println(resultSum);
		System.out.println(resultSub);
		System.out.println(resultMulti);
		System.out.println(resultDiv);
		sc.close();
	}

}
