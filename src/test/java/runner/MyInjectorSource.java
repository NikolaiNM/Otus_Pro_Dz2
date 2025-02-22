package runner;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.cucumber.guice.CucumberModules;
import io.cucumber.guice.InjectorSource;
import modules.GuiceModule;

public class MyInjectorSource implements InjectorSource {
  @Override
  public Injector getInjector() {
    System.out.println("Creating Guice Injector...");
    return Guice.createInjector(
        CucumberModules.createScenarioModule(),
        new GuiceModule()
    );
  }
}