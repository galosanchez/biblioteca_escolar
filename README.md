# Biblioteca escolar
Es un **proyecto personal** para gestionar el control de los prestamos de libros en una biblioteca.

Mira el [dise帽o](https://www.figma.com/file/lVcD1lTxKimRTPKjiYo4hO/Biblioteca-Escolar?node-id=0%3A1) y el [diagrama](https://i.imgur.com/tndbiiu.jpg) entidad-relaci贸n para conocer el modelo de datos.

## Construido con 馃敤

- [Apache NetBeans ](https://netbeans.apache.org) - IDE
- [MySQL ](https://www.mysql.com/) - Base de datos
- [Dia](http://dia-installer.de/index.html.es) - Creaci贸n de diagrama
- [Figma](https://www.figma.com/) - Creaci贸n del dise帽o

## Caracter铆sticas

- Gesti贸n de estudiantes, libros, bibliotecarios y pr茅stamos.
- Filtros para encontrar prestamos.
- Usuario admin gestiona a los bibliotecarios.

## Comenzando 馃殌
Correr el programa desde NetBeans.
### Pre-requisitos
*Versi贸n de Mysql*
```
version 5.7
```
*Versi贸n m铆nima JDK*
```
version 8
```
### Instalaci贸n 馃敡
#### Base de datos
_Importa el archivo [backup_biblioteca_escolar](https://github.com/galosanchez/biblioteca_escolar/blob/master/backup_biblioteca_escolar.sql) en mysql._
#### Configuraci贸n de credenciales
_En el archivo [Conexion.java](https://github.com/galosanchez/biblioteca_escolar/blob/master/biblioteca_escolar_code/src/com/galosanchez/model/Conexion.java) edita el usuario y contrase帽a con tus credenciales de la base de datos._
```
private static final String USER = "tuUserName";
private static final String PASSWORD = "tuPassword";
```
#### Usuario administrador
*Al arrancar el programa las credenciales del adminstrados son:*
```
usuario: admin
contrase帽a: admin
```

---

馃懆鈥嶐煉? por [Galo S谩nchez](https://github.com/galosanchez) 馃枻
