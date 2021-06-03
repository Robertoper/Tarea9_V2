public abstract class Animal implements IAnimal {
    private String nombre;

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void tipoAnimal();
}

