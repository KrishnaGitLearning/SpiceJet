package PagesSpiceJet;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import UtilsSpiceJet.UtilsClass;

public class PageClass extends UtilsClass {
	
	
	@FindBy(xpath = "//textarea[@id = 'APjFqb']")
	WebElement googleSearch;
	@FindBy(xpath = "(//h3[@class = 'LC20lb MBeuO DKV0Md'])[1]")
	WebElement firstlink;
	@FindBy(xpath = "(//input[@value = 'Google Search'])[1]")
	WebElement search;
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[2]")
	WebElement signup;
	@FindBy(xpath = "//select[@class='form-control form-select ']")
	WebElement salutation;
	@FindBy(xpath = "//input [@id='first_name']")
	WebElement firstName;
	@FindBy(xpath = "//input [@id='last_name']")
	WebElement lastName;
	@FindBy(xpath = "//select[@class='form-control form-select']")
	WebElement country;
	@FindBy(xpath = "//img[@class='d-inline-block datepicker']")
	WebElement dateofBirth;
	
	@FindBy(xpath = "//select[@class='react-datepicker__month-select']")
	WebElement dateofBirthbox;
	@FindBy(xpath = "//select[@class='react-datepicker__year-select']")
	WebElement dateofBirthYear;
	@FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--007']")
	WebElement dateofBirthDay;
	
	@FindBy(xpath = "//input[@class=' form-control']")
	WebElement mNumber;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[2]/input[1]")
	WebElement emailID;
	@FindBy(xpath = "//input[@id='new-password']")
	WebElement newPassword;
	@FindBy(xpath = "//input[@id='c-password']")
	WebElement confirmPassword;
	@FindBy(xpath = "//input[@id='defaultCheck1']")
	WebElement checkBox;
	
	@FindBy(xpath = "//button[@class='btn btn-red']")
	WebElement submit;
	@FindBy(css = ".modal-open")
	WebElement beforeEmail;
	
