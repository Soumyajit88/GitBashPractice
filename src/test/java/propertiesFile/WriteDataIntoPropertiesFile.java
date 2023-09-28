package propertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class WriteDataIntoPropertiesFile {

	public static void main(String[] args) throws Throwable {
		
		Properties prop=new Properties();
		prop.setProperty("browser","chrome");
		prop.setProperty("username", "admin");
		prop.setProperty("password", "root");
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Gitbash.properties");
		prop.store(fos, "Property file data");
		
		FileInputStream fis=new FileInputStream("./src/test/resources/Gitbash.properties");
		prop.load(fis);
		String browser=prop.getProperty("browser");
		System.out.println(browser);
	}

}
