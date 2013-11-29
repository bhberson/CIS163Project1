package project1;

import java.util.Scanner;

/*****************************************************************
 * Stores and analyzes calendar dates.
 * 
 * @author Brody Berson
 *****************************************************************/
public class SimpleDate {

    /** Minimum allowable year (currently set to {@code 1753}). If
     * earlier years are allowed, we have to worry about the switch
     * from the Julian to Gregorian calendar. */
    private static final int MIN_YEAR = 1753;

    /** Minimum allowable year for the two digit cut-off */
    private static int minTwoDigitYear = 1930;

    /** an integer for month 1-12 */
    private int month;

    /** an integer for day 1-31 */
    private int day;

    /** an integer for month < 1753 */
    private int year;


    /*****************************************************************
     * Constructor taking in a date in the format of mm/dd/yyyy.
     * 
     * @param myDate
     * 		a date that is then separated into month, day, and year
     * @throws IllegalArgumentException when not valid date/unparseable
     *****************************************************************/
    public SimpleDate (String myDate) throws IllegalArgumentException {
	try {
	    myDate.trim();
	    Scanner dateReader = new Scanner (myDate);
	    dateReader.useDelimiter("/");
	    month = dateReader.nextInt();
	    day = dateReader.nextInt(); 
	    year = dateReader.nextInt(); 
	}

	catch (Exception e)  {
	    throw new IllegalArgumentException();
	}

	//	if (year < 100) {
	//	    String endMin = "" + getMinTwoDigitYear();
	//	    endMin = endMin.substring(2);
	//	    String begMin = "" + getMinTwoDigitYear();
	//	    begMin = endMin.substring(0,2);
	//	    
	//	    if (Integer.parseInt(endMin) > year) {
	//		begMin = begMin + year;
	//	    	year = Integer.parseInt(begMin);
	//	    }
	//	    else {
	//		int yy = Integer.parseInt(begMin) + 1;
	//		begMin = Integer.toString(yy) + year;
	//	    	year = Integer.parseInt(begMin);
	//	    }
	//	}

	if (!isValidDate(month,day,year)) 
	    throw new IllegalArgumentException("Not Valid Date");
    }

    /*****************************************************************
     * Constructor taking month, day, and year as integers.
     * 
     * @param month
     * 		the month
     * @param day
     * 		the day
     * @param year
     * 		the year
     * @throws IllegalArgumentException when not valid date
     *****************************************************************/
    public SimpleDate (int month, int day, int year) {
	if (!isValidDate(month,day,year)) 
	    throw new IllegalArgumentException("Not Valid Date");

	this.month = month;
	this.day = day;
	this.year = year;
    }

    /*****************************************************************
     *Returns the month.
     *
     * @return {@code month} - the month
     *****************************************************************/
    public int getMonth() {
	return month;
    }

    /*****************************************************************
     *Returns the day of the month.
     *
     * @return {@code day} - the day
     *****************************************************************/
    public int getDay() {
	return day;
    }

    /*****************************************************************
     * Returns the year.
     * 
     * @return {@code year} - the year
     *****************************************************************/
    public int getYear() {
	return year;
    }

    /*****************************************************************
     * Returns the minimum cut off for the two year constructor.
     * 
     * @return {@code minTwoDigitYear}
     *****************************************************************/
    public static int getMinTwoDigitYear() {
	return minTwoDigitYear;
    }

    /*****************************************************************
     * Resets the minimum cut off for the two year static variable.
     * 
     * @param pMinTwoDigitYear
     * 		a date to change the static minTwoDigitYear.
     *****************************************************************/
    public static void setMinTwoDigitYear(int pMinTwoDigitYear) {
	minTwoDigitYear = pMinTwoDigitYear;
    }

    /*****************************************************************
     * Returns a boolean status of {@code true} if this date is in a
     * leap year, {@code false} otherwise.
     * @return {@code true} if this date is in a leap year,
     *         {@code false} otherwise.
     *****************************************************************/
    public boolean isLeapYear() {
	if (year % 4 == 0){
	    if (year % 100 == 0){
		if (year % 400 == 0)
		    return true;
		else
		    return false;
	    }
	    else
		return true;
	}
	else
	    return false;
    }

