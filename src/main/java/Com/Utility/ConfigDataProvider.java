package Com.Utility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
  Properties pro;
	
	public ConfigDataProvider() throws Exception{
		String path = ".\\Config\\Config.Properties";
		
		FileInputStream file = new FileInputStream(path);
	    pro = new Properties();
		pro.load(file);
		
		
	}
	public String getBaseUrl() {
		return pro.getProperty("Url");
		
	}
	
}
