package steps;

import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CourseCatalogPage;
import commons.waiters.Waiters;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseSteps {

  private final WebDriver driver;
  private final Waiters waiters;
  private final CourseCatalogPage courseCatalogPage;

  @Inject
  public CourseSteps(WebDriver driver, Waiters waiters, CourseCatalogPage courseCatalogPage) {
    this.driver = driver;
    this.waiters = waiters;
    this.courseCatalogPage = courseCatalogPage;
  }

  @Given("Я открываю страницу каталога курсов")
  public void openCourseCatalogPage() {
    courseCatalogPage.open(); // Используем метод open() из AbsBasePage
  }

  @When("Я ищу курс {string}")
  public void searchForCourse(String courseName) {
    courseCatalogPage.searchForCourse(courseName);
  }

  @Then("Я выбираю курс {string}")
  public void selectCourse(String courseName) {
    courseCatalogPage.findAndClickCourseByName(courseName);
  }

  @Then("Я проверяю, что открыта страница курса {string}")
  public void verifyCoursePage(String expectedCourseName) {
    String actualCourseName = courseCatalogPage.getPageHeader();
    assertEquals(expectedCourseName, actualCourseName, "Открыта страница неверного курса.");
  }
}