package Controllers;

import Models.Persona;

public class PersonaController {

    public void ordenarPorEdad(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            Persona key =personas[i];
            int j=i-1;

            while (j >= 0 && personas[j].getEdad()>key.getEdad()){
                personas[j+1]=personas[j];
                j=j-1;
            }
            personas[j+1]=key;
            
        }    
    }

    public Persona buscarPorEdad(Persona[] personas, int edad) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad()==edad){
                return personas[i];
            }
            
        }
        return null;
    }
}
