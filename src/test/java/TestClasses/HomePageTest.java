package TestClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.POM.HomePage_POM;
import Com.Utility.BaseClass;

public class HomePageTest extends BaseClass {
//	public HomePageTest(WebDriver driver) {
//		super(driver);
//		// TODO Auto-generated constructor stub
	
	WebDriverWait wait;


	@Test
	public void clickonhome() throws InterruptedException {
		

		HomePage_POM hp=new HomePage_POM(driver);
        hp.homebtn();
        wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button']//a)[8]")));
        JavascriptExecutor   j  =  (JavascriptExecutor)driver;
        j.executeScript("window.scrollBy(0,200)");
        Thread.sleep(5000);
        hp.Click_on_videos_Viewmore();
        System.out.println("Clicked on videos view more");
//        String title=driver.getCurrentUrl();
//        System.out.println("page tile is "+title);
//        Assert.assertEquals(title, "https://csbc.consisty.com/video_gallery");
//        hp.homebtn();
//        JavascriptExecutor   js  =  (JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,500)");
//        wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button']//a)[9]")));
//    
//        
//        hp.Click_on_VIP_Photosvsmore();
//        System.out.println("Clicked on videos view more");
//
//
//
//        hp.homebtn();
//        JavascriptExecutor   jss  =  (JavascriptExecutor)driver;
//        jss.executeScript("window.scrollBy(0,800)");
//        wait=new WebDriverWait(driver,Duration.ofSeconds(7));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button']//a)[10]")));
//        
//        
//        hp.Click_on_EventImages_Viewmore();
//        System.out.println("Clicked on videos view more");
//
// 
//
//        
//    }
//

	}


}
