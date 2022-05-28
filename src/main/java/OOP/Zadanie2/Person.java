package OOP.Zadanie2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;
    private String address;

    public Person() {
        this.name = "";
        this.address = "";
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " -> " + address;
    }
}
