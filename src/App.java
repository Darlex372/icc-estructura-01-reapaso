
import Controllers.PersonaController;
import Models.Persona;
import views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("juan", 25),
            new Persona("maria", 30),
            new Persona("carlos", 22),
            new Persona("ana", 28),
            new Persona("luis", 35),
            new Persona("sofia", 27),
            new Persona("miguel", 40),
            new Persona("laura", 32),
            new Persona("pedro", 29),
            new Persona("elena", 26),
        };
        PersonaController personasController=new PersonaController();
        ViewConsole viewConsole=new ViewConsole();
        viewConsole.printMessage("Arreglo de personas");
        viewConsole.printPersonsArray(personas);
        viewConsole.printMessage("Arreglo personas ordenado");
        personasController.ordenarPorEdad(personas);
        viewConsole.printPersonsArray(personas);
        viewConsole.printMessage("Buscar persona por edad 40");
        Persona persona = new Persona("javier", 40);
        if (persona != null){
            viewConsole.printMessage(("Persona encontrada: " ) + persona.getNombre() + ", Edad: " + persona.getEdad());
        }else{
            viewConsole.printMessage("Persona no encontrada");
        }
    }
}
