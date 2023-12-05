package Characters;

import Enums.Day;
import Enums.Gender;
import Enums.HappinessLevels;
import Interfaces.Impressionable;

import java.util.Objects;

public class Uncle extends Character implements Impressionable {
    private int happinessLevel;
    private String name;
    public Uncle(String name, Gender gender, double weight, double height, int happinessLevel) {
        super(name, gender, weight, height);

        this.happinessLevel = HappinessLevels.HIGH.getHappinessLevel();

    }

    public void beHappy(Day day){
        if(day.getDescription()=="вчера "){
            String happy = "был весел и счастлив ";
            System.out.println(happy);
        }
        if(day.getDescription()=="сегодня "){
            String happy = "Дядя Юлиус повторял, что счастлив и не забудет этих дней. ";
            System.out.println(happy);
        }
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public int getHappinessLevel(){
        return happinessLevel;
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
        Uncle uncle = (Uncle) object;
        return Objects.equals(name, uncle.name);
    }

    @Override
    public String toString() {
        return name;
    }

    public void beStubborn() {
        happinessLevel-=1;
        System.out.print("Дядя Юлиус гнул свое");
    }

    public void beMarriaged(Princess princess){
        if (equals(princess)){
            System.out.println("Принцесса вышла замуж за Дядю Юлиуса");
        }
    }
}
