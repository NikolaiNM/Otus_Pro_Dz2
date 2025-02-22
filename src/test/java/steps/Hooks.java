package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import jakarta.inject.Inject;
import org.openqa.selenium.WebDriver;

public class Hooks {

  @Inject
  private WebDriver driver; // Исправлено: инжектим WebDriver вместо GuiceModule

  @Before
  public void setUp() {
    // Дополнительные настройки перед тестом
  }

  @After
  public void tearDown() {
    if (driver != null) {
      driver.quit(); // Теперь метод quit() доступен
    }
  }
}