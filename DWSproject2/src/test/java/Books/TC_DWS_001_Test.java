package Books;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.tyss.genericutility.Baseclass;
import com.tyss.objectrepository.BooksPage;
import com.tyss.objectrepository.HomePage;



public class TC_DWS_001_Test extends Baseclass{
	
	@Test
	public void booksTest() throws EncryptedDocumentException, IOException {
		
		BooksPage bp=new BooksPage(driver);
		
		String expect = eu.getDataFromExcel("BOOKS",1, 0);
		hp=new HomePage(driver);
		hp.getBOOKS_link().click();
		Assert.assertEquals(driver.getTitle(),expect,"not navigate to books page");
		
		test.log(Status.PASS,"navigate to books page");
		
		boolean msg = bp.getBooks_page_msg().isDisplayed();
		Assert.assertEquals(msg,true,"books page is not displayed");
		test.log(Status.PASS,"books page navigated succefully ");
		
		
		WebElement drop_down = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		
		Select sel=new Select(drop_down);
		sel.selectByVisibleText("Name: A to Z");
		
		
		
		
		
		
	
		
		
		
	}
}
