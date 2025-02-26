package modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import commons.waiters.Waiters;
import factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class GuiceModule extends AbstractModule {

  @Provides @Singleton
  public WebDriver provideWebDriver() {
    String browser = System.getProperty("browser.name", "chrome");
    return new WebDriverFactory().create();
  }

  @Override
  protected void configure() {
    // Не требует явных привязок при использовании конструкторов с @Inject
  }

  @Provides @Singleton
  public Waiters provideWaiters(WebDriver driver) {
    return new Waiters(driver);
  }
}