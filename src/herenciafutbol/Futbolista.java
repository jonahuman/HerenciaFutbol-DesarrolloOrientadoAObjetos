package herenciafutbol;

public class Futbolista extends Persona {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return super.toString() + " Futbolista{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }

    public void jugarPartido() {
        System.out.println("soy " + nombre + ", estoy jugando partido");
    }

    public void entrenar() {
        System.out.println("soy " + nombre + ", estoy entrenando");
    }
}
