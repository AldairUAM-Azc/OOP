package repaso;

public abstract class Persona {
    private String nombre;
    private int edad;
    public abstract float premio();

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getEquipo(){
        return equipo;
    }
}