package task2;

 public class Cat extends Animal implements Fawn, Eat{
        public Cat(String name, String color) {
            super(name, color);
        }
    
    
        @Override
        public void fawn() {
            System.out.println("Подошла и трется об ноги ");
        }
    
        @Override
        public void eat() {
            System.out.println("Ест");
        }
    
        @Override
        public void voice() {
            System.out.println("Говорит: мяу");
        }

    }
               
    
