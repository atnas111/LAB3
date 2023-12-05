package Characters;

import Activity.Actions;
import Enums.Gender;
import Enums.HappinessLevels;
import Interfaces.Flyable;

import java.util.Objects;

public class Witch extends Character implements Flyable {
    private String name;
    private int flyheight;
    public Witch(String name, Gender gender, double weight, double height){
        super(name, gender, weight, height);
    }
    public Witch(String name, Gender gender, double weight, double height, int flyheight){
        super(name, gender, weight, height);
        this.flyheight = flyheight;
    }
    @Override
    public void fly(int flyheight) {
        this.flyheight = 10;
        System.out.println("пролетает ведьма");
    }
    public void flyPastTheWindow(int flyheight){
        Uncle uncle = new Uncle("Дядя Юлиус", Gender.MALE, 70, 185, HappinessLevels.DEFAULT.getHappinessLevel());
        this.flyheight = 10;
        System.out.print("мимо окна пролетает ведьма"+", это он "+ Actions.DONTDENY.getDescription((Character) uncle)+", но... ");
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
        Witch witch = (Witch) object;
        return Objects.equals(name, witch.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
