package task2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivan");
        Cat cat = new Cat("Кнопка", "black");

        person.voice();
        cat.fawn();
        System.out.println();
        person.giveFood();
        person.voice();
        cat.eat();
        cat.voice();
       
    }
} 
