@featureTest
Feature: Comprobar el correcto funcionamiento a la hora de iniciar sesion en la aplicacion

  @Scenario1
  Scenario: Al introducir las credenciales y pulsar el boton de login, son incorrectas y no cambia de pagina
    Given Estamos en la pagina principal
    When Se introducen las credenciales invalidas
    And Se pulsa el boton de iniciar sesion
    Then Los input se vacian
    
  @Scenario2
  Scenario: Al introducir las credenciales y pulsar el boton de login, son correctas y se muestra la pagina de citas
    Given Estamos en la pagina principal
    When Se introducen las credenciales validas
    And Se pulsa el boton de iniciar sesion
    Then Se abre la pagina de citas