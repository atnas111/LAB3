package Characters;

import Enums.Gender;
import Interfaces.Flyable;

import java.util.Objects;

public class Carlson extends Character implements Flyable {
    private String name;
    private int flyheight;
    public Carlson(String name, Gender gender, double weight, double height){
        super(name, gender, weight, height);
    }
    public Carlson(String name, Gender gender, double weight, double height, int flyheight){
        super(name, gender, weight, height);
        this.flyheight = flyheight;
    }
    @Override
    public void fly(int flyheight) {
        this.flyheight = 10;
        System.out.println("Карлсон запустил пропеллер");
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        if (this.getClass()!=object.getClass()){
            return false;
        }
        Carlson carlson = (Carlson) object;
        return Objects.equals(name, carlson.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
