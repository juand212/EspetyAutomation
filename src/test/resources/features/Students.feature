#Autor: juan lopez
#Fecha: 18/11/2020
#language: es

Característica: : Registro de información de estudiantes
  Como usuario estudiante
  Quiero porder registrar mi información personal
  Para acceder a los cursos de la plataforma


  Esquema del escenario: Registro de información personal de estudiantes
    Dado El estudiante ingresa a la plataforma con un usuario previamente registrado
      | <nombre> | <apellido> | <email> | <contrasenia> |
    Cuando El realiza el registro de informacion personal
      | <rango edad> | <nivel academico> | <ciudad> |
    Entonces El deberia poder visualizar los cursos disponibles

    Ejemplos:
      | nombre | apellido | email           | contrasenia | rango edad      | nivel academico | ciudad  |
      | juan   | lopez    | juan19@lope.com | 12345       | 60 years and up | University      | Popayán |
   #   | juan   | lopez    | juan9@lop.com   | 12345       | 18 to 60 years  | University      | Popayán |


