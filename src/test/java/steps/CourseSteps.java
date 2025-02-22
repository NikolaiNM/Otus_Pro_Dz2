package steps;

import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import pages.CourseCatalogPage;
import jakarta.inject.Inject;
import static org.assertj.core.api.Assertions.assertThat;

public class CourseSteps {

  @Inject
  private CourseCatalogPage courseCatalogPage;

  private String courseName;

  @Когда("Я ищу курс {string}")
  public void searchCourse(String name) {
    this.courseName = name;
    courseCatalogPage.searchForCourse(name);
  }

  @И("Я выбираю найденный курс")
  public void selectCourse() {
    courseCatalogPage.findAndClickCourseByName(courseName);
  }

  @Тогда("Я вижу страницу курса {string}")
  public void verifyCoursePage(String expectedName) {
    String actualName = courseCatalogPage.getPageHeader();
    assertThat(actualName).isEqualTo(expectedName);
  }
}