package resol.AdamE.Ejercicio2;

public class Ejercicio2 {
        public static void ejecutar(){

            System.out.println("Ejercicio 2: ");


            Contacto contacto1 = new Contacto("EDU", 123456789);
            Contacto Contacto2PARAELIMINAR = new Contacto("JUAN", 987654321);


            Agenda nuevaAgenda = new Agenda(5);

            nuevaAgenda.agregarContacto(contacto1);
            nuevaAgenda.agregarContacto(Contacto2PARAELIMINAR);

            System.out.println("¿Existe el contacto EDU con teléfono 123456789? " + nuevaAgenda.existeContacto(contacto1));

            nuevaAgenda.listarContactos();

            nuevaAgenda.buscaContacto("EDU");

            nuevaAgenda.eliminarContacto(Contacto2PARAELIMINAR);

            nuevaAgenda.agendaLlena();

            nuevaAgenda.espacioLibre();

        }


}
