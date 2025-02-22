package steps;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import jakarta.inject.Inject;
//import javax.inject.Inject;

public class BrowserSteps {

  @Inject
  private WebDriver driver;

  @Inject
  private MainPage mainPage;

  @Когда("Я открываю браузер {string}")
  public void openBrowser(String browser) {
    System.setProperty("browser.name", browser);
  }

  @Тогда("Я успешно открываю главную страницу")
  public void openMainPage() {
    mainPage.open();
  }
}
