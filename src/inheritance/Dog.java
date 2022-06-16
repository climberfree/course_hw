package inheritance;

public class Dog extends Animal {

    public static int count;
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setName(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void breed() {
        System.out.println("My breed is labrador");
    }

    @Override
    public String toString() {
        return "I'm dog";
    }
}
