package project1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

@SuppressWarnings("unused")
public class SimpleDateTest {

	// *******************************************************************
	// BEGIN - JUnit tests that allow students to verify that their
	// code (SimpleDate class) conforms to the specified interface.
	// *******************************************************************
	
	@Test
	public void testConstructor_SigChk1() {
		new SimpleDate(10, 10, 1980);
	}
	
	@Test
	public void testConstructor_SigChk2() {
		new SimpleDate("10/10/1980");
	}
	
	@Test
	public void testGetDay_SigChk() {
		int day = new SimpleDate(10, 10, 1980).getDay();
	}
	
	@Test
	public void testGetMonth_SigChk() {
		int month = new SimpleDate(10, 10, 1980).getMonth();
	}
	
	@Test
	public void testGetYear_SigChk() {
		int year = new SimpleDate(10, 10, 1980).getYear();
	}
	
	@Test
	public void testDaysAgo_SigChk() {
		SimpleDate date = new SimpleDate(10, 10, 1980).daysAgo(5);
	}
	
	@Test
	public void testDaysFromNow_SigChk() {
		SimpleDate date = new SimpleDate(10, 10, 1980).daysFromNow(5);
	}
	
	@Test
	public void testDaysInYear_Instance_SigChk() {
		int days = new SimpleDate(10, 10, 1980).daysInYear();
	} 
	
	@Test
	public void testDaysInYear_Static_SigChk() {
		int days = SimpleDate.daysInYear(1980);
	}
	
	@Test
	public void testEquals_SigChk1() {
		SimpleDate date1 = new SimpleDate(5, 10, 1980);
		SimpleDate date2 = new SimpleDate(10, 10, 1980);
		boolean result = date1.equals(date2);
	}
	
	@Test
	public void testEquals_SigChk2() {
		SimpleDate date1 = new SimpleDate(5, 10, 1980);
		boolean result = date1.equals("dummy");
	}
	
	@Test
	public void testIsLeapYear_Static_SigChk() {
		boolean result = SimpleDate.isLeapYear(1980);
	}
	
	@Test
	public void testIsLeapYear_Instance_SigChk() {
		boolean result = new SimpleDate(5, 10, 1980).isLeapYear();
	}
	
	@Test
	public void testOrdinalDate_SigChk() {
		int result = new SimpleDate(5, 10, 1980).ordinalDate();
	}
	
	@Test
	public void testSetMinTwoDigitYear_SigChk() {
		SimpleDate.setMinTwoDigitYear(1930);
	}
	
	@Test
	public void testGetMinTwoDigitYear_SigChk() {
		int cutoff = SimpleDate.getMinTwoDigitYear();
	}
	
	@Test
	public void testToString_SigChk() {
		SimpleDate date1 = new SimpleDate(5, 10, 1980);
		String str = date1.toString();
	}
	
	// *******************************************************************
	// END - JUnit tests that allow students to verify that their
	// code (SimpleDate class) conforms to the specified interface.
	// *******************************************************************
	
	// *******************************************************************
	// BEGIN - JUnit tests that tests the functionality of methods in the 
	// SimpleDate class
	// *******************************************************************
	
	// Unit tests for SimpleDate constructor methods
	
	@Test
	public void testConstructor_Valid_T1() {
		SimpleDate d = new SimpleDate("1/1/2010");
		Assert.assertEquals(1, d.getMonth());
		Assert.assertEquals(1, d.getDay());
		Assert.assertEquals(2010, d.getYear());
	}	
	
	@Test
	public void testConstructor_Valid_T2() {
		SimpleDate d = new SimpleDate("1/31/2010");
		Assert.assertEquals(1, d.getMonth());
		Assert.assertEquals(31, d.getDay());
		Assert.assertEquals(2010, d.getYear());
	}	
	
