package inheritance;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();

        Dog dog = new Dog();

//        dog.eat();
//        dog.breed();
//        System.out.println(dog.toString());

        ChawChaw chawChaw = new ChawChaw();
//        chawChaw.voice();

        Labrador labrador = new Labrador();
//        labrador.voice();


        CommandUtil.doSmth(chawChaw);
        CommandUtil.doSmth(labrador);

        CommandUtil.doSmthAnimal(dog);
    }
}
