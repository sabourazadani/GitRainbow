Public class TestBrowser{

    System.setProperty("webdriver.chrome.driver", "chromedriver");

        ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com/");

		driver.close()
}