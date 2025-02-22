package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import jakarta.inject.Inject;
import org.openqa.selenium.WebDriver;
import commons.waiters.Waiters;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BrowserSteps {

  @Inject
  private WebDriver driver;

  @Inject
  private Waiters waiters;

  @Given("Я открываю браузер {string}")
  public void openBrowser(String browserName) {
    // Браузер уже создан через GuiceModule, поэтому этот шаг может быть пустым.
    // Если нужно переключить браузер, это можно сделать через конфигурацию системы.
    System.out.println("Браузер " + browserName + " готов к использованию.");
  }

  @Then("Браузер {string} успешно открыт")
  public void verifyBrowserOpened(String browserName) {
    assertNotNull(driver, "Браузер не был открыт.");
    System.out.println("Браузер " + browserName + " успешно открыт.");
  }
}