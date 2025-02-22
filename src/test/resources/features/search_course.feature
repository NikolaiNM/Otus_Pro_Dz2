Feature: Поиск курса
  Пользователь может найти курс по названию и выбрать его.

  Scenario: Поиск и выбор курса по названию
    Given Я открываю страницу каталога курсов
    When Я ищу курс "Java Developer. Advanced"
    Then Я выбираю курс "Java Developer. Advanced"
    And Я проверяю, что открыта страница курса "Java Developer. Advanced"