    /*****************************************************************
     * Returns a boolean status of {@code true} if the given year is a
     * leap year, {@code false} otherwise.
     * 
     * @param year
     * 		the given year.
     * @return {@code true} if the given year is a leap year,
     *         {@code false} otherwise.
     *****************************************************************/
    public static boolean isLeapYear(int year) {
	if (year % 4 == 0){
	    if (year % 100 == 0){
		if (year % 400 == 0)
		    return true;
		else
		    return false;
	    }
	    else
		return true;
	}
	else
	    return false;
    }

    /*****************************************************************
     * Returns the number of days in the year.
     * 
     * @return {@code 365} if the year is not a leap year,
     *         {@code 366} otherwise.
     *****************************************************************/
    public int daysInYear() {
	if (!isLeapYear())
	    return 365;
	else
	    return 366;
    }

    /*****************************************************************
     * Returns the number of days in the given year.
     * 
     * @param year
     * 		the given year.
     * @return {@code 365} if the given year is not a leap year,
     *         {@code 366} otherwise.
     *****************************************************************/
    public static int daysInYear(int year) {
	if (!isLeapYear(year))
	    return 365;
	else
	    return 366;
    }

    /*****************************************************************
     * Returns the number of days in the month.
     * 
     * @return {@code 28} if it's February and not a leap year.
     *         {@code 29} if it's February and a leap year.
     *         {@code 30} Apr, Jun, Sep, Nov Months.
     *         {@code 31} Jan, Mar, May, Jul, Aug, Oct, & Dec Months.
     *****************************************************************/
    private static int daysInMonth(int month, int year) {
	if ((month == 1) || (month == 3) || (month == 5) || (month == 7)
		|| (month == 8) || (month == 10) || (month == 12))
	    return 31;

	if ((month == 4) || (month == 6) || (month == 9) || (month == 11))
	    return 30;

	if (isLeapYear(year))
	    return 29;
	else
	    return 28;
    }

    /*****************************************************************
     * Returns {@code true} if the date is valid, {@code false} otherwise.
     * 
     * @param month
     * 		the month
     * @param day
     * 		the day
     * @param year
     * 		the year
     * @return {@code true} if the date is valid,
     *         {@code false} otherwise.
     *****************************************************************/
    private static boolean isValidDate(int month, int day, int year) {
	if (year >= MIN_YEAR)
	    if ((month > 0) && (month < 13))
		if ((day > 0) && (day <= daysInMonth(month, year)))
		    return true;

	return false;
    }

    /*****************************************************************
     * Returns the current day of the week ranging from Monday to
     * Sunday.
     * 
     * @return {@code DayOfWeek.Monday} if it's a Monday.
     *	       {@code DayOfWeek.Tuesday} if it's a Tuesday.
     *	       {@code DayOfWeek.Wednesday} if it's a Wednesday.
     *	       {@code DayOfWeek.Thursday} if it's a Thursday.
     *	       {@code DayOfWeek.Friday} if it's a Friday.
     *	       {@code DayOfWeek.Saturday} if it's a Saturday.
     *	       {@code DayOfWeek.Sunday} if it's a Sunday.
     *****************************************************************/
    public DayOfWeek dayOfWeek() {
	int totalDays = 0;
	if (year > MIN_YEAR) {
	    for (int i=MIN_YEAR; i < year; i++)
		totalDays += daysInYear(i);
	}
	totalDays += ordinalDate();

	int today = totalDays % 7;
	DayOfWeek thisDay = null;

	switch(today){
	case 1:
	    thisDay = DayOfWeek.Monday;
	    break;
	case 2:
	    thisDay = DayOfWeek.Tuesday;
	    break;
	case 3:
	    thisDay = DayOfWeek.Wednesday;
	    break;
	case 4:
	    thisDay = DayOfWeek.Thursday;
	    break;
	case 5:
	    thisDay = DayOfWeek.Friday;
	    break;
	case 6:
	    thisDay = DayOfWeek.Saturday;
	    break;
	case 0:
	    thisDay = DayOfWeek.Sunday;
	    break;
	default:
	    thisDay = null;
	    break;
	}
	return thisDay;
    }

