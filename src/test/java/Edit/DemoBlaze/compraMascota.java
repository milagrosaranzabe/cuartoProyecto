package Edit.DemoBlaze;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class compraMascota {
	// Atributos
	String url = "https://petstore.octoperf.com/actions/Catalog.action";
	WebDriver driver;

	// Métodos
	@Test
	public void comprarMascota() {

		// 1. Abrir el navegador en la página de DemoBlaze
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();


		// 2. Ir a la sección de "Dogs"
		WebElement linkDogs = driver.findElement(By.xpath(" //body/div[@id='Header']/div[@id='QuickLinks']/a[2]"));
		linkDogs.click();

		// 3. Seleccionar la raza de perro
		WebElement linkGolden = driver.findElement(By.linkText("K9-RT-01"));
		linkGolden.click();

		// 4. Agregar el perro al carrito
		WebElement btnAddCart = driver.findElement(By.linkText("Add to Cart"));
		btnAddCart.click();

		// 5. Continuar con el proceso de compra
		WebElement btnCheckout = driver.findElement(By.linkText("Proceed to Checkout"));
		btnCheckout.click();

		// 6. Iniciar sesión con la cuenta
		WebElement linkSignIn = driver.findElement(By.linkText("Sign In"));
		linkSignIn.click();

		// Usuario
		WebElement txtUsername = driver.findElement(By.name("username"));
		txtUsername.sendKeys("maria@test.com");

		// Contraseña
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("test09");

		// Hacer click en el botón "Login"
		WebElement btnLogin = driver.findElement(By.name("signon"));
		btnLogin.click();

	}

}
