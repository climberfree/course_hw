package inheritance;

public class ChawChaw implements Command{

    public void fluffy(){
        System.out.println("I'm fluffy chaw-chaw");
    }

    @Override
    public void voice() {
        System.out.println("Gav-gav chaw-chaw");
    }
}
