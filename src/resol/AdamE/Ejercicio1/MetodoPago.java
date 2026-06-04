package resol.AdamE.Ejercicio1;

public abstract class MetodoPago {

    private int idRopa;
    private double Precio;
    private static int idCompra = 0;
    private boolean cuponDescuento;

    public MetodoPago(int idRopa, double Precio, boolean cuponDescuento) {
        this.idRopa = idRopa;
        this.Precio = Precio;
        this.cuponDescuento = cuponDescuento;
        idCompra++;
    }
    public void mostrarVenta(){
        System.out.println("ID de Ropa: " + idRopa);
        System.out.println("Precio: " + Precio);
        System.out.println("¿Usó cupón de descuento? " + cuponDescuento);
    }

}
