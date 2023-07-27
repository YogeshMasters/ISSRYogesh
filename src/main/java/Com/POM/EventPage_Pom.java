package Com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventPage_Pom {
	
	
	
    
    @FindBy (xpath ="//a [text()='EVENT']")
    private WebElement Event_Tab;
    
    
    @FindBy (xpath = "//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[1]/div/form/div/div[1]/div/div/div/button ")
    private WebElement FirstCalender_Logo;
    
    
    @FindBy (xpath = "//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[1]/div/form/div/div[2]/div/div/div/button")
    private WebElement SecondCalender_Logo;
    
    
    @FindBy (xpath = "//input[@id=':r2:']")
    private WebElement SearchEvent_Tab;
    
    
    
    @FindBy (xpath = "//button[@id=':r3:' ]")
    private WebElement Search_Button;

    public EventPage_Pom(WebDriver driver) {
		PageFactory.initElements(driver,this);
    }
    
    public void Click_Event() {
        
        Event_Tab.click();
    }
   
    //public void Click_FromDate() {
     // FromDate_Tab.click();
    //}
    
    public void Click_FirstCalenderLogo() {
        
        FirstCalender_Logo.click();
    }
    
    //public void Click_ToDate() {
        //ToDate_Tab.click();
    //}
    
    public void Click_SecondCalender() {
        
        SecondCalender_Logo.click();
    }
    
    public void SendKeys_SearchEvent() {
        
        SearchEvent_Tab.sendKeys("Recent Event");
        
    }
    
public void Click_SearchButton() {
        
        Search_Button.click();
    }
	

}
