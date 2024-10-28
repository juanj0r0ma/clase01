import java.util.Scanner;

public class IngresarPalabras {
    public static void main(String[] args) {
        //Pida tres palabras por parte del usuario y la salida de las tres palabras en la pantalla.
        var sc = new Scanner(System.in);
        System.out.print("Ingrese la palabra 1-> ");
        var pal1 = sc.nextLine();
        System.out.print("Ingrese la palabra 2-> ");
        var pal2 = sc.nextLine();
        System.out.print("Ingrese la palabra 3-> ");
        var pal3 = sc.nextLine();
        sc.close();
        System.out.printf("%nPalabra 1-> %s%nPalabra 2-> %s%nPalabra 3-> %s", pal1, pal2, pal3);
    }    
}
