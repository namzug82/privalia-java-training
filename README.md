# Model

Tot objecte hauria de tenir un Unic Identifier. (gid=> Global Id)

Arquitectura amb PrivaliaObject amb gid, i fer que totes les classes heredin d'aquí.
Per generar el UUID, es pilla de java.util.UUID.randomUUID()


## Constructors
constructor de classes (Inicialitzador static)
> Es single thread.
>
> S'executa el primer cop que s'accedeixi a la clase. Sigui per crear un objecte nou o per accedir a un metode static

constructor d'objecte


#Java

En Java Web, tenim variables d'applicació, son variables que conté el servidor web. 

## Compilats Java
- jar
- war
- ear
- apk



### Classpath
afegir les coses que han de ser facils per localitzar

## Anotacions
Es creen amb @interface.
Poden tenir atributs amb default values.


Es poden applicar anotacions a la mateixa anotació



# Maven
## Useful things Maven:
[Phases maven](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)



# Log4J
Tutorial:
https://www.adictosaltrabajo.com/tutoriales/log4j/

PropertyConfigurator.configure <= permet indicar on esta i com es diu el fitxer de configuració de log4j

# Spring

## Log
Per fer el log, spring utilitza una façana per encapsular la majoria de frameworks de logs. Aquesta es diu slf4j

spring-boot per defecte utilitza logback, però spring-data amb hibernate utilitza log4j

# Altres

## Reflexión
Spring utilitza "Reflexión" en català, introspecció.