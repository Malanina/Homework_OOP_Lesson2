package task1;

import java.util.Comparator;

public class PersonAgeComporator implements Comparator<Person>{
    
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}
