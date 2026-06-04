package resol.AdamE.Ejercicio2;

import java.util.ArrayList;

public class Agenda {
    private int maxContactos;//numero maximos de contactos permitidos en la agenda
    private static int cantidadContactos;//numero actual de contactos en la agenda

    ArrayList<Contacto> listaContactos = new ArrayList<>(maxContactos);//lista de contactos en la agenda

    public Agenda(int maxContactos) {
        this.maxContactos = maxContactos;
        this.cantidadContactos = 0;
        
    }

    public void agregarContacto(Contacto nuevoContacto){       
        
        if(cantidadContactos < maxContactos && !existeContacto(nuevoContacto)){ //la función existeContactos esta en la linea 28
            listaContactos.add(nuevoContacto);
            cantidadContactos++;
        } else {
            System.out.println("No se pueden agregar mas contactos, agenda llena.");
        }
    }

    public boolean existeContacto(Contacto contactoExistira ){//Rrecorre la lista y verifica si el contacto existe, retorna true si existe, false si no
        for(Contacto contacto : listaContactos){
            if(contacto.nombreIgual(contactoExistira.getNombre()) && contacto.telefonoIgual(contactoExistira.getnTelefono())){
                return true;
            }
        }
        return false;
 
    }

    public void listarContactos(){//lista los contactos de la agenda
        System.out.println("------------------------------");
        for(Contacto contacto : listaContactos){
            System.out.println("Nombre: " + contacto.getNombre() + " - Telefono: " + contacto.getnTelefono());
            System.out.println("------------------------------");
        }
    }

    
    public void buscaContacto(String nombre){
        for (Contacto contacto : listaContactos){
            if(contacto.getNombre()==nombre){
                System.out.println("El numero del contacto "+ nombre + " es: " + contacto.getnTelefono());
            }
            else if (existeContacto(contacto)==false){
                System.out.println("No existe contacto con ese nombre");
            }
        }
    }

    public boolean sonElMismoContacto (Contacto contacto1, Contacto contacto2){
        if(contacto1.getNombre()==contacto2.getNombre() && contacto1.getnTelefono()==contacto2.getnTelefono()){
            return true;
        }
        else {return false;}
    }

    public void eliminarContacto(Contacto contactoAEliminar){
        if(existeContacto(contactoAEliminar)){
            listaContactos.remove(contactoAEliminar);
            cantidadContactos--;
            System.out.println("El contacto " + contactoAEliminar.getNombre() + " fue eliminado");
        }
        else {
            System.out.println("No Existe el contacto a eliminar");
        }
            
    }
        
    public void agendaLlena(){
        if(maxContactos==cantidadContactos){
            System.out.println("La Agenda esta llena, maximo contactos son " + maxContactos);
        }
        else {
            System.out.println("La Agenda NO esta llena, maximo contactos son" + maxContactos);
        }
    }
    
    public void espacioLibre(){
        if(maxContactos>cantidadContactos){
            int libre=maxContactos-cantidadContactos;
            System.out.println("se pueden agregar hasta " + libre + " contactos nuevos");
        }
        else if(maxContactos==cantidadContactos){
            System.out.println("La Agenda esta llena, maximo contactos son" + maxContactos);
        }
    }



}
