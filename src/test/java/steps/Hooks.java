package steps;

import com.google.inject.Inject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import modules.GuiceModule;
import org.openqa.selenium.WebDriver;

public class Hooks {

  @Inject
  private GuiceModule driver;

  @Before
  public void setUp() {
    System.out.println("Браузер запущен.");
  }

  @After
  public void tearDown() {
    if (driver != null) {
      try {
        driver.quit();
        System.out.println("Браузер закрыт.");
      } catch (Exception e) {
        System.out.println("Ошибка при закрытии браузера: " + e.getMessage());
      }
    }
  }
}