package teste_mobile_appium_calculadora.teste_mobile_appium_calculadora;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Calculadora {

	AppiumDriver<MobileElement> driver = Driver.getDriver();

	public void somaTest() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.id("com.google.android.calculator:id/digit_2")).click();
		driver.findElement(MobileBy.id("com.google.android.calculator:id/op_add")).click();
		driver.findElement(MobileBy.id("com.google.android.calculator:id/digit_3")).click();
		driver.findElement(MobileBy.id("com.google.android.calculator:id/eq")).click();

		WebElement result = driver.findElement(MobileBy.id("com.google.android.calculator:id/result_final"));
		System.out.println("Resultado: " + result.getText());
	}

	public void subtracaoTest() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.id("com.google.android.calculator:id/digit_3")).click();
		driver.findElement(MobileBy.id("com.google.android.calculator:id/op_sub")).click();
		driver.findElement(MobileBy.id("com.google.android.calculator:id/digit_2")).click();
		driver.findElement(MobileBy.id("com.google.android.calculator:id/eq")).click();

		WebElement result = driver.findElement(MobileBy.id("com.google.android.calculator:id/result_final"));
		System.out.println("Resultado: " + result.getText());
	}

	public void multiplicacaoTest() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.id("com.google.android.calculator:id/digit_4")).click();
		driver.findElement(MobileBy.id("com.google.android.calculator:id/op_mul")).click();
		driver.findElement(MobileBy.id("com.google.android.calculator:id/digit_4")).click();
		driver.findElement(MobileBy.id("com.google.android.calculator:id/eq")).click();

		WebElement result = driver.findElement(MobileBy.id("com.google.android.calculator:id/result_final"));
		System.out.println("Resultado: " + result.getText());
	}

	public void divisaoTest() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(MobileBy.id("com.google.android.calculator:id/op_div")).click();
		driver.findElement(MobileBy.id("com.google.android.calculator:id/digit_3")).click();
		driver.findElement(MobileBy.id("com.google.android.calculator:id/eq")).click();

		WebElement result = driver.findElement(MobileBy.id("com.google.android.calculator:id/result_final"));
		System.out.println("Resultado: " + result.getText());
	}
}