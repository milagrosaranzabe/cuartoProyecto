package Edit.DemoBlaze;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class inicioSesion {
	
	// Atributos
	String url = "https://petstore.octoperf.com/actions/Catalog.action";
	WebDriver driver;
	
	
	// Métodos
	@Test
	public void iniciarSesion() {
		
		// 1. Abrir el navegador en la página de DemoBlaze
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		// 2. Hacer click en la sección "Sign In"
		WebElement linkSignIn = driver.findElement(By.linkText("Sign In"));
		linkSignIn.click();
		
		
		// 3. Completar el formulario de Login
		// Usuario
		WebElement txtUsername = driver.findElement(By.name("username"));
		txtUsername.sendKeys("maria@test.com");
		
		// Contraseña
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("test09");
		
		
		// 4. Hacer click en el botón "Login"
		WebElement btnLogin = driver.findElement(By.name("signon"));
		btnLogin.click();
		
		
		// 5. Cerrar el navegador
		driver.close();
	}
		

}
