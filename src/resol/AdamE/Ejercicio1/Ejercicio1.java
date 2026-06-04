package resol.AdamE.Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void ejecutar(){
        
        Ropa ropa1 = new Ropa("camisa", 25.99, "M");
        Ropa ropa2 = new Ropa("pantalón", 49.99, "L");
        Ropa ropa3 = new Ropa("zapatillas", 89.99, "42");
        Ropa ropa4 = new Ropa("camisa", 19.99, "S");
        Ropa ropa5 = new Ropa("pantalón", 39.99, "M");
        Ropa ropa6 = new Ropa("camisa", 55.99, "XL");

        ArrayList<Ropa> catalogo = new ArrayList<>();//Creamos una lista de tipo Ropa para almacenar los objetos de tipo Ropa que vamos a crear, y la inicializamos como un ArrayList vacio, ya que luego vamos a agregar los objetos de tipo Ropa a esta lista utilizando el método add() de la clase ArrayList, que nos permite agregar elementos a la lista, y cada vez que agregamos un elemento a la lista, se incrementa el contador IdRopa en el constructor de la clase Ropa, lo que nos permite llevar un control del total de prendas creadas. Luego, podemos utilizar esta lista para mostrar el catálogo de ropa disponible en la tienda, o para realizar otras operaciones relacionadas con la gestión del inventario de ropa.
        catalogo.add(ropa1);//Agregamos manualmente cadada objeto
        catalogo.add(ropa2);
        catalogo.add(ropa3);
        catalogo.add(ropa4);
        catalogo.add(ropa5);
        catalogo.add(ropa6);


        for(Ropa prenda : catalogo){
            System.out.println("Prenda " + (catalogo.indexOf(prenda)+1) + ":");
            System.out.println("------------------------");
            prenda.getInfoRopa();
            System.out.println("------------------------");
            System.out.println("------------------------");
        }





        Contado contado = new Contado(ropa1.getIdRopa(), ropa1.getPrecio(), true);
        Contado contado2 = new Contado(ropa2.getIdRopa(), ropa2.getPrecio(), false);
        EnCuota enCuota1 = new EnCuota(ropa3.getIdRopa(), ropa3.getPrecio(), false, 3);
        EnCuota enCuota2 = new EnCuota(ropa4.getIdRopa(), ropa4.getPrecio(), true, 6);
        EnCuota enCuota3 = new EnCuota(ropa5.getIdRopa(), ropa5.getPrecio(), false, 12);

        ArrayList<MetodoPago> compras = new ArrayList<>();
        compras.add(contado);
        compras.add(contado2);
        compras.add(enCuota1);
        compras.add(enCuota2);
        compras.add(enCuota3);

        // Crear Scanner
        Scanner sc = new Scanner(System.in);

        // Leer texto
        System.out.print("Ingrese ID de Ropa a comprar: ");
        int idRopa = sc.nextInt();
        System.out.print("¿Desea usar un cupón de descuento? (true/false): ");
        boolean cuponDescuento = sc.nextBoolean();
        System.out.print("Ingrese Metodo de Pago |contado: 1|  |Cuotas: 3, 6 o 12|: ");
        int cantidadCuotas = sc.nextInt();

        double precioTemp = 0;
        int idRopaTemp = 0;
        for(Ropa prenda : catalogo){
            if(prenda.getIdRopa() == idRopa){
                precioTemp = prenda.getPrecio();
                idRopaTemp = prenda.getIdRopa();
            }
        }

        if(cantidadCuotas == 1){
            Contado nuevaCompra = new Contado(idRopaTemp, precioTemp, cuponDescuento);
            compras.add(nuevaCompra);
        }
        else if(cantidadCuotas == 3 || cantidadCuotas == 6 || cantidadCuotas == 12){
            EnCuota nuevaCompra = new EnCuota(idRopaTemp, precioTemp, cuponDescuento, cantidadCuotas);
            compras.add(nuevaCompra);
        }
        else{
            System.out.println("Cantidad de cuotas no válida.");
        }




        for(MetodoPago Venta : compras){

            if(Venta instanceof Contado){
            System.out.println("Venta Contado: " + (compras.indexOf(Venta)+1) + ":");
            System.out.println("------------------------");
                ((Contado) Venta).mostrarINFOVenta();
            }
            else if(Venta instanceof EnCuota){
                System.out.println("Venta en Cuotas: " + (compras.indexOf(Venta)+1) + ":");
                System.out.println("------------------------");
                ((EnCuota) Venta).mostrarINFOVenta();
            }
            System.out.println("------------------------");
            System.out.println("------------------------");
        }













        // Cerrar Scanner
        sc.close();


    }
}
