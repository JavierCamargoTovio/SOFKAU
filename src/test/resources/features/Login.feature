Feature: Login a sofka university

  @Login
  Scenario Outline: Login a Sofka U exitoso
    Given un usuario de sofka u abre la página
    When ingresa "<usuario>" y "<clave>"
    Then se logea correctamente
    Examples:
      | usuario                     | clave          |
      | javier.camargo@sofka.com.co | Camargo029207* |