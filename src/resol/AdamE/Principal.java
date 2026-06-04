package resol.AdamE;
import java.util.Scanner;
import resol.AdamE.Ejercicio1.Ejercicio1;
import resol.AdamE.Ejercicio2.Ejercicio2;
public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcion;
       // do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1 - Ejercicio 1: ");
            System.out.println("2 - Ejercicio 2: ");
     
            System.out.println("0 - Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Ejercicio1.ejecutar();
                    break;
                case 2:
                    Ejercicio2.ejecutar();
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
      //  } while (opcion != 0);
        scanner.close();
    }
}
