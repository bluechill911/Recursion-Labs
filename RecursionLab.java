// Lab 0 - Recursion Review
// Brandon Evans CSC 240
// 8/30/20

public class RecursionLab
{
	public static void main( String [] args)
	{
		//sumDigits output
		System.out.println("sumDigits(126) -> " + sumDigits(126));
		System.out.println("sumDigits(49) -> " + sumDigits(49));
		System.out.println("sumDigits(2) -> " + sumDigits(2));
		System.out.println("");

		//count9 output
		System.out.println("count9(919) -> " + count9(919));
		System.out.println("count9(9) -> " + count9(9));
		System.out.println("count9(123) -> " + count9(123));
		System.out.println("");


		//doubleDollar output
		System.out.println("doubleDollar(1, 10) -> " + doubleDollar(1, 10));
		System.out.println("doubleDollar(1, 1) -> " + doubleDollar(1, 1));
		System.out.println("doubleDollar(1, 14) -> " + doubleDollar(1, 14));
		System.out.println("");

		//isPrime output
		System.out.println("count9(919) -> " + count9(919));
		System.out.println("count9(9) -> " + count9(9));
		System.out.println("count9(123) -> " + count9(123));
		System.out.println("");

		//pairStar output
		System.out.println("count9(919) -> " + count9(919));
		System.out.println("count9(9) -> " + count9(9));
		System.out.println("count9(123) -> " + count9(123));
		System.out.println("");

		//array11 output
		System.out.println("count9(919) -> " + count9(919));
		System.out.println("count9(9) -> " + count9(9));
		System.out.println("count9(123) -> " + count9(123));
		System.out.println("");
	}

	//adding each digit in the number given
	public static int sumDigits(int number)
	{
		//base case
		if(number==0)
			return 0;

		//recursive case
		else
			return number % 10 + sumDigits(number/10);
	}

	//add one to a counter if the number % 10 is 9
	public static int count9(int number)
	{
		//base case
		if(number==0)
			return 0;

		//recursive case add 1
		else if(number % 10 == 9)
			return 1 + count9(number/10);

		//recursive case next digit no 9
		else
			return count9(number/10);
	}

	//doubling a value for a dollar for n days
	public static long doubleDollar(long numDollars, int days)
	{
		//base case reaching last day (day 0)
		if (days==0)
			return numDollars;

		//recursive case days is one or greater
		else if (days>=1)
			return doubleDollar((numDollars * 2), days-1);

		//obligatory else for negative numDollars
		else
			return numDollars;
	}


}


