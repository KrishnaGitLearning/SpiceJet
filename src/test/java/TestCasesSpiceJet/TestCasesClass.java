package TestCasesSpiceJet;

import org.testng.annotations.Test;

import BaseSpiceJet.BaseClass;
import PagesSpiceJet.PageClass;

public class TestCasesClass extends BaseClass{
	
	
	@Test
	public void TestCase001() throws Exception {
		
	// 2.Write code to open a web browser and navigate to the SpiceJet flight booking system (https://www.spicejet.com/).
		
		PageClass spiceJet = new PageClass();
		spiceJet.spiceWebSiteLaunch();
		
		
		
	}
	
	//3.Validate the Sign-Up Page by filling out Mandatory and Non-Mandatory Fields.
	
	@Test
	public void TestCase003() throws Exception {
		
		PageClass signupoperation = new PageClass();
		signupoperation.spiceJetSignup("Krishnamoorthy", "Kasi", "9790018837", "Krishnaseven@hotmail.com", "SpiceJet@guvi123", "SpiceJet@guvi123");
		
		
	}
	
	//4.	Write a code to Login with dummy email ID and Password on Popup fields after clicking Login button on top of the page.
	
	@Test
	public void TestCase004() throws Exception {
		
		PageClass dummy = new PageClass();
		dummy.dummyLogin("9790018837", "SpiceJet@guvi123");
		
	}
	
	//5.	Write code to search for flights by entering dummy origin and destination information for below types of trips:
	// One Trip
	@Test
	public void TestCase005() throws Exception {
		
		PageClass oneWayTrip = new PageClass();
		oneWayTrip.oneWay("MAA", "DEL");
		
		
	}
	
	//b.	Round Trip
	
	@Test
	public void TestCase005B() throws Exception {
		
		PageClass roundTrip = new PageClass();
		roundTrip.roundtrip("MAA", "BLR");
		
		
	}
	
	//6.	Write code to select a flight and proceed to the booking page.
	
	@Test
	public void TestCase006() throws Exception {
		
		PageClass flight = new PageClass();
		flight.selectFlight("MAA", "DEL");
		
		
	}
	
	
	//7 .	Write code to fill out the booking form with dummy passenger and payment information.
	//8 . 	Write code to verify that the booking was successful by checking the resulting web page for the booking confirmation message.

	
	@Test
	public void TestCase007() throws Exception {
		
		PageClass dummyBooking = new PageClass();
		dummyBooking.dummyBKG("MAA", "DEL", "Krishnamoorthy", "Kasi", "9790018837", "Krishnaseven@hotmail.com", "Chennai");
		
		
	}
	
	
	//9. Write a code to validate below fields available on booking page

	//Check-in

	@Test
	public void TestCase009() throws Exception {
		
		PageClass checkInStatus = new PageClass();
		checkInStatus.status("P52DKC", "Krishnaseven@hotmail.com");
		
	}
	
	//Flight status

	@Test
	public void TestCase009B() throws Exception {
		
		PageClass flightstat = new PageClass();
		flightstat.flightStatus("MAA", "DEL");
		
	}
	
	//Manage Booking

	@Test
	public void TestCase009C() throws Exception {
		
		PageClass mBooking = new PageClass();
		mBooking.manageBooking("P52DKC", "Krishnaseven@hotmail.com");
		
		
	}
	
	
}
