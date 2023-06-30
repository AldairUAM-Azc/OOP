package repaso;

class Jugador extends Persona implements IEquipo {
    private int posicion;
    private int dorsal;

    public Jugador(String nombre, int edad, int posicion, int dorsal){
        super(nombre, edad);
        this.posicion= posicion;
        this.dorsal = dorsal;
    }

    public int getPosicion(){
        return posicion;
    }
    public int getDorsal(){
        return dorsal;
    }

    @Override
    public String toString(){
        return "Posicion: " + posicion + "Dorsal: " + dorsal + super.toString();
    }
    @Override 
    public float premio(){
        return 10000f;
    }
    @Override
    public void convocatoria(){
        System.out.println(this.getNombre() + " ha sido convocado");
    }
    
    @Override
    public void antidoping(){
        System.out.println(this.getNombre() + " se tiene que hacer el antidoping");
    }

}