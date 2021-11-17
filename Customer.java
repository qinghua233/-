package exam;

import javax.crypto.spec.PSource;
import java.time.LocalDate;

public class Customer {
    String name;
    int ruanum;
    LocalDate time;


    @Override
    public String toString() {
        return "Customer{" +
                ", name='" + name + '\'' +
                ", ruanum=" + ruanum +
                ", time=" + time +
                '}';
    }
}
