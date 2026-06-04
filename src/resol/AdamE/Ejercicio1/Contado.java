package resol.AdamE.Ejercicio1;

public class Contado extends MetodoPago {
    private double precioFinal;
    private double descuento;

    public Contado(int idRopa, double Precio, boolean cuponDescuento) {
        super(idRopa, Precio, cuponDescuento);
        this.descuento=Precio*0.15;
        this.precioFinal = Precio-Precio*0.15;
    }

    public void mostrarINFOVenta(){
        super.mostrarVenta();
        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Precio final con descuento: " + precioFinal);
    }

}
