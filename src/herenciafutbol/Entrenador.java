package herenciafutbol;

public class Entrenador extends Persona {
    private String idFederacion;

    public Entrenador(String idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return super.toString() +" Entrenador{" + "idFederacion=" + idFederacion + '}';
    }

    public void dirigirPartido() {
        System.out.println("soy " + nombre + ", estoy dirigiendo partido");
    }

    public void dirigirEntrenamiento() {
        System.out.println("soy " + nombre + ", estoy entrenamiento");
    }
}
