package tarea7;

public class Automovil {
  private String placa;
  private String modelo;
  private int anio;
  private float precio;

  public Automovil(String placa, String modelo, int anio, float precio) {
    this.placa = placa;
    this.modelo = modelo;
    this.anio = anio;
    this.precio = precio;
  }

  public int getAnio() {
    return anio;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  public float getPrecio() {
    return precio;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

}
