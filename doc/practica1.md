# Documentación práctica 1
Elena Megía Cañaveras
## Funcionalidad del programa:
Para esta practica hemos usado Spring Boot ejecutando una aplicacion para saber que números son pares y que números son impares. Para eso hemos usado las plantillas de Thymeleaf.
Con el propósito de tener un seguimiento de la practica hemos ido subiendo distintos commit a nuestro repositorio en GitHun llamado springboot-demo-app-ElenaMegia, usando la aplicación Git Bash.
También hemos creado una cuenta Docker y hemos subido una imagen de nuestro programa.

Con los test añadidos al programa podemos comprobar que cuando introducimos un número par este es representa en verde y que cuando introducimos un número impar lo representamos en rojo. 
Además, hemos introducido unos cambios al programa cambiando el nombre de usuario al nuestro propio, para la aplicación hola mundo.

## Codigo añadido:
- Java
  - Controller: En el Controller hemos introducido dos.
    - EsParController: al introducir el número llama al metodo esPar en el que comprueba que es un número y dice si es par o no
    - NumeroData: Creamos un objeto numero, diciendole que se un integer, además de crear los getters y setters
  - Service: 
    NumeroParService: aquí comprobamos con una cuenta si el número al ser divisible entre dos su resto nos da 0, si nos da 0 sabemos que el número es par, si no es impar.
    
- Resources
  - Templates:
    - esParComprobar: Aquí mostramos que si es par salga en verde y que si es impar slga en rojo.
    - formRegistroNumero: Pedimos el número que se quiera comprobar, se registra el número en nuestro programa.
- Test:
  - EsParControllerTest: Con dos números distintos uno par y otro impar comprobamos que funcione.
  - NumeroParServiceTest: Comprobamos que funcione el metodo esPar().


### URL GitHub y Docker Hub: 
**GitHub** : [springboot-demo-app-ElenaMegia](https://github.com/ElenaMegia/springboot-demo-app-ElenaMegia.git)
**Docker Hub** : [Imagen Docker](https://hub.docker.com/r/elenamegia/spring-boot-demoapp)