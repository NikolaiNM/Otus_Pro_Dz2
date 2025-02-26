package steps;

import com.google.inject.Inject;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;

public class Hooks {

  private final WebDriver driver;

  @Inject // ТОЛЬКО НА КОНСТРУКТОРЕ
  public Hooks(WebDriver driver) {
    this.driver = driver;
  }

  @After
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }
}