package inheritance;

public class CommandUtil {

    public static void doSmth(Command command){
        command.voice();
    }


    public static void doSmthAnimal(Animal animal){
        animal.eat();
    }

}
