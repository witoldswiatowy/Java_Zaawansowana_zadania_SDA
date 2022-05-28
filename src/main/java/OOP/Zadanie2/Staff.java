package OOP.Zadanie2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Staff extends Person {
    String specialization;
    String salary;

    public Staff(String specialization, String salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "specialization='" + specialization + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
