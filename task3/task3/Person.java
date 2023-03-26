package task3;

public class Person implements Opening{
        private String fullName;
    
        public Person(String fullName) {
            this.fullName = fullName;
        }
    
        public String getFullName() {
            return fullName;
        }
       
        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        @Override
        public void openDoor() {
            System.out.println("Открывает дверь");
        }
        
        @Override
        public void closeDoor() {
            System.out.println("Закрывает дверь");
        }
      
    }
    

