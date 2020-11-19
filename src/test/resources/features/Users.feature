#Autor: juan lopez
#Fecha: 18/11/2020
#language: es

Característica: : Verificación de registro e inicio de sesión de usuarios
  Como usuario del sistema
  Quiero porder registrarme en la plataforma
  Para ingresar, recibir o impartir clases

  Antecedentes:
    Dado El Usuario requiere ingresar a Espety Academy

  Escenario: Escenario: : Registro correcto de usuarios estudiantes
    Cuando El realiza el registro del estudiante
      | pepito | perez    | pepitop5@gmail.com | 12345 |
    Entonces El deberia poder utilizar el usuario para iniciar sesion


  Escenario: : Inicio de sesión con credenciales correctas
    Cuando El ingresa con el usuario pepitop@gmail.com y la contrasenia 12345
    Entonces El deberia poder ingresar al sistema viendo la pagina de inicio


  Escenario: : Inicio de sesión con credenciales incorrectas
    Cuando El ingresa con el usuario pepitop@gmail.com y la contrasenia 22222
    Entonces El no deberia poder ingresar al sistema
