Ejercicios de Programación en Java
Este proyecto contiene ejercicios básicos de programación en Java, diseñados para mejorar habilidades de codificación y familiarizarse con la estructura y sintaxis de Java.

Ejercicio 1: Saludo Personal
Descripción:
Usando como ejemplo el archivo HolaMundo, crea un archivo llamado SaludoPersonal.java que imprima un mensaje de bienvenida personalizado.

Requerimientos:
El programa debe imprimir el siguiente mensaje en la consola:

Copiar código
Cesar, bienvenido al curso de Programación en Java!!!
Ejemplo de salida:

java
Copiar código
public class SaludoPersonal {
    public static void main(String[] args) {
        System.out.println("Cesar, bienvenido al curso de Programación en Java!!!");
    }
}
Ejercicio 2: Imprimir Cara
Descripción:
Escriba un archivo llamado ImprimirCara.java que imprima una cara utilizando caracteres de texto.

Ejemplo de salida:

mathematica
Copiar código
 @@@@@@@
@| O O |@
(|  ^  |)
 | [_] |
 +-----+
Código de ejemplo:

java
Copiar código
public class ImprimirCara {
    public static void main(String[] args) {
        System.out.println(" @@@@@@@");
        System.out.println("@| O O |@");
        System.out.println("(|  ^  |)");
        System.out.println(" | [_] |");
        System.out.println(" +-----+");
    }
}
Ejercicio 3: Imprimir Diamante
Descripción:
Escriba un archivo llamado ImprimirDiamante.java que imprima un diamante utilizando caracteres de texto.

Ejemplo de salida:

markdown
Copiar código
   *
  ***
 *****
*******
 *****
  ***
   *
Código de ejemplo:

java
Copiar código
public class ImprimirDiamante {
    public static void main(String[] args) {
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("*******");
        System.out.println(" *****");
        System.out.println("  ***");
        System.out.println("   *");
    }
}
Ejercicio 4: Entrada de Palabras
Descripción:
Escriba un archivo llamado PalabrasUsuario.java que pida tres palabras al usuario y las imprima en la pantalla.

Ejemplo de uso:

El programa solicita al usuario que ingrese tres palabras.
Imprime las palabras ingresadas en la pantalla.
Código de ejemplo:

java
Copiar código
import java.util.Scanner;

public class PalabrasUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera palabra:");
        String palabra1 = scanner.nextLine();

        System.out.println("Ingrese la segunda palabra:");
        String palabra2 = scanner.nextLine();

        System.out.println("Ingrese la tercera palabra:");
        String palabra3 = scanner.nextLine();

        System.out.println("Las palabras ingresadas son:");
        System.out.println(palabra1);
        System.out.println(palabra2);
        System.out.println(palabra3);
    }
}
Cada ejercicio está diseñado para ayudar a comprender los conceptos básicos de entrada, salida y estructuras de texto en Java. ¡Diviértete programando!
