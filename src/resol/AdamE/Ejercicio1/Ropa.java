package resol.AdamE.Ejercicio1;

public  class Ropa {
    private String Tipo; //(camisa, pantalón, zapatillas, etc.)
    private double Precio;
    private String Talle;
    private int IdRopa;
    private static int TotalRopa = 0;

    public Ropa(String Tipo, double Precio, String Talle) {
        this.Tipo = Tipo;
        this.Precio = Precio;
        this.Talle = Talle;
        IdRopa=TotalRopa++;
        
    }
    public void getInfoRopa(){
        System.out.println("ID: " + IdRopa);
        System.out.println("Tipo: " + this.Tipo);
        System.out.println("Precio: " + this.Precio);
        System.out.println("Talle: " + this.Talle);
    }

    public double getPrecio() {
        return Precio;
    }
    public int getIdRopa() {
        return IdRopa;
    }



    
}
