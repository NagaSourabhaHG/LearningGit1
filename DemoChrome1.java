package launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChrome1 {

	public static void main(String[] args) {
		//set the driverExecutable before opening the browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//open the Chrome browser
		ChromeDriver driver=new ChromeDriver();

	}

}
