package repaso;

public class Masajista extends Persona{
    private String titulo;
    private int experiencia;

    public Masajista(String nombre, int edad,String titulo, int experiencia){
        super(nombre, edad);
        this.titulo = titulo;
        this.experiencia = experiencia;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getExperiencia(){
        return experiencia;
    }

    @Override
    public String toString(){
        return "Titulo: " + titulo + "Experiencia: " + experiencia;
    }
}