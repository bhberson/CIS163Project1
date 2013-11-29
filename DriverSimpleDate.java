/*****************************************************************
 * 
 *****************************************************************/
package project1;

/*****************************************************************
 * Driver to test the SimpleDate Class.
 * 
 * @author Brody Berson
 * @version 1.0
 *****************************************************************/
public class DriverSimpleDate {

    /*****************************************************************
     * @param args
     *****************************************************************/
    public static void main(String[] args) {
	
	SimpleDate d = new SimpleDate ("01/12/2000");
	
	SimpleDate firstDate = new SimpleDate (1,21,2012);
	SimpleDate equalDate = new SimpleDate (1,21,2012);

	System.out.println (firstDate.getDay());
	System.out.println (firstDate.getMonth());
	System.out.println (firstDate.getYear());
	System.out.println (firstDate); //automatically calls ToString when no method called

	if(firstDate.isLeapYear())
	    System.out.println("firstDate is a Leap Year");
	else
	    System.out.println("firstDate is not a leap year");

	System.out.println ("==========================");


	//Testing out static methods and variables
	if(SimpleDate.isLeapYear(2400))
	    System.out.println("2400 is a Leap Year, there are " +
		    "this many days: " + SimpleDate.daysInYear(2400));
	else
	    System.out.println("2400 is not a leap year, there are " +
		    "this many days: " + SimpleDate.daysInYear(2400));

	if(SimpleDate.isLeapYear(1753))
	    System.out.println("MIN_YEAR (1753) is a Leap Year, there are " +
		    "this many days: " + SimpleDate.daysInYear(1753));
	else
	    System.out.println("MIN_YEAR (1753) is not a leap year, there are " +
		    "this many days: " + SimpleDate.daysInYear(1753));
	
	System.out.println ("==========================");


	SimpleDate secondDate = new SimpleDate ("12/25/1991");
	System.out.println (secondDate.getDay());
	System.out.println (secondDate.getMonth());
	System.out.println (secondDate.getYear());

	//next two lines print out same thing
	System.out.println (secondDate.toString());
	System.out.println (secondDate);
	
	
	System.out.println ("==========================");


	//days in year for secondDate and test leap year
	System.out.println("Days in the year " + secondDate.daysInYear());
	if(secondDate.isLeapYear())
	    System.out.println("secondDate is a Leap Year");
	else
	    System.out.println("secondDate is not a leap year");

	System.out.println ("==========================");

	//tests a few equals cases, first should be, second not
	if (firstDate.equals(equalDate))
	    System.out.println ("firstDate equals equalDate");
	else
	    System.out.println ("firstDate doesn't equal equalDate");

	if (firstDate.equals(secondDate))
	    System.out.println ("firstDate equals secondDate");
	else
	    System.out.println ("firstDate doesn't equal secondDate");
	
	
	System.out.println ("==========================");
	System.out.println (firstDate);
	System.out.println (secondDate);
	System.out.println ("==========================");

	//Testing days ago and days from now with positive and negative numbers
	System.out.println("Days ago [10] of firstDate " + firstDate.daysAgo(10));
	System.out.println("Days ago [-10] of firstDate " + firstDate.daysAgo(-10));
	System.out.println("Days from now [20] of firstDate " + firstDate.daysFromNow(20));
	System.out.println("Days from now [-20] of firstDate " + firstDate.daysFromNow(-20));
	System.out.println("Days in the year of firstDate " + firstDate.daysInYear());

	System.out.println("Days ago [5] of secondDate " + secondDate.daysAgo(5));
	System.out.println("Days ago [-5] of secondDate " + secondDate.daysAgo(-5));
	System.out.println("Days from now [1] of secondDate " + secondDate.daysFromNow(1));
	System.out.println("Days from now [-1] of secondDate " + secondDate.daysFromNow(-1));
	System.out.println("Days in the year of secondDate " + secondDate.daysInYear());

	System.out.println("Days ago [0] of secondDate " + secondDate.daysAgo(0));
	System.out.println("Days from now [0] of secondDate " + secondDate.daysFromNow(0));

	
	System.out.println ("==========================");

	
	//tests a few ordinal dates
	System.out.println("firstDate's ordinal date is " + firstDate.ordinalDate());
	System.out.println("secondDate ordinal date is " + secondDate.ordinalDate());

	System.out.println ("==========================");
	System.out.println (firstDate);
	System.out.println (secondDate);
	System.out.println ("==========================");
	
	//12,25,2011
	//1,19,2012
	//tests the Day of the Week
	System.out.println("firstDate's day of the week is [Tuesday] " + firstDate.dayOfWeek());
	System.out.println("secondDate's day of the week is [Saturday] " + secondDate.dayOfWeek());
	System.out.println ("==========================");
	SimpleDate beginning = new SimpleDate (12,30,2011);
	System.out.println(beginning);
	System.out.println("beginning's day of the week is [Friday] " + beginning.dayOfWeek());
	System.out.println("Days from now [1] of beginning " + beginning.daysFromNow(1));
	System.out.println("beginning's day of the week is [Saturday] " + beginning.dayOfWeek());
	System.out.println("Days from now [1] of beginning " + beginning.daysFromNow(1));
	System.out.println("beginning's day of the week is [Sunday] " + beginning.dayOfWeek());




	//Will go to next date and return
//	System.out.println ("firstDate is " + firstDate.toString());
//	firstDate.nextDate();
//	System.out.println ("firstDate (Next Date) is " + firstDate.toString());
//	firstDate.prevDate();
//	System.out.println ("firstDate (Prev Date) is " + firstDate.toString());


	//Test next/prev date on the border of a month/year
//	SimpleDate thirdDate = new SimpleDate("12/30/1999");
//	System.out.println ("thirdDate is " + thirdDate.toString());
//	thirdDate.nextDate();
//	System.out.println ("thirdDate (Next Date) is " + thirdDate.toString());
//	thirdDate.nextDate();
//	System.out.println ("thirdDate (Next Date) is " + thirdDate.toString());
//	thirdDate.prevDate();
//	System.out.println ("thirdDate (Prev Date) is " + thirdDate.toString());

	
	//Checks for valid date
//	if (SimpleDate.isValidDate (1,21,2012))
//	    System.out.println ("firstDate is a valid date");
//	else
//	    System.out.println ("firstDate is not a valid date");
//
//	if (SimpleDate.isValidDate (20,40,1501))
//	    System.out.println ("secondDate is a valid date");
//	else
//	    System.out.println ("secondDate is not a valid date");
//
//	if (SimpleDate.isValidDate (1,21,1753))
//	    System.out.println ("Min Year Date is a valid date");
//	else
//	    System.out.println ("Min Year Date is not a valid date");
//
//	if (SimpleDate.isValidDate (1,1,1752))
//	    System.out.println ("1752 is a valid date");
//	else
//	    System.out.println ("1752 is not a valid date");
//
//	if (SimpleDate.isValidDate (0,21,2012))
//	    System.out.println ("0 Month is a valid date");
//	else
//	    System.out.println ("0 Month is not a valid date");

	/** Should crash on notDate */
//	SimpleDate notDate = new SimpleDate (0,32,1500);
//	System.out.println(notDate);

    }

}
