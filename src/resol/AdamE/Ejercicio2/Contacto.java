package resol.AdamE.Ejercicio2;

public class Contacto {

    private String nombre;
    private int nTelefono;

    public Contacto(String nombre, int nTelefono) {
        this.nombre = nombre;
        this.nTelefono = nTelefono;
    }
    public boolean nombreIgual(String nombre){
        return this.nombre.equals(nombre);
    }
    public boolean telefonoIgual(int nTelefono){
        return this.nTelefono == nTelefono;
    }



    public String getNombre() {
        return nombre;
    }
    public int getnTelefono() {
        return nTelefono;
    }

}
