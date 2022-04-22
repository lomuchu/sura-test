# sura-test
Prueba sura

### Prueba peticiones a WS SOAP y RESTFUL


Hola bienvenido a mi solucion, espero sea de su agrado

#compilacion

    mvn clean install -Dmaven.test.skip=true

#Ejecucion

    mvn spring-boot:run

o

    cd target
    java -jar sura-test-0.0.1-SNAPSHOT.jar

Esto ejecutara el servicio pero solo para los tokens y hash de las fechas 21/04/2022, 22/04/2022 y 23/04/2022

Si esta fuera de estas fechas pero tiene token y hash valido puede ejecutar de la siguiente manera:


    mvn spring-boot:run -Dspring-boot.run.arguments=strtoken,strhash
    mvn spring-boot:run -Dspring-boot.run.arguments=MTAuMjEyLjExOC4zMCMyMi8wNC8yMDIy,ib//ueR3LORZRnxfl9FSFNFqAUCnTgNwklf6WbHWwz8=

o

    cd target
    java -jar sura-test-0.0.1-SNAPSHOT.jar strtoken strhash
    java -jar sura-test-0.0.1-SNAPSHOT.jar MTAuMjEyLjExOC4zMCMyMi8wNC8yMDIy ib//ueR3LORZRnxfl9FSFNFqAUCnTgNwklf6WbHWwz8=