	@Test
	public void testConstructor_Valid_T3() {
		SimpleDate d = new SimpleDate("2/28/1900");
		Assert.assertEquals(2, d.getMonth());
		Assert.assertEquals(28, d.getDay());
		Assert.assertEquals(1900, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T4() {
		SimpleDate d = new SimpleDate("2/28/2009");
		Assert.assertEquals(2, d.getMonth());
		Assert.assertEquals(28, d.getDay());
		Assert.assertEquals(2009, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T5() {
		SimpleDate d = new SimpleDate("2/28/2012");
		Assert.assertEquals(2, d.getMonth());
		Assert.assertEquals(28, d.getDay());
		Assert.assertEquals(2012, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T6() {
		SimpleDate d = new SimpleDate("2/29/2012");
		Assert.assertEquals(2, d.getMonth());
		Assert.assertEquals(29, d.getDay());
		Assert.assertEquals(2012, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T7() {
		SimpleDate d = new SimpleDate("3/31/2000");
		Assert.assertEquals(3, d.getMonth());
		Assert.assertEquals(31, d.getDay());
		Assert.assertEquals(2000, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T8() {
		SimpleDate d = new SimpleDate("4/30/2000");
		Assert.assertEquals(4, d.getMonth());
		Assert.assertEquals(30, d.getDay());
		Assert.assertEquals(2000, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T9() {
		SimpleDate d = new SimpleDate("5/31/2010");
		Assert.assertEquals(5, d.getMonth());
		Assert.assertEquals(31, d.getDay());
		Assert.assertEquals(2010, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T10() {
		SimpleDate d = new SimpleDate("6/30/2006");
		Assert.assertEquals(6, d.getMonth());
		Assert.assertEquals(30, d.getDay());
		Assert.assertEquals(2006, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T11() {
		SimpleDate d = new SimpleDate("7/31/2007");
		Assert.assertEquals(7, d.getMonth());
		Assert.assertEquals(31, d.getDay());
		Assert.assertEquals(2007, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T12() {
		SimpleDate d = new SimpleDate("8/31/2008");
		Assert.assertEquals(8, d.getMonth());
		Assert.assertEquals(31, d.getDay());
		Assert.assertEquals(2008, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T13() {
		SimpleDate d = new SimpleDate("9/30/2002");
		Assert.assertEquals(9, d.getMonth());
		Assert.assertEquals(30, d.getDay());
		Assert.assertEquals(2002, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T14() {
		SimpleDate d = new SimpleDate("10/31/1997");
		Assert.assertEquals(10, d.getMonth());
		Assert.assertEquals(31, d.getDay());
		Assert.assertEquals(1997, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T15() {
		SimpleDate d = new SimpleDate("11/30/1992");
		Assert.assertEquals(11, d.getMonth());
		Assert.assertEquals(30, d.getDay());
		Assert.assertEquals(1992, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T16() {
		SimpleDate d = new SimpleDate("12/31/2034");
		Assert.assertEquals(12, d.getMonth());
		Assert.assertEquals(31, d.getDay());
		Assert.assertEquals(2034, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T17() {
		SimpleDate d = new SimpleDate(1, 1, 2010);
		Assert.assertEquals(1, d.getMonth());
		Assert.assertEquals(1, d.getDay());
		Assert.assertEquals(2010, d.getYear());
	}	
	
	@Test
	public void testConstructor_Valid_T18() {
		SimpleDate d = new SimpleDate(1, 31, 2010);
		Assert.assertEquals(1, d.getMonth());
		Assert.assertEquals(31, d.getDay());
		Assert.assertEquals(2010, d.getYear());
	}	
	
	@Test
	public void testConstructor_Valid_T19() {
		SimpleDate d = new SimpleDate(2, 28, 1900);
		Assert.assertEquals(2, d.getMonth());
		Assert.assertEquals(28, d.getDay());
		Assert.assertEquals(1900, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T20() {
		SimpleDate d = new SimpleDate(2, 28, 2009);
		Assert.assertEquals(2, d.getMonth());
		Assert.assertEquals(28, d.getDay());
		Assert.assertEquals(2009, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T21() {
		SimpleDate d = new SimpleDate(2, 28, 2012);
		Assert.assertEquals(2, d.getMonth());
		Assert.assertEquals(28, d.getDay());
		Assert.assertEquals(2012, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T22() {
		SimpleDate d = new SimpleDate(2, 29, 2012);
		Assert.assertEquals(2, d.getMonth());
		Assert.assertEquals(29, d.getDay());
		Assert.assertEquals(2012, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T23() {
		SimpleDate d = new SimpleDate(3, 31, 2000);
		Assert.assertEquals(3, d.getMonth());
		Assert.assertEquals(31, d.getDay());
		Assert.assertEquals(2000, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T24() {
		SimpleDate d = new SimpleDate(4, 30, 2000);
		Assert.assertEquals(4, d.getMonth());
		Assert.assertEquals(30, d.getDay());
		Assert.assertEquals(2000, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T25() {
		SimpleDate d = new SimpleDate(5, 31, 2010);
		Assert.assertEquals(5, d.getMonth());
		Assert.assertEquals(31, d.getDay());
		Assert.assertEquals(2010, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T26() {
		SimpleDate d = new SimpleDate(6, 30, 2006);
		Assert.assertEquals(6, d.getMonth());
		Assert.assertEquals(30, d.getDay());
		Assert.assertEquals(2006, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T27() {
		SimpleDate d = new SimpleDate(7, 31, 2007);
		Assert.assertEquals(7, d.getMonth());
		Assert.assertEquals(31, d.getDay());
		Assert.assertEquals(2007, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T28() {
		SimpleDate d = new SimpleDate(8, 31, 2008);
		Assert.assertEquals(8, d.getMonth());
		Assert.assertEquals(31, d.getDay());
		Assert.assertEquals(2008, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T29() {
		SimpleDate d = new SimpleDate(9, 30, 2002);
		Assert.assertEquals(9, d.getMonth());
		Assert.assertEquals(30, d.getDay());
		Assert.assertEquals(2002, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T30() {
		SimpleDate d = new SimpleDate(10, 31, 1997);
		Assert.assertEquals(10, d.getMonth());
		Assert.assertEquals(31, d.getDay());
		Assert.assertEquals(1997, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T31() {
		SimpleDate d = new SimpleDate(11, 30, 1992);
		Assert.assertEquals(11, d.getMonth());
		Assert.assertEquals(30, d.getDay());
		Assert.assertEquals(1992, d.getYear());
	}
	
	@Test
	public void testConstructor_Valid_T32() {
		SimpleDate d = new SimpleDate(12, 31, 2034);
		Assert.assertEquals(12, d.getMonth());
		Assert.assertEquals(31, d.getDay());
		Assert.assertEquals(2034, d.getYear());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T1() {
		new SimpleDate("-1/1/2010");
	}	
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T2() {
		new SimpleDate("0/1/2010");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T3() {
		new SimpleDate("1/0/2010");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T4() {
		new SimpleDate("1/-3/2010");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T5() {
		new SimpleDate("1/1/1751");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T6() {
		new SimpleDate("1/7/-2023");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T7() {
		new SimpleDate("1/32/2010");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T8() {
		new SimpleDate("2/29/2009");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T9() {
		new SimpleDate("2/29/1900");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T10() {
		new SimpleDate("2/30/2009");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T11() {
		new SimpleDate("2/30/2012");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T12() {
		new SimpleDate("3/32/2000");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T13() {
		new SimpleDate("4/31/2000");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T14() {
		new SimpleDate("5/32/2000");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T15() {
		new SimpleDate("6/31/2000");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T16() {
		new SimpleDate("7/32/2000");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T17() {
		new SimpleDate("8/32/2000");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T18() {
		new SimpleDate("9/31/2000");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T19() {
		new SimpleDate("10/32/2000");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void constructor_Invalid_T20() {
		new SimpleDate("11/31/2000");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T21() {
		new SimpleDate("12/32/2000");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T22() {
		new SimpleDate(-1, 1, 2010);
	}	
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T23() {
		new SimpleDate(0, 1, 2010);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T24() {
		new SimpleDate(1, 0, 2010);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T25() {
		new SimpleDate(1, -3, 2010);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T26() {
		new SimpleDate(1, 1, 1751);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T27() {
		new SimpleDate(1, 7, -2023);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T28() {
		new SimpleDate(1, 32, 2010);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T29() {
		new SimpleDate(2, 29, 2009);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T30() {
		new SimpleDate(2, 29, 1900);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T31() {
		new SimpleDate(2, 30, 2009);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T32() {
		new SimpleDate(2, 30, 2012);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T33() {
		new SimpleDate(3, 32, 2000);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T34() {
		new SimpleDate(4, 31, 2000);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T35() {
		new SimpleDate(5, 32, 2000);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T36() {
		new SimpleDate(6, 31, 2000);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T37() {
		new SimpleDate(7, 32, 2000);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T38() {
		new SimpleDate(8, 32, 2000);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T39() {
		new SimpleDate(9, 31, 2000);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T40() {
		new SimpleDate(10, 32, 2000);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void constructor_Invalid_T41() {
		new SimpleDate(11, 31, 2000);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Invalid_T42() {
		new SimpleDate(12, 32, 2000);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Unparsable_T1() {
		new SimpleDate("hiMom!");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Unparsable_T2() {
		new SimpleDate("2/hiMom!");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Unparsable_T3() {
		new SimpleDate("1/h/1934");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Unparsable_T4() {
		new SimpleDate("1/2/");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Unparsable_T5() {
		new SimpleDate("");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Unparsable_T6() {
		new SimpleDate("1/2");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Unparsable_T7() {
		new SimpleDate("A/B/C");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Unparsable_T8() {
		new SimpleDate("1/1x/2006");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Unparsable_T9() {
		new SimpleDate("1!/1/2010");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructor_Unparsable_T10() {
		new SimpleDate("1/1!/2012");
	}
	
	// Unit tests for compareTo() method
	
	@Test
	public void testCompareTo_T1() {
		SimpleDate d = new SimpleDate("11/30/1992");
		Assert.assertTrue(d.compareTo(d) == 0);
	}	
	
	@Test
	public void testCompareTo_T2() {
		SimpleDate d1 = new SimpleDate("2/29/2012");
		SimpleDate d2 = new SimpleDate("2/29/2012");
		Assert.assertTrue(d1.compareTo(d2) == 0);
	}	
	
	@Test
	public void testCompareTo_T3() {
		SimpleDate d1 = new SimpleDate("3/10/2011");
		SimpleDate d2 = new SimpleDate("6/10/2011");
		Assert.assertTrue(d1.compareTo(d2) < 0);
	}
	
	@Test
	public void testCompareTo_T4() {
		SimpleDate d1 = new SimpleDate("3/10/2011");
		SimpleDate d2 = new SimpleDate("6/10/2012");
		Assert.assertTrue(d1.compareTo(d2) < 0);
	}
	
	@Test
	public void testCompareTo_T5() {
		SimpleDate d1 = new SimpleDate("3/10/2011");
		SimpleDate d2 = new SimpleDate("6/10/2011");
		Assert.assertTrue(d2.compareTo(d1) > 0);
	}
	
	@Test
	public void testCompareTo_T6() {
		SimpleDate d1 = new SimpleDate("3/10/2011");
		SimpleDate d2 = new SimpleDate("6/10/2012");
		Assert.assertTrue(d2.compareTo(d1) > 0);
	}	
	
	// Unit tests for dayOfWeek() method
	
	@Test
	public void testDayOfWeek_T1() {
		Assert.assertEquals("Error for 2/29/1908",
				DayOfWeek.Saturday,
				new SimpleDate("2/29/1908").dayOfWeek());
	}
	
	@Test
	public void testDayOfWeek_T2() {
		Assert.assertEquals("Error for 1/1/1753", DayOfWeek.Monday,
				new SimpleDate("1/1/1753").dayOfWeek());
	}
	
	@Test
	public void testDayOfWeek_T3() {
		Assert.assertEquals("Error for 1/2/1753", DayOfWeek.Tuesday,
				new SimpleDate("1/2/1753").dayOfWeek());
	}
	
	@Test
	public void testDayOfWeek_T4() {
		Assert.assertEquals("Error for 1/3/1753",
				DayOfWeek.Wednesday,
				new SimpleDate("1/3/1753").dayOfWeek());
	}
	
	@Test
	public void testDayOfWeek_T5() {
		Assert.assertEquals("Error for 1/4/1753",
				DayOfWeek.Thursday,
				new SimpleDate("1/4/1753").dayOfWeek());
	}
	
	@Test
	public void testDayOfWeek_T6() {
		Assert.assertEquals("Error for 1/5/1753", DayOfWeek.Friday,
				new SimpleDate("1/5/1753").dayOfWeek());
	}
	
	@Test
	public void testDayOfWeek_T7() {
		Assert.assertEquals("Error for 1/6/1753",
				DayOfWeek.Saturday,
				new SimpleDate("1/6/1753").dayOfWeek());
	}
	
	@Test
	public void testDayOfWeek_T8() {
		Assert.assertEquals("Error for 1/6/2012", DayOfWeek.Friday,
				new SimpleDate("1/6/2012").dayOfWeek());
	}
	
	@Test
	public void testDayOfWeek_T9() {
		Assert.assertEquals("Error for 2/1/2012", DayOfWeek.Wednesday,
				new SimpleDate("2/1/2012").dayOfWeek());
	}
	
	@Test
	public void testDayOfWeek_T10() {
		Assert.assertEquals("Error for 2/29/2012", DayOfWeek.Wednesday,
				new SimpleDate("2/29/2012").dayOfWeek());
	}
	
	@Test
	public void testDayOfWeek_T11() {
		Assert.assertEquals("Error for 12/31/2012", DayOfWeek.Monday,
				new SimpleDate("12/31/2012").dayOfWeek());
	}
	
	@Test
	public void testDayOfWeek_T12() {
		Assert.assertEquals("Error for 1/1/2013", DayOfWeek.Tuesday,
				new SimpleDate("1/1/2013").dayOfWeek());
	}
	
	// Unit tests for daysAgo() method
	
	@Test
	public void testDaysAgo_T1() {
		SimpleDate date = new SimpleDate("1/28/2011");
		SimpleDate expected = new SimpleDate("1/25/2011");
		SimpleDate actual = date.daysAgo(3);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testDaysAgo_T2() {
		SimpleDate date = new SimpleDate("1/25/2011");
		SimpleDate expected = new SimpleDate("1/28/2011");
		SimpleDate actual = date.daysAgo(-3);
		Assert.assertEquals(expected, actual);		
	}
	
	@Test
	public void testDaysAgo_T3() {
		SimpleDate date = new SimpleDate("1/25/2011");
		SimpleDate expected = new SimpleDate("1/25/2011");
		SimpleDate actual = date.daysAgo(0);
		Assert.assertEquals(expected, actual);		
	}
	
	@Test
	public void testDaysAgo_T4() {
		SimpleDate date = new SimpleDate("1/2/2011");
		SimpleDate expected = new SimpleDate("12/28/2010");
		SimpleDate actual = date.daysAgo(5);
		Assert.assertEquals(expected, actual);		
	}
	
	@Test
	public void testDaysAgo_T5() {
		SimpleDate date = new SimpleDate("12/31/2011");
		SimpleDate expected = new SimpleDate("11/30/2011");
		SimpleDate actual = date.daysAgo(31);
		Assert.assertEquals(expected, actual);		
	}
	
	@Test
	public void testDaysAgo_T6() {
		SimpleDate date = new SimpleDate("3/1/2012");
		SimpleDate expected = new SimpleDate("1/31/2012");
		SimpleDate actual = date.daysAgo(30);
		Assert.assertEquals(expected, actual);		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDaysAgo_T7() {
		SimpleDate date = new SimpleDate("1/2/1753");
		SimpleDate actual = date.daysAgo(3);
	}
	
	// Unit tests for daysFromNow() method
	
	@Test
	public void testDaysFromNow_1() {
		SimpleDate date = new SimpleDate("1/25/2011");
		SimpleDate expected = new SimpleDate("1/28/2011");
		SimpleDate actual = date.daysFromNow(3);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testDaysFromNow_2() {
		SimpleDate date = new SimpleDate("1/28/2011");
		SimpleDate expected = new SimpleDate("1/25/2011");
		SimpleDate actual = date.daysFromNow(-3);
		Assert.assertEquals(expected, actual);		
	}

	@Test
	public void testDaysFromNow_T3() {
		SimpleDate date = new SimpleDate("1/25/2011");
		SimpleDate expected = new SimpleDate("1/25/2011");
		SimpleDate actual = date.daysFromNow(0);
		Assert.assertEquals(expected, actual);		
	}
	
	@Test
	public void testDaysFromNow_T4() {
		SimpleDate date = new SimpleDate("12/28/2010");
		SimpleDate expected = new SimpleDate("1/2/2011");
		SimpleDate actual = date.daysFromNow(5);
		Assert.assertEquals(expected, actual);		
	}
	
	@Test
	public void testDaysFromNow_T5() {
		SimpleDate date = new SimpleDate("11/30/2011");
		SimpleDate expected = new SimpleDate("12/31/2011");
		SimpleDate actual = date.daysFromNow(31);
		Assert.assertEquals(expected, actual);		
	}
	
	@Test
	public void testDaysFromNow_T6() {
		SimpleDate date = new SimpleDate("1/31/2012");
		SimpleDate expected = new SimpleDate("3/1/2012");
		SimpleDate actual = date.daysFromNow(30);
		Assert.assertEquals(expected, actual);		
	}
	
	@Test
	public void testDaysFromNow_T7() {
		SimpleDate date = new SimpleDate("2/1/2012");
		SimpleDate expected = new SimpleDate("3/1/2012");
		SimpleDate actual = date.daysFromNow(29);
		Assert.assertEquals(expected, actual);		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDaysFromNow_T8() {
		SimpleDate date = new SimpleDate("1/2/1753");
		SimpleDate actual = date.daysFromNow(-3);
	}
	
	// Unit tests for daysInYear() static and instance methods
	
	@Test
	public void testDaysInYear_T1() {
		Assert.assertEquals("Year 1756 should have 366 days", 366, SimpleDate.daysInYear(1756));
	}	
	
	@Test
	public void testDaysInYear_T2() {
		Assert.assertEquals("Year 1896 should have 366 days", 366, SimpleDate.daysInYear(1896));
	}	
	
	@Test
	public void testDaysInYear_T3() {
		Assert.assertEquals("Year 1904 should have 366 days", 366, SimpleDate.daysInYear(1904));
	}	
	
	@Test
	public void testDaysInYear_T4() {
		Assert.assertEquals("Year 1908 should have 366 days", 366, SimpleDate.daysInYear(1908));
	}
	
	@Test
	public void testDaysInYear_T5() {
		Assert.assertEquals("Year 1897 should have 365 days", 365, SimpleDate.daysInYear(1897));
	}	
	
	@Test
	public void testDaysInYear_T6() {
		Assert.assertEquals("Year 1898 should have 365 days", 365, SimpleDate.daysInYear(1898));
	}	
	
	@Test
	public void testDaysInYear_T7() {
		Assert.assertEquals("Year 1899 should have 365 days", 365, SimpleDate.daysInYear(1899));
	}	
	
	@Test
	public void testDaysInYear_T8() {
		Assert.assertEquals("Year 1900 should have 365 days", 365, SimpleDate.daysInYear(1900));
	}
	
	@Test
	public void testDaysInYear_instance_T1() {
		Assert.assertEquals("Year 1756 should have 366 days", 366, new SimpleDate("1/1/1756").daysInYear());
	}	
	
	@Test
	public void testDaysInYear_instance_T2() {
		Assert.assertEquals("Year 1896 should have 366 days", 366, new SimpleDate("1/1/1896").daysInYear());
	}	
	
	@Test
	public void testDaysInYear_instance_T3() {
		Assert.assertEquals("Year 1904 should have 366 days", 366, new SimpleDate("1/1/1904").daysInYear());
	}	
	
	@Test
	public void testDaysInYear_instance_T4() {
		Assert.assertEquals("Year 1908 should have 366 days", 366, new SimpleDate("1/1/1908").daysInYear());
	}
	
	@Test
	public void testDaysInYear_instance_T5() {
		Assert.assertEquals("Year 1897 should have 365 days", 365, new SimpleDate("1/1/1897").daysInYear());
	}	
	
	@Test
	public void testDaysInYear_instance_T6() {
		Assert.assertEquals("Year 1898 should have 365 days", 365, new SimpleDate("1/1/1898").daysInYear());
	}	
	
	@Test
	public void testDaysInYear_instance_T7() {
		Assert.assertEquals("Year 1899 should have 365 days", 365, new SimpleDate("1/1/1899").daysInYear());
	}	
	
	@Test
	public void testDaysInYear_instance_T8() {
		Assert.assertEquals("Year 1900 should have 365 days", 365, new SimpleDate("1/1/1900").daysInYear());
	}
	
	// Unit tests for equals() method
	
	@Test
	public void testEquals_T1() {
		SimpleDate d = new SimpleDate("11/30/1992");
		Assert.assertTrue(d.equals(d));
	}	
	
	@Test
	public void testEquals_T2() {
		SimpleDate d1 = new SimpleDate("2/29/2012");
		SimpleDate d2 = new SimpleDate("2/29/2012");
		Assert.assertTrue(d1.equals(d2));
	}	
	
	@Test
	public void testEquals_T3() {
		SimpleDate d1 = new SimpleDate("3/10/2011");
		SimpleDate d2 = new SimpleDate("6/10/2012");
		Assert.assertFalse(d1.equals(d2));
	}
	
	@Test
	public void testEquals_T4() {
		SimpleDate d1 = new SimpleDate("3/10/2011");
		SimpleDate d2 = new SimpleDate("6/10/2012");
		Assert.assertFalse(d2.equals(d1));
	}
	
	@Test
	public void testEquals_T5() {
		SimpleDate d1 = new SimpleDate("3/10/2011");
		Integer i1 = 10;
		Assert.assertFalse(d1.equals(i1));
	}
	
	// Unit tests for isLeapYear() static and instance methods
	
	@Test
	public void testIsLeapYear_T1() {
		Assert.assertTrue("1756 should be a leap year", SimpleDate.isLeapYear(1756));
	}
	
	@Test
	public void testIsLeapYear_T2() {
		Assert.assertTrue("1896 should be a leap year", SimpleDate.isLeapYear(1896));
	}	
	
	@Test
	public void testIsLeapYear_T3() {
		Assert.assertTrue("1904 should be a leap year", SimpleDate.isLeapYear(1904));
	}	

	@Test
	public void testIsLeapYear_T4() {
		Assert.assertTrue("1908 should be a leap year", SimpleDate.isLeapYear(1908));
	}

	@Test
	public void testIsLeapYear_T5() {
		Assert.assertTrue("1996 should be a leap year", SimpleDate.isLeapYear(1996));
	}

	@Test
	public void testIsLeapYear_T6() {
		Assert.assertTrue("2000 should be a leap year", SimpleDate.isLeapYear(2000));
	}

	@Test
	public void testIsLeapYear_T7() {
		Assert.assertTrue("2004 should be a leap year", SimpleDate.isLeapYear(2004));
	}

	@Test
	public void testIsLeapYear_T8() {
		Assert.assertTrue("2008 should be a leap year", SimpleDate.isLeapYear(2008));
	}

	@Test
	public void testIsLeapYear_T9() {
		Assert.assertFalse("1753 should not be a leap year", SimpleDate.isLeapYear(1753));
	}

	@Test
	public void testIsLeapYear_T10() {
		Assert.assertFalse("1897 should not be a leap year", SimpleDate.isLeapYear(1897));
	}
	
	@Test
	public void testIsLeapYear_T11() {
		Assert.assertFalse("1898 should not be a leap year", SimpleDate.isLeapYear(1898));
	}

	@Test
	public void testIsLeapYear_T12() {
		Assert.assertFalse("1899 should not be a leap year", SimpleDate.isLeapYear(1899));
	}
	
	@Test
	public void testIsLeapYear_T13() {
		Assert.assertFalse("1900 should not be a leap year", SimpleDate.isLeapYear(1900));
	}
	
	@Test
	public void testIsLeapYear_T14() {
		Assert.assertFalse("1901 should not be a leap year", SimpleDate.isLeapYear(1901));
	}
	
	@Test
	public void testIsLeapYear_T15() {
		Assert.assertFalse("1902 should not be a leap year", SimpleDate.isLeapYear(1902));
	}
	
	@Test
	public void testIsLeapYear_T16() {
		Assert.assertFalse("1903 should not be a leap year", SimpleDate.isLeapYear(1903));
	}
	
	@Test
	public void testIsLeapYear_T17() {
		Assert.assertFalse("1999 should not be a leap year", SimpleDate.isLeapYear(1999));
	}
	
	@Test
	public void testIsLeapYear_T18() {
		Assert.assertFalse("2001 should not be a leap year", SimpleDate.isLeapYear(2001));
	}
	
	@Test
	public void testIsLeapYear_instance_T1() {
		Assert.assertTrue("1756 should be a leap year", new SimpleDate("1/1/1756").isLeapYear());
	}
	
	@Test
	public void testIsLeapYear_instance_T2() {
		Assert.assertTrue("1896 should be a leap year", new SimpleDate("1/1/1896").isLeapYear());
	}	
	
	@Test
	public void testIsLeapYear_instance_T3() {
		Assert.assertTrue("1904 should be a leap year", new SimpleDate("1/1/1904").isLeapYear());
	}	

	@Test
	public void testIsLeapYear_instance_T4() {
		Assert.assertTrue("1908 should be a leap year", new SimpleDate("1/1/1908").isLeapYear());
	}

	@Test
	public void testIsLeapYear_instance_T5() {
		Assert.assertTrue("1996 should be a leap year", new SimpleDate("1/1/1996").isLeapYear());
	}

	@Test
	public void testIsLeapYear_instance_T6() {
		Assert.assertTrue("2000 should be a leap year", new SimpleDate("1/1/2000").isLeapYear());
	}

	@Test
	public void testIsLeapYear_instance_T7() {
		Assert.assertTrue("2004 should be a leap year", new SimpleDate("1/1/2004").isLeapYear());
	}

	@Test
	public void testIsLeapYear_instance_T8() {
		Assert.assertTrue("2008 should be a leap year", new SimpleDate("1/1/2008").isLeapYear());
	}

	@Test
	public void testIsLeapYear_instance_T9() {
		Assert.assertFalse("1753 should not be a leap year", new SimpleDate("1/1/1753").isLeapYear());
	}

	@Test
	public void testIsLeapYear_instance_T10() {
		Assert.assertFalse("1897 should not be a leap year", new SimpleDate("1/1/1897").isLeapYear());
	}
	
	@Test
	public void testIsLeapYear_instance_T11() {
		Assert.assertFalse("1898 should not be a leap year", new SimpleDate("1/1/1898").isLeapYear());
	}

	@Test
	public void testIsLeapYear_instance_T12() {
		Assert.assertFalse("1899 should not be a leap year", new SimpleDate("1/1/1899").isLeapYear());
	}
	
	@Test
	public void testIsLeapYear_instance_T13() {
		Assert.assertFalse("1900 should not be a leap year", new SimpleDate("1/1/1900").isLeapYear());
	}
	
	@Test
	public void testIsLeapYear_instance_T14() {
		Assert.assertFalse("1901 should not be a leap year", new SimpleDate("1/1/1901").isLeapYear());
	}
	
	@Test
	public void testIsLeapYear_instance_T15() {
		Assert.assertFalse("1902 should not be a leap year", new SimpleDate("1/1/1902").isLeapYear());
	}
	
	@Test
	public void testIsLeapYear_instance_T16() {
		Assert.assertFalse("1903 should not be a leap year", new SimpleDate("1/1/1903").isLeapYear());
	}
	
	@Test
	public void testIsLeapYear_instance_T17() {
		Assert.assertFalse("1999 should not be a leap year", new SimpleDate("1/1/1999").isLeapYear());
	}
	
	@Test
	public void testIsLeapYear_instance_T18() {
		Assert.assertFalse("2001 should not be a leap year", new SimpleDate("1/1/2001").isLeapYear());
	}
	
	// Unit tests for ordinalDate() method
	
	@Test
	public void testOrdinalDate_T1() {
		SimpleDate d = new SimpleDate("1/1/2007");
		Assert.assertEquals(1, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T2() {
		SimpleDate d = new SimpleDate("1/2/2007");
		Assert.assertEquals(2, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T3() {
		SimpleDate d = new SimpleDate("1/31/2007");
		Assert.assertEquals(31, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T4() {
		SimpleDate d = new SimpleDate("2/1/2007");
		Assert.assertEquals(32, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T5() {
		SimpleDate d = new SimpleDate("2/28/2007");
		Assert.assertEquals(59, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T6() {
		SimpleDate d = new SimpleDate("3/1/2007");
		Assert.assertEquals(60, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T7() {
		SimpleDate d = new SimpleDate("3/31/2007");
		Assert.assertEquals(90, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T8() {
		SimpleDate d = new SimpleDate("4/15/2007");
		Assert.assertEquals(105, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T9() {
		SimpleDate d = new SimpleDate("5/15/2007");
		Assert.assertEquals(135, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T10() {
		SimpleDate d = new SimpleDate("6/15/2007");
		Assert.assertEquals(166, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T11() {
		SimpleDate d = new SimpleDate("7/15/2007");
		Assert.assertEquals(196, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T12() {
		SimpleDate d = new SimpleDate("8/15/2007");
		Assert.assertEquals(227, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T13() {
		SimpleDate d = new SimpleDate("9/15/2007");
		Assert.assertEquals(258, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T14() {
		SimpleDate d = new SimpleDate("10/15/2007");
		Assert.assertEquals(288, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T15() {
		SimpleDate d = new SimpleDate("11/15/2007");
		Assert.assertEquals(319, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T16() {
		SimpleDate d = new SimpleDate("12/1/2007");
		Assert.assertEquals(335, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T17() {
		SimpleDate d = new SimpleDate("12/31/2007");
		Assert.assertEquals(365, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T18() {
		SimpleDate d = new SimpleDate("1/1/2008");
		Assert.assertEquals(1, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T19() {
		SimpleDate d = new SimpleDate("1/2/2008");
		Assert.assertEquals(2, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T20() {
		SimpleDate d = new SimpleDate("1/31/2008");
		Assert.assertEquals(31, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T21() {
		SimpleDate d = new SimpleDate("2/1/2008");
		Assert.assertEquals(32, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T22() {
		SimpleDate d = new SimpleDate("2/28/2008");
		Assert.assertEquals(59, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T23() {
		SimpleDate d = new SimpleDate("3/1/2008");
		Assert.assertEquals(61, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T24() {
		SimpleDate d = new SimpleDate("3/31/2008");
		Assert.assertEquals(91, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T25() {
		SimpleDate d = new SimpleDate("4/15/2008");
		Assert.assertEquals(106, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T26() {
		SimpleDate d = new SimpleDate("5/15/2008");
		Assert.assertEquals(136, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T27() {
		SimpleDate d = new SimpleDate("6/15/2008");
		Assert.assertEquals(167, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T28() {
		SimpleDate d = new SimpleDate("7/15/2008");
		Assert.assertEquals(197, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T29() {
		SimpleDate d = new SimpleDate("8/15/2008");
		Assert.assertEquals(228, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T30() {
		SimpleDate d = new SimpleDate("9/15/2008");
		Assert.assertEquals(259, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T31() {
		SimpleDate d = new SimpleDate("10/15/2008");
		Assert.assertEquals(289, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T32() {
		SimpleDate d = new SimpleDate("11/15/2008");
		Assert.assertEquals(320, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T33() {
		SimpleDate d = new SimpleDate("12/1/2008");
		Assert.assertEquals(336, d.ordinalDate());
	}
	
	@Test
	public void testOrdinalDate_T34() {
		SimpleDate d = new SimpleDate("12/31/2008");
		Assert.assertEquals(366, d.ordinalDate());
	}
	
	// Unit tests for toString() method
	
	@Test
	public void testToString_T1() {
		SimpleDate date = new SimpleDate("1/28/2011");
		Assert.assertEquals("1/28/2011", date.toString());
	}
	
	@Test
	public void testToString_T2() {
		SimpleDate date = new SimpleDate("10/28/2011");
		Assert.assertEquals("10/28/2011", date.toString());
	}
	
	@Test
	public void testToString_T3() {
		SimpleDate date = new SimpleDate("12/2/2011");
		Assert.assertEquals("12/2/2011", date.toString());
	}	
	
	@Test
	public void testToString_T4() {
		SimpleDate date = new SimpleDate("1/2/2011");
		Assert.assertEquals("1/2/2011", date.toString());
	}
	
	@Test
	public void testSetGetMinTwoDigitYear() {
		SimpleDate.setMinTwoDigitYear(1972);
		Assert.assertEquals(1972, SimpleDate.getMinTwoDigitYear());
	}

	@Ignore
	@Test
	public void testTwoDigitYearToConstructor_T1() {
		SimpleDate.setMinTwoDigitYear(1930);
		SimpleDate d = new SimpleDate("1/1/29");
		Assert.assertEquals(1, d.getMonth());
		Assert.assertEquals(1, d.getDay());
		Assert.assertEquals(2029, d.getYear());
	}
	
	@Ignore
	@Test
	public void testTwoDigitYearToConstructor_T2() {
		SimpleDate.setMinTwoDigitYear(1930);
		SimpleDate d = new SimpleDate("1/1/30");
		Assert.assertEquals(1, d.getMonth());
		Assert.assertEquals(1, d.getDay());
		Assert.assertEquals(1930, d.getYear());
	}
	
	@Ignore
	@Test
	public void testTwoDigitYearToConstructor_T3() {
		SimpleDate.setMinTwoDigitYear(1930);
		SimpleDate d = new SimpleDate("1/1/05");
		Assert.assertEquals(1, d.getMonth());
		Assert.assertEquals(1, d.getDay());
		Assert.assertEquals(2005, d.getYear());
	}
	
	@Ignore
	@Test
	public void testTwoDigitYearToConstructor_T4() {
		SimpleDate.setMinTwoDigitYear(1930);
		SimpleDate d = new SimpleDate("1/1/95");
		Assert.assertEquals(1, d.getMonth());
		Assert.assertEquals(1, d.getDay());
		Assert.assertEquals(1995, d.getYear());
	}
	
	@Ignore
	@Test
	public void testTwoDigitYearToConstructor_T5() {
		SimpleDate.setMinTwoDigitYear(1930);
		SimpleDate d = new SimpleDate("1/1/00");
		Assert.assertEquals(1, d.getMonth());
		Assert.assertEquals(1, d.getDay());
		Assert.assertEquals(2000, d.getYear());
	}
	
	/**
	 * This allows you to run this JUnit test from the command line.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main(SimpleDateTest.class
				.getName());
	}
}