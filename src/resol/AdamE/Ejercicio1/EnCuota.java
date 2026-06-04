package resol.AdamE.Ejercicio1;

public class EnCuota extends MetodoPago {
    private double precioCuota;
    private int cantidadCuotas;
    private double recargo;
    private double precioFinal;
    public EnCuota(int idRopa, double Precio, boolean cuponDescuento, int cantidadCuotas) {
        super(idRopa, Precio, cuponDescuento);
        this.cantidadCuotas = cantidadCuotas;
        double precioTemp=Precio;
        double recargoTEMP=0;
        if(cantidadCuotas==3){
            precioTemp=precioTemp/3;
            recargoTEMP=precioTemp*0.05;
            this.recargo=recargoTEMP;
            this.precioCuota=precioTemp+recargoTEMP;
            this.precioFinal=precioCuota*cantidadCuotas;
        }
        else if(cantidadCuotas==6){
            precioTemp=precioTemp/6;
            recargoTEMP=precioTemp*0.08;
            this.recargo=recargoTEMP;
            this.precioCuota=precioTemp+recargoTEMP;
            this.precioFinal=precioCuota*cantidadCuotas;
        }
        else if(cantidadCuotas==12){
            precioTemp=precioTemp/12;
            recargoTEMP=precioTemp*0.12;
            this.recargo=recargoTEMP;
            this.precioCuota=precioTemp+recargoTEMP;
            this.precioFinal=precioCuota*cantidadCuotas;
        }

    }


    public void mostrarINFOVenta(){
        super.mostrarVenta();
        System.out.println("Cantidad de cuotas: " + cantidadCuotas);
        System.out.println("Recargo por cuotas: " + recargo);
        System.out.println("Precio por cuota: " + precioCuota);
        System.out.println("Precio final con recargo: " + precioFinal);
    }





}
