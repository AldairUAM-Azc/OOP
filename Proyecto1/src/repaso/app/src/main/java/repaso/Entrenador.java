package repaso;

/**
 * Entrenador
 */
public class Entrenador extends Persona implements IEquipo {
  private String profesion;
  private float sueldo;

  public Entrenador(String nombre, int edad, String profesion, float sueldo) {
    super(nombre, edad);
    this.profesion = profesion;
    this.sueldo = sueldo;
  }

  public String getProfesion() {
    return profesion;
  }

  public double getSueldo() {
    return sueldo;
  }

  @Override
  public String toString() {
    return "Profesion: " + profesion + "Sueldo: " + sueldo;
  }

  @Override
  public float premio() {
    return 150_000f;
  }

  @Override
  public void convocatoria() {
    System.out.println(this.getNombre() + " va a convocar");
  }

  @Override
  public void antidoping() {
    System.out.println(this.getNombre() + " no le toca antidoping");
  }
}