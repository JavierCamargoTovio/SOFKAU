Feature: Login a sofka university

  @LoginExitoso
  Scenario: Login a SofkaU exitoso
    Given un usuario que ingresa la página de sofkaU
    When ingresa las crenciales validas
    Then se logea correctamente


  @LoginFallido
  Scenario: Login a SofkaU fallido
    Given un usuario que ingresa la página de sofkaU
    When ingresa las crenciales no validas
    Then se presenta un mensaje fallido

