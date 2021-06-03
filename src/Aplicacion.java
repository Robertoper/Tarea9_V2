public class Aplicacion {
    public static void main(String[] args) {
        Animal animal=new Perro();
        Perro perro=new Perro();
        Animal animalPoliformico=new Perro();
        animalPoliformico=animal;
        Gato gato=new Gato();
        IAnimal gato1=new Gato();
    }
}
