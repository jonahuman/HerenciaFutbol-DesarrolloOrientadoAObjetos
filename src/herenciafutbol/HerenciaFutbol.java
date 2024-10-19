package herenciafutbol;

import java.util.ArrayList;

public class HerenciaFutbol {

    public static void main(String[] args) {
        Futbolista f = new Futbolista(10, "DELANTERO", 1001, "LIONEL", "MESSI", 36);
        Entrenador e = new Entrenador("FA", 100, "JOSEPH", "GUARDIOLA", 52);
        Masajista m = new Masajista("kine", 15, 77, "DON", "LUCHITO", 48);

        ArrayList<Persona> seleccion = new ArrayList<>();

        seleccion.add(f);
        seleccion.add(e);
        seleccion.add(m);

        for (Persona persona : seleccion) {
            System.out.println(persona);
        }

    }

}
