Feature: Tests for task number 1

  Scenario: Check title Bell Integrator
    Given I go to test site
    Then Check title equals 'Bell Integrator'

    Scenario: Check service name 'Бизнес-анализ'
      Given I go to test site
      When I click Top Menu
      And I choose service 'Бизнес-анализ'
      Then Check header equals 'Бизнес-анализ'