package task2;

public class Person implements Eat, Feed{
    private String name;



    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void eat() {
        System.out.println("Кушает");
    }

    @Override
    public void giveFood() {
        System.out.println("Положил еду кошки в миску");
    }

    @Override
    public void voice() {
        System.out.println("Позвал кошку: кис кис");
    }

}
