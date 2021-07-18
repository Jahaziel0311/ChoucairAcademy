# Autor: Jahaziel De Salas

  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate un screenplay at the Choucair Academy with the automation course

    @scenario
    Scenario: Search for automation course
      Given than Brandon wants to learn automation at the academy Choucair
        | strUser   | strPassword    |
        |  8820413  | Choucair2021*  |
      When he search for the course on the choucair academy platform
        | strCourse               |
        | Metodología Bancolombia |
      Then he find the course called
        | strCourse               |
        | Metodología Bancolombia |




