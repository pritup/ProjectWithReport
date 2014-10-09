package Module1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DriverClass 
{
@Test
public static void testt() throws Throwable
{
	String Path=System.getProperty("user.dir")+"\\src\\HTML_REPORTS\\Cant_access_Act.htm";
	String Path1=System.getProperty("user.dir")+"\\src\\HTML_REPORTS\\Login.htm";
	
	Reporter.log("<body style="+"background-color:LemonChiffon"+">");
	Reporter.log("<div align="+ "center"+"><h2>Batch Execution for LOGIN Module</h2></div>");
	Reporter.log("<Table border="+"1"+" bordercolor="+"BLACK"+">" );
			
	Cant_Access_Account.TestCantaccessaccount();
	Thread.sleep(2000);
	Reporter.log("<td><h4>(1)Execution Result for 'Can't Access Account' Class-</td><td><a href="+Path+">Detailed Result</a></td></h4>");

	LoginModule.LoginTestCase();
	Thread.sleep(2000);
	Reporter.log("<td><h4>(1)Execution Result for 'Login' Class-</td><td><a href="+Path1+">Detailed Result</a></td></h4>");
	
	
	
}
}
