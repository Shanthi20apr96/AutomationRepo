package seleniumbasics;

public class BrowserAndNavigationCommands extends Base {
	public void verifyBrowserCommands() {
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String handleID = driver.getWindowHandle();
		System.out.println(handleID);
		String source = driver.getPageSource();
		System.out.println(source);
	}
	public void verifyNavigationCommands() {
		driver.navigate().to("https://www.amazon.ae/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserAndNavigationCommands browser = new BrowserAndNavigationCommands();
		browser.browserLaunch();
		//browser.verifyBrowserCommands();
		browser.verifyNavigationCommands();
		
	}

}
