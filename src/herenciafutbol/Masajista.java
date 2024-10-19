package herenciafutbol;

public class Masajista extends Persona {
    private String titulacion;
    private int añosExp;

    public Masajista(String titulacion, int añosExp, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExp = añosExp;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExp() {
        return añosExp;
    }

    public void setAñosExp(int añosExp) {
        this.añosExp = añosExp;
    }

    @Override
    public String toString() {
        return super.toString() + " Masajista{" + "titulacion=" + titulacion + ", a\u00f1osExp=" + añosExp + '}';
    }

    public void darMasaje() {
        System.out.println("soy " + nombre + ", estoy dando masaje");
    }
}
