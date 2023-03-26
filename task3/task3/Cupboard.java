package task3;

public class Cupboard extends Furniture implements Opening{
     public Cupboard(String name, String color) {
        super(name, color);
        }
    
        public void openDoor() {
            System.out.println("Дверь шкафа открыта");
        }
        public void closeDoor() {
            System.out.println("Дверь шкафа закрыта");
        }
        
    }


