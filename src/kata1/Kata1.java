
package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar fecha;
        fecha = GregorianCalendar.getInstance();
        fecha.set(1998, 11, 14);
        Person person = new Person("Joel Navarro Rivero", fecha);
        System.out.println("Nombre de P1: " + person.getName());
        System.out.println("Edad de P1: " + person.getAge() + " años");
    }
    
}