	@FindBy(xpath = "(//div[@class = 'css-76zvg2 r-jwli3a r-ubezar'])[1]")
	WebElement login;
	
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[1]")
	WebElement loginMobile;
	
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[2]")
	WebElement loginPassword;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement loginsubmit;
	
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement from;
	
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement to;
	
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'])[30]")
	WebElement DepDate;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]")
	WebElement DepDateclick;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[4]")
	WebElement retDateclick;
	
	
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-k8qxaj'])[1]")
	WebElement calenderClick;
	
	
	@FindBy(xpath = "//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")
	WebElement june;
	
	@FindBy(xpath = "(//div[@dir='auto'][normalize-space()='28'])[1]")
	WebElement june28;
	
	@FindBy(xpath = "//div[@class='r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-1i6wzkk r-lrvibr r-184en5c css-1dbjc4n']")
	WebElement next;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1niwhzg r-z2wwpe r-17b9qp5 r-1g94qm0 r-h3f8nf r-u8s1d r-u3yave r-8fdsdq\']")
	WebElement calenderWindow;
	
	@FindBy(xpath = "(//div[@class= 'css-1dbjc4n r-zso239'])[2]")
	WebElement roundTrip;
	
	@FindBy(xpath = "(//div[@dir='auto'][normalize-space()='30'])[1]")
	WebElement june30;
	
	@FindBy(xpath = "(//div[@dir='auto'][normalize-space()='30'])[1]")
	WebElement passengerDropDown;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[6]")
	WebElement currencyDropdown;
	
	@FindBy(xpath = "//div[@class='css-76zvg2 r-homxoj r-ubezar'][normalize-space()='INR']")
	WebElement INR;
	
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa'])[4]")
	WebElement student;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement searchFlight;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[2]")
	WebElement check;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement continueOption;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-f9v2oj r-1a852e4 r-1609sg0 r-1pcd2l5 r-1mdbw0j r-hnxvie']")
	WebElement popupWindow;
	
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-1x35g6 r-1kfrs79 r-15d164r r-38x2cy'][contains(text(),'Unfortunately, there are no flights available for ')])[2]")
	WebElement message;
	
	@FindBy(xpath = "(//div[@dir='auto'][normalize-space()='1'])[2]")
	WebElement JulyOne;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[4]")
	WebElement studentCheckbox;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement studentContinue;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
	WebElement bookingContinue;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement FirstName;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement lName;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement mobileNumber;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement emailIDBooking;
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement city;
	
	@FindBy(xpath = "(//*[name()='rect'])[3]")
	WebElement checkBoxBooking;
	
	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement firstNamebooking;
	
	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement lastNamebooking;
	
	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement mobileBooking;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-15d164r'])[2]")
	WebElement highPrice;
	
	@FindBy(css = ".r-d9fdf6:nth-child(2)")
	WebElement continueBooking;
	
	@FindBy(id = "skipfrompopup")
	WebElement bookNow;
	
	//@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[3]")
	//WebElement continueBookingNext;
	
	@FindBy(css = ".r-z2wwpe:nth-child(4)")
	WebElement continueBookingNext;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep r-1mdbw0j r-oyd9sg']")
	WebElement totalAmount;
	
	@FindBy(xpath = "(//div[@id='payment_form_card_name_error'])[1]")
	WebElement creditCard;
	@FindBy(xpath = "(//div[@id='payment_form_card_name_error'])[1]")
	WebElement cardName;
	@FindBy(id = "card_exp_month")
	WebElement month;
	@FindBy(id = "card_exp_year")
	WebElement year;
	@FindBy(id = "security_code")
	WebElement cvv;
	@FindBy(css = ".r-un1frt:nth-child(1)")
	WebElement proceedTOPay;
	
	@FindBy(xpath = "//iframe[@name='card_number_iframe_LCfVOVTrBYqeRNZ5']")
	WebElement frameOne;
	
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa'])[1]")
	WebElement checkInstatus;
	@FindBy(xpath = "(//input[@placeholder='e.g. W3X3H8'])[1]")
	WebElement PNR;
	@FindBy(xpath = "(//input[@placeholder='john.doe@spicejet.com'])[1]")
	WebElement PNReMail;
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu'])[1]")
	WebElement PNRsubmit;
	
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa'])[2]")
	WebElement flightStatusIcon;
	
	@FindBy(xpath = "(//*[name()='svg'][@data-testid='svg-img'])[10]")
	WebElement flightStatusdropdown;
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-qsz3a2 r-18tvxmy r-1i10wst r-1kfrs79'])[3]")
	WebElement flightStatusday;
			
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement flightStatusOrigin;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement flightStatusDest;
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu'])[1]")
	WebElement flightStatusOriginSubmit;
	
	@FindBy(xpath = "(//div[contains(text(),'manage booking')])[1]")
	WebElement flightManageBooking;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-18u37iz r-1ifxtd0 r-6ity3w']//div[2]//div[2]")
	WebElement manageBooking;
	
	@FindBy(xpath = "//input[@placeholder='john.doe@spicejet.com / Doe']")
	WebElement manageBookingEmail;
	
	
	
			
	public PageClass() {

		PageFactory.initElements(driver, this);

	}

	//testcase002
	public void spiceWebSiteLaunch() {
		
		googleSearch.sendKeys("spicejet");
		clickElement(search);
		clickElement(firstlink);
		
	}
	
	//testCase003
	public void spiceJetSignup(String fname, String lName, String mobile, String eMail, String nPassword, String cPassword) throws Exception {
		
		googleSearch.sendKeys("spicejet");
		clickElement(search);
		clickElement(firstlink);
		clickElement(signup);
		String pAddress = driver.getWindowHandle();
		Set<String> openWindows = driver.getWindowHandles();
		System.out.println("No of Windows Opened : " + openWindows.size());
		for (String cWindow : openWindows) {
			if (!cWindow.equals(pAddress)) {
				System.out.println("SWitching to the new window of address : " + cWindow);
				driver.switchTo().window(cWindow);
				break;
			}
		}
		Select sel = new Select(salutation);
		sel.selectByIndex(1);
		Thread.sleep(5000);
		this.firstName.sendKeys(fname);
		this.lastName.sendKeys(lName);
		Select sela = new Select(country);
		sela.selectByVisibleText("India");
		clickElement(dateofBirth);
		Select selb= new Select(dateofBirthbox);
		selb.selectByVisibleText("May");
		Select selc = new Select(dateofBirthYear);
		selc.selectByVisibleText("1991");
		clickElement(dateofBirthDay);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		this.mNumber.sendKeys(mobile);
		//clickElement(beforeEmail);
		waitforme(emailID);
		clickElement(emailID);
		this.emailID.sendKeys(eMail);
		waitforme(newPassword);
		clickElement(newPassword);
		this.newPassword.sendKeys(nPassword);
		waitforme(confirmPassword);
		clickElement(confirmPassword);
		this.confirmPassword.sendKeys(cPassword);
		clickElement(checkBox);
		//clickElement(submit);
		
	}
		//testCase004
		public void dummyLogin(String mobileNumber, String lPassword) throws Exception {
		
		
		googleSearch.sendKeys("spicejet");
		clickElement(search);
		clickElement(firstlink);
		clickElement(login);
		String pAddress = driver.getWindowHandle();
		Set<String> openWindows = driver.getWindowHandles();
		System.out.println("No of Windows Opened : " + openWindows.size());
		for (String cWindow : openWindows) {
			if (!cWindow.equals(pAddress)) {
				System.out.println("SWitching to the new window of address : " + cWindow);
				driver.switchTo().window(cWindow);
				break;
			}
		}
		
		Thread.sleep(5000);
		this.loginMobile.sendKeys(mobileNumber);
		this.loginPassword.sendKeys(lPassword);
		clickElement(loginsubmit);
	}
		
		//5.Write code to search for flights by entering dummy origin and destination information for below types of trips:
		
			public void oneWay(String fromPlace, String toPlace) throws Exception {
			
			googleSearch.sendKeys("spicejet");
			clickElement(search);
			clickElement(firstlink);
			this.from.sendKeys(fromPlace);
			this.to.sendKeys(toPlace);
			//Thread.sleep(5000);
			clickElement(DepDateclick);
			String cDate = DepDateclick.getText();
			System.out.println(cDate);
			Thread.sleep(3000);
			
			clickElement(DepDateclick);
			Actions dDate = new Actions(driver);
			dDate.moveToElement(calenderWindow);
			clickElement(JulyOne);
			Thread.sleep(3000);
			clickElement(DepDateclick);
			String cDateselected = DepDateclick.getText();
			System.out.println(cDateselected);
			
			clickElement(passengerDropDown);
			clickElement(currencyDropdown);
			clickElement(INR);
			//clickElement(student);
			clickElement(searchFlight);
			//clickElement(popupWindow);
			//clickElement(check);
			//clickElement(continueOption);
			Thread.sleep(5000);
			Screenshot(driver, "C:\\Users\\krishnamoorthy.kasi\\OneDrive - SoftwareONE\\Desktop\\Selenium Original\\SpiceJet\\ScreenshotSpiceJet.jpg");
			
			
			//clickElement(next);
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("window.scrollBy(0,200)", "");
			
			//clickElement(june28);
			
			
			
			/*
			List<WebElement>date = driver.findElements(By.xpath("(//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div"));
			
			for(int i=0; i<date.size(); i++) {
				
				
				String value = date.get(i).getText();
				if(value.equalsIgnoreCase("30")) {
					
					date.get(i).click();
					break;
				}
				
			}
			*/
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("window.scrollBy(0,500)", "");
			//Select dDate = new Select(DepDate);
			//dDate.selectByVisibleText("Fri, 23 Jun 2023");
			
			
			
			//Actions dDate = new Actions(DepDate);
			//dDate.selectByVisibleText("Wed, 28 Jun 2023");
			
			
			
		}
			
			
			//5.Write code to search for flights by entering dummy origin and destination information for below types of trips:
			
			//b.Round Trip
			
			public void roundtrip(String fromPlace, String toPlace) throws Exception {
			
				googleSearch.sendKeys("spicejet");
				clickElement(search);
				clickElement(firstlink);
				clickElement(roundTrip);
				this.from.sendKeys(fromPlace);
				this.to.sendKeys(toPlace);
				//Thread.sleep(5000);
				clickElement(DepDateclick);
				String cDate = DepDateclick.getText();
				System.out.println(cDate);
				Thread.sleep(3000);
				
				clickElement(DepDateclick);
				Actions dDate = new Actions(driver);
				dDate.moveToElement(calenderWindow);
				clickElement(june28);
				Thread.sleep(3000);
				clickElement(DepDateclick);
				String cDateselected = DepDateclick.getText();
				System.out.println(cDateselected);
			
				clickElement(retDateclick);
				Actions rDate = new Actions(driver);
				rDate.moveToElement(calenderWindow);
				clickElement(june30);
				Thread.sleep(3000);
				clickElement(retDateclick);
				String rDateselected = retDateclick.getText();
				System.out.println(rDateselected);
				Thread.sleep(5000);
				clickElement(passengerDropDown);
				clickElement(currencyDropdown);
				clickElement(INR);
				clickElement(student);
				clickElement(searchFlight);
				clickElement(popupWindow);
				clickElement(check);
				clickElement(continueOption);
				String mes = message.getText();
				System.out.println(mes);
			}	
			
			//6.	Write code to select a flight and proceed to the booking page.
			
			public void selectFlight(String fromPlace, String toPlace) throws Exception {
				
				googleSearch.sendKeys("spicejet");
				clickElement(search);
				clickElement(firstlink);
				this.from.sendKeys(fromPlace);
				this.to.sendKeys(toPlace);
				//Thread.sleep(5000);
				clickElement(DepDateclick);
				String cDate = DepDateclick.getText();
				System.out.println(cDate);
				Thread.sleep(3000);
				
				clickElement(DepDateclick);
				Actions dDate = new Actions(driver);
				dDate.moveToElement(calenderWindow);
				clickElement(JulyOne);
				
				//clickElement(DepDateclick);
				//String cDateselected = DepDateclick.getText();
				//System.out.println(cDateselected);
			
				/*
				clickElement(retDateclick);
				 
				Actions rDate = new Actions(driver);
				rDate.moveToElement(calenderWindow);
				clickElement(june30);
				Thread.sleep(3000);
				clickElement(retDateclick);
				String rDateselected = retDateclick.getText();
				System.out.println(rDateselected);
				*/
				
				Thread.sleep(5000);
				clickElement(passengerDropDown);
				clickElement(currencyDropdown);
				clickElement(INR);
				//clickElement(student);
				clickElement(searchFlight);
				//clickElement(popupWindow);
				//clickElement(studentCheckbox);
				//clickElement(studentContinue);
				clickElement(bookingContinue);
				
				
				
				
			}
			
			public void dummyBKG(String fromPlace, String toPlace, String fname, String Lname, String mNumber, String eID, String city) throws Exception {
				
				//String cCard, String cName, String cMonth, String cYear, String cCVV
				googleSearch.sendKeys("spicejet");
				clickElement(search);
				clickElement(firstlink);
				this.from.sendKeys(fromPlace);
				this.to.sendKeys(toPlace);
				clickElement(DepDateclick);
				String cDate = DepDateclick.getText();
				System.out.println(cDate);
				Thread.sleep(3000);
				
				clickElement(DepDateclick);
				Actions dDate = new Actions(driver);
				dDate.moveToElement(calenderWindow);
				clickElement(JulyOne);
				
				
				
				Thread.sleep(5000);
				clickElement(currencyDropdown);
				clickElement(INR);
				clickElement(searchFlight);
				
				clickElement(bookingContinue);
				Thread.sleep(5000);
				this.FirstName.sendKeys(fname);
				this.lName.sendKeys(Lname);
				this.mobileNumber.sendKeys(mNumber);
				this.emailIDBooking.sendKeys(eID);
				this.city.sendKeys(city);
				clickElement(checkBoxBooking);
				Thread.sleep(5000);
				driver.switchTo().defaultContent();
				waitforme(continueBooking);
				clickElement(continueBooking);
				Thread.sleep(5000);
				clickElement(continueBookingNext);
				clickElement(bookNow);
				clickElement(continueBookingNext);
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz'])[11]")).click();
			
				driver.findElement(By.xpath("(//div[@data-focusable='true'])[61]")).click();
				driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")).click();
				driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-ymttw5 r-5njf8e r-1otgn73'])[1]")).click();
				driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-poiln3'])[1]")).sendKeys("krishna8000");
				driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[1]")).click();
				Thread.sleep(2000);
				String errorMSG= driver.findElement(By.xpath("(//div[contains(text(),'Failed to verify VPA.')])[1]")).getText();
				System.out.println(errorMSG);
				
			}
			
			
			public void status(String pNRnum, String pNRemailaddress) throws Exception {
				
				googleSearch.sendKeys("spicejet");
				clickElement(search);
				clickElement(firstlink);
				waitforme(checkInstatus);
				clickElement(checkInstatus);
				this.PNR.sendKeys(pNRnum);
				this.PNReMail.sendKeys(pNRemailaddress);
				clickElement(PNRsubmit);
				Thread.sleep(3000);
				String errorMSg = driver.findElement(By.xpath("//div[@class='css-76zvg2 css-cens5h r-jwli3a']")).getText();
				System.out.println(errorMSg);
				Screenshot(driver, "C:\\Users\\krishnamoorthy.kasi\\OneDrive - SoftwareONE\\Desktop\\Selenium Original\\SpiceJet\\ScreenshotSpiceJet.jpg");
				
			}
			
			public void flightStatus(String start, String drop) throws Exception {
				
				
				googleSearch.sendKeys("spicejet");
				clickElement(search);
				clickElement(firstlink);
				waitforme(flightStatusIcon);
				clickElement(flightStatusIcon);
				clickElement(flightStatusdropdown);
				clickElement(flightStatusday);
				waitforme(flightStatusOrigin);
				this.flightStatusOrigin.sendKeys(start);
				waitforme(flightStatusDest);
				this.flightStatusDest.sendKeys(drop);
				waitforme(flightStatusOriginSubmit);
				clickElement(flightStatusOriginSubmit);
				Thread.sleep(3000);
				Screenshot(driver, "C:\\Users\\krishnamoorthy.kasi\\OneDrive - SoftwareONE\\Desktop\\Selenium Original\\SpiceJet\\ScreenshotSpiceJet.jpg");
				
				
			}
				
			
				public void manageBooking(String pNRnum, String pNRemailaddress) throws Exception {
				
				googleSearch.sendKeys("spicejet");
				clickElement(search);
				clickElement(firstlink);
				waitforme(flightManageBooking);
				clickElement(flightManageBooking);
				this.PNR.sendKeys(pNRnum);
				this.manageBookingEmail.sendKeys(pNRemailaddress);
				clickElement(PNRsubmit);
				Thread.sleep(3000);
				Screenshot(driver, "C:\\Users\\krishnamoorthy.kasi\\OneDrive - SoftwareONE\\Desktop\\Selenium Original\\SpiceJet\\ScreenshotSpiceJet.jpg");
				
			}
			
			
}
