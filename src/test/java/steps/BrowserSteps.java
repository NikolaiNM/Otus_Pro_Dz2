package steps;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import jakarta.inject.Inject;
import pages.MainPage;

public class BrowserSteps {

  private final MainPage mainPage;

  @Inject
  public BrowserSteps(MainPage mainPage) {
    this.mainPage = mainPage;
  }

  @Когда("Я открываю браузер {string}")
  public void openBrowser(String browser) {
    System.setProperty("browser.name", browser.toLowerCase());
  }

  @Тогда("Я успешно открываю главную страницу")
  public void openMainPage() {
    mainPage.open();
  }
}