    /*****************************************************************
     * Private helper method that returns the next date of this date.
     * 
     * @return {@code SimpleDate} the following date
     *****************************************************************/
    private SimpleDate nextDate() {
	day++;
	if (day > daysInMonth(month,year)) {
	    day = 1;
	    month++;
	}
	if (month > 12) {
	    month = 1;
	    year++;
	}
	return new SimpleDate (month, day, year); 
    }

    /*****************************************************************
     * Private helper method that returns the previous date of this date.
     * 
     * @return {@code SimpleDate} the previous date
     *****************************************************************/
    private SimpleDate prevDate() {
	day--;
	if (day < 1) {
	    month--;
	    if (month < 1) {
		month = 12;
		year--;
		if (year < MIN_YEAR)
		    throw new IllegalArgumentException("Not Valid Year");
	    }
	    day = daysInMonth(month,year);
	}
	return new SimpleDate (month, day, year); 
    }

    /*****************************************************************
     * Returns the previous date of this date {@code n} days ago.
     * 
     * @return {@code SimpleDate} the previous date {@code n} days ago.
     *****************************************************************/
    public SimpleDate daysAgo(int n) {
	if (n<0)
	    daysFromNow(-n);
	for (int i = 0; i < n; i++)
	    prevDate();
	return new SimpleDate (month, day, year); 
    }

    /*****************************************************************
     * Returns the previous date of this date {@code n} days from now.
     * 
     * @return {@code SimpleDate} the previous date {@code n} days 
     * 		from now.
     *****************************************************************/
    public SimpleDate daysFromNow(int n) {
	if (n<0)
	    daysAgo(-n);
	for (int i = 0; i < n; i++)
	    nextDate();
	return new SimpleDate (month, day, year); 
    }

    /*****************************************************************
     * Returns the unique number of days in the year, the total, up
     * until the current date.
     * 
     * @return {@code ordinal} the unique number of days in the year
     * 		up until the current date.
     *****************************************************************/
    public int ordinalDate() {
	int ordinal = 0;

	if (month == 1) {
	    ordinal = day;
	    return ordinal;
	}
	else {
	    int i=1;
	    while (i < month) {
		ordinal += daysInMonth(i, year);
		i++;
	    }
	    ordinal += day;
	}
	return ordinal;
    }

    /*****************************************************************
     * If {@code other} is an {@code ISimpleDate}, then call
     * {@link #equals(SimpleDate)}, otherwise return {@code false}.
     * 
     * @param other
     *            the other object to compare
     * @return {@code true} if the two object represent the same date,
     *         {@code false} otherwise.
     *****************************************************************/
    @Override
    public boolean equals(Object other) {
	if (other instanceof SimpleDate) {
	    return this.equals((SimpleDate) other);
	}
	else {
	    return false;
	}
    }

    /*****************************************************************
     * If {@code other} is equal to the date, return {@code true},
     * otherwise return {@code false}.
     * 
     * @param other
     *            the other object to compare
     * @return {@code true} if the two object represent the same date,
     *         {@code false} otherwise.
     *****************************************************************/
    public boolean equals(SimpleDate other) {
	if ((other.getDay() == day) && (other.getMonth() == month) &&
		(other.getYear() == year))
	    return true;

	else
	    return false;
    }

    /*****************************************************************
     * Returns a 1 if the {@code other} object is greater than the date,
     * a 0 if the {@code other} object is equal to the date, and a -1
     * if the {@code other} object is less than the date.
     * 
     * @param other
     *            the other object to compare
     * @return 1 if {@code other} is before the first date.
     * 	       0 if {@code other} is equal to the date.
     * 	      -1 if {@code other} is after the first date.
     *****************************************************************/
    public int compareTo(SimpleDate other) {
	if ((other.getDay() < day) || (other.getMonth() < month) ||
		(other.getYear() < year))
	    return 1;
	else if (equals(other))
	    return 0;
	else
	    return -1;
    }

    /*****************************************************************
     * Returns a relatively unique integer describing this date.
     * 
     * @return a relatively unique integer describing this date.
     *****************************************************************/
    @Override
    public int hashCode() {
	return 366 * getYear() + ordinalDate();
    }

    /*****************************************************************
     * Return a {@code String} describing this date
     *
     * @return a {@code String} describing this date
     *****************************************************************/
    public String toString() {
	return String.format("%d/%d/%4d", month, day, year);
    }
}
