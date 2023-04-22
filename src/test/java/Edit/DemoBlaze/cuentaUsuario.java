package Edit.DemoBlaze;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cuentaUsuario {
	
	// Atributos
	String url = "https://petstore.octoperf.com/actions/Catalog.action";
	WebDriver driver;
	
	
	// Métodos
	@Test
	public void comprarProducto() {
		
		// 1. Abrir el navegador en la página de DemoBlaze
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		// 2. Ir a la sección de "Sign In"
		WebElement linkSignIn = driver.findElement(By.linkText("Sign In"));
		linkSignIn.click();
		
		
		// 3. Hacer click en "Register Now!"
		WebElement linkRegister = driver.findElement(By.linkText("Register Now!"));
		linkRegister.click();
		
		
		// 4. Completar el formulario de registro
		// Información de usuario
		// ID Usuario
		WebElement txtIdUser = driver.findElement(By.name("username"));
		txtIdUser.sendKeys("09");
		
		// Contraseña
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("test09");
		
		// Confirmar contraseña
		WebElement txtPassword2 = driver.findElement(By.name("repeatedPassword"));
		txtPassword2.sendKeys("test09");
		
		// Información de la cuenta
		// Nombre
		WebElement txtName = driver.findElement(By.name("account.firstName"));
		txtName.sendKeys("Maria");
		
		// Apellido
		WebElement txtLastname = driver.findElement(By.name("account.lastName"));
		txtLastname.sendKeys("Gutierrez");
		
		// Email
		WebElement txtEmail = driver.findElement(By.name("account.email"));
		txtEmail.sendKeys("maria@test.com");
		
		// Teléfono
		WebElement txtPhone = driver.findElement(By.name("account.phone"));
		txtPhone.sendKeys("4567892");
		
		// Dirección 1
		WebElement txtAddress = driver.findElement(By.name("account.address1"));
		txtAddress.sendKeys("Santa Fe 990");
		
		// Dirección 2
		WebElement txtAddress2 = driver.findElement(By.name("account.address2"));
		txtAddress2.sendKeys("Santa Fe 970");
		
		// Ciudad
		WebElement txtCity = driver.findElement(By.name("account.city"));
		txtCity.sendKeys("Tandil");
		
		// Estado
		WebElement txtState = driver.findElement(By.name("account.state"));
		txtState.sendKeys("Buenos Aires");
		
		// Código postal
		WebElement txtCode = driver.findElement(By.name("account.zip"));
		txtCode.sendKeys("7000");
		
		// País
		WebElement txtCountry = driver.findElement(By.name("account.country"));
		txtCountry.sendKeys("Argentina");
		
		// Información de perfil
		// Categoría favorita
		Select selCategory = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		selCategory.selectByVisibleText("DOGS");
		
		
		// 5. Hacer click en el checkbox MyList
		WebElement checkMyList = driver.findElement(By.name("account.listOption"));
		checkMyList.click();
		
		
		// 6. Hacer click en e checkbox MyBanner
		WebElement checkMyBanner = driver.findElement(By.name("account.bannerOption"));
		checkMyBanner.click();
		
		
		// 7. Hacer click en el botón "Save Account Information"
		WebElement btnSave = driver.findElement(By.name("newAccount"));
		btnSave.click();
		
		
		// 8. Cerrar el navegador
		driver.close();
		
		
		
		
		
	}
	
	
	
	

